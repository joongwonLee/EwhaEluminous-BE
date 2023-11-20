package com.eluminous.backend.domain.thesis.controller;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;
import com.eluminous.backend.domain.thesis.service.ThesisService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
public class ThesisController {

//    @Autowired
//    private ThesisService thesisService;

    /**
     * 논문1
     */
    String title1 = "물 전기 분해에 의한 수소 생산";
    String[] author1 = new String[]{"박지현"};
    String[][] content1 = new String[][]{
            {"1. 개요"},
            {"2. 물 전기 분해에 의한 수소 생산의 주요 반응",
            "2-1. 물 전기 분해에 의한 수소/산소 생산 총 반응",
            "2-2. 수소 발생 반응(Hydrogen Evolution Reaction, HER)",
            "2-3. 산소 발생 반응(Oxygen Evolution Reaction, OER)"},
            {"3. 물 전기 분해 기술의 종류",
            "3-1. 양이온교환막 수전해(Proton Exchange Membrane, PEM)",
            "3-2. 음이온교환막 수전해(Anion Exchange Membrane, AEM)",
            "3-3. 알칼라인 수전해(Alkaline Electrolysis, AEC)",
            "3-4. 고온 고체산화물 수전해(High-temperature Solid Oxide water Electrolysis, SOE)"}
    };
    String[][] text1 = new String[][]{
            {"수소는 화석 연료의 대체물로서, 깨끗하고 재생 가능한 에너지로 부상했다. 현재 수소의 상업적 규모의 수요를 충족시키기 위한 수소의 효율적인 생산은 핵심적인 과제로 떠올랐다. 수소를 생산할 수 있는 다양한 방법 중 촉매 또는 전기 촉매를 사용하는 물 전기 분해는 에너지 변환 및 저장 측면에서 효율적인 수소 생산을 달성할 수 있다. 활성, 안정성 및 저가의 촉매 또는 전기 촉매의 개발은 본 프로젝트의 초점이 되는 실용적인 물 분해로부터 원하는 전기 촉매 수소 생산을 달성하기 위한 필수 전제 조건이다. 해당 프로젝트에서는 물 전기 분해에 의한 수소 생산의 기본적인 반응 및 방법을 알아볼 것이다. 또한 어떤 전해질을 사용하는지, 어떤 이온이 이동하는지에 따른 여러가지 전기 분해 기술법, 그리고 수소 생성 반응 (HER) 및 산소 생성 반응(OER)에서의 전기 촉매 사용 등을 살펴볼 것이다. 마지막으로, 물 전기 분해로부터 수소의 효율적인 생산을 위한 수전해 기술과 현재까지 연구 내용과 향후 관점 또한 살펴볼 것이다.\n" +
                    "\n" +
                    "수소는 가벼운 무색, 무취의 기체이며, 자연 상태에서는 독립적으로 존재하지 않고 여러가지 다른 원소와 결합한 화합물의 형태로 지구상에 존재한다. 따라서 에너지원으로 사용하기 위해서는 별도의 생산 과정을 거쳐야만 한다. 청정한 에너지이면서 생산, 저장 및 운반이 보다 안전한 수소 에너지는 다양한 분야에서 오랜 기간 동안 사용되어 왔다. 수소의 생산 방법으로는 수전해, 화학연료의 개질, 생물학적 방법, 천연가스 열분해, 열화학 사이클 이용 등이 있다. 이 중 수전해는 태양광, 풍력 에너지 등 재생에너지를 통해 물을 전기분해하여 고순도의 그린 수소를 추출하는 것을 뜻한다. 수소를 추출하는 과정에서 이산화탄소를 배출하지 않기 때문에, 친환경 에너지 기술로서 각광받고 있다.\n" +
                    "\n" +
                    "수소 저장 기술로는 High pressure gas cylinders (고압가스 저장), Liquid Hydrogen (액체 저장), Solid Metal hydride (고체 저장), Chemical (화학 저장) 등이 있다.\n"},
            {"",
                    "H2O (l) -> H2 (g) + 1/2O2 (g)\n" +
                    "\n" +
                    "물을 전기분해하여 수소를 얻는 기본 원리는 수소 원자(H) 2개와 산소 원자(O) 1개로 구성된 물에 전기 에너지를 가하게 되면 양극에는 양이온을 띤 산소 원자가, 음극에는 음이온을 띤 수소 원자가 붙으며 원자가 분리되는 것이다. 따라서, 음극에 모인 원자를 모으면 고순도의 수소만을 추출할 수 있다.\n",
                    "HER은 물이 음극에서 환원되는 반전지 반응으로, 수소를 생산한다.\n" +
                            "\n" +
                            "Step1 : Volmer step to produce adsorbed hydrogen \n" +
                            "\n" +
                            "H+ + e- = Had\n" +
                            "\n" +
                            "Step 2 : Heyrovsky step to proceed HER \n" +
                            "\n" +
                            "H+ + e- + Had = H2\n" +
                            "\n" +
                            "Step 3 : Tafel step to produce H2\n" +
                            "\n" +
                            "2Had = H2",
                    "물이 양극에서 산화되는 또 다른 반전지 반응으로, 산소를 생산한다. \n" +
                            "\n" +
                            "OER 반응은 양극에서 발생하며, HER에 비해 현저히 높은 과전위를 요구하는 4-전자 전이 과정을 포함한다. OER은 전기화학적 물 분할의 전체 효율을 개선하는 데 있어 주요 병목 현상이기 때문에 활동 제한을 효과적으로 줄일 수 있는 고효율의 OER 촉매를 찾는 것이 필수적이다. 최근 연구에 따르면, OER 전기 촉매의 합리적인 설계를 위한 OER 메커니즘 이해에 대한 개발이 진행되었다. 논의된 바에 따르면, OER은 기존의 음이온교환막을 이용한 물 전기분해(Anion Exchange Membrane, AEM)과 격자 산소 매개 메커니즘(Lattice Oxygen-mediated Mechanism, LOM), 두 가지 다른 메커니즘을 통해 진행될 수 있다.\n" +
                            "\n" +
                            "OER 전기 촉매에는 귀금속 (noble-metal) 기반 전기 촉매와 비귀금속 (non-noble metal) 기반 전기 촉매, 두 가지 유형이 있다. 비귀금속 기반 전기 촉매의 경우, 특히 용해 저항이 큰 산성 전해질에서 Ru, Ir 기반 촉매가 다른 금속에 비해 OER에 대한 최첨단 전기 촉매로 여겨진다.  가격을 낮추고 전기 촉매 활성 및 안정성을 향상시키며, 산성 매질에서의 용해 저항성을 강화하기 위해서 촉매 조성, 구조 및 형태를 엔지니어링하고 최적화하는 여러가지 방법이 있다. Ir나 Ru 이외에도 Rh, Au, Pt 및 Pd 등을 기반으로 만들어진 촉매와 같은 다른 귀금속이 OER, HER 및 산소 환원 반응(Oxygen Reduction Reaction, ORR)에 대해 뛰어난 성능을 보이는 2작용 또는 3작용성의 전기 촉매로 개발되었다. 비귀금속 기반 촉매의 경우, oxide 및 (oxy)hydroxide 전기 촉매가 OER, 특히 Ni-Fe을 기반으로 한 oxide 및 (oxy)hydroxide에 대해 많은 관심을 받았다. 그 중 일부는 일반적으로 산업 규모 개발에 가장 많이 사용되는 OER 촉매로 여겨진다.\n"},
            {"",
                    "양이온교환막 수전해는 양이온교환막을 전해질로 이용해 물을 전기분해하는 방식으로, 주로 수소이온이 이동할 수 있는 나피온(Nafion) 등의 양이온교환막을 전해질로 이용한다. PEM 수전해는 백금 촉매와 양이온교환막을 사용해 높은 전류밀도로 작용될 수 있으며, 에너지 효율이 높기 때문에 장치의 소형화가 가능하다. 그린수소 생산에 가장 적합한 수전해 방식으로 화합물 없이 물만을 원료로 사용해 생산한 수소의 순도가 매우 높다. 백금 촉매와 양이온교환막의 단위 가격이 높은 것이 단점이지만, 기술 개발로 PEM의 가격이 낮아지고 있는 추세이다. PEM 수전해에서는 양극으로 공급된 물이 수소 양성자와 산소로 분해되고, 수소 양성자는 양이온교환막을 통해 음극으로 이동한 뒤, 전자와 결합해 수소 분자를 형성한다.\n" +
                            "\n" +
                            "Anode : 2H2O -> O2 + 4H+ + 4e-\n" +
                            "Cathode : 4H+ + 4e- -> 2H2",
                    "음이온교환막 수전해는 음이온교환막을 전해질로 이용해 물을 전기분해하는 방식이다. AEM은 AEC와 같이 저가의 촉매를 사용하기 때문에 수소 생산 비용을 낮출 수 있고, 낮은 전력에서도 잘 작동하며, 압축기 없이도 고압에서 작동이 가능하여 효율 및 순도가 높다는 장점이 있다. 하지만, 연구가 오래 진행되지 않은만큼 기술력에 대한 한계가 있어 촉매와 음이온교환막의 성능 및 신뢰도가 높지 않다는 단점이 있다.",
                    "알칼라인 수전해는 알칼리성 전해액을 이용해 물을 전기분해 하는 방식이다. AEC는 수전해 방법 중 가장 상용화된 기술으로, 연구가 오래 진행된 만큼 안정적이라는 장점이 있다. 또한 비금속 촉매를 사용하기 때문에 단가가 저렴하고, 수소 생산 구조가 단순해 대용량 생산에 적합하며 내구성이 높다. 그러나 35%에 이르는 알칼리 전해액의 농도를 유지하기 위해 전해액을 계속 보충해야 하고, 알칼리 성분으로 인한 부식 문제 및 낮은 전류밀도 효율, 고압 운전의 어려움 등이 아직 해결하지 못한 단점으로 남아있다.",
                    "고온 고체산화물 수전해는 고체산화물 전해질을 이용해 800℃ 이상의 고온 수증기를 전기분해하여 수소를 생산하는 기술이다. 고체산화물 전해질을 사용하기 때문에 부식에 강하고, 전해액을 보충할 필요가 없어 유지 및 보수가 쉽다는 장점이 있다. 단, 수증기를 가열하기 위한 추가적인 열 에너지가 필요하고, 800℃ 이상의 고온을 견딜 충분한 내구성을 지닌 고체전해질에 대한 연구가 부족하다는 단점이 있다.\n" +
                            "\n" +
                            "Alkaline과 SOE 수전해에서는 물이 음극으로 공급되고 수소 분자와 hydroxide 이온을 형성하고, hydroxide 이온은 전해질을 통과해 양극에서 산소를 형성한다.\n" +
                            "\n" +
                            "Anode : 4OH- -> O2 + 2H2O + 4e-\n" +
                            "Cathode : 2H2O + 2e- -> 2OH- + H2"}
    };
    String[][] references1 = new String[][] {
            {"이신근 외 5인, “수소생산 기술동향”, 한국에너지기술연구원, Clean Technol., Vol.23, No.2, 2017, pp.121-132.", ""},
            {"이지현 외 1인, 기술, “경제성을 고려한 최적 친환경 수소생산 기술 선정 방법”, New & Renewable Energy, Vol. 19, No.2, 2023, pp.1-10.", ""},
            {"황갑진 외 1인, “물 전기분해에 의한 수소제조 기술”, Membrane Journal, Vol.27, No.6, 2017, pp.477-486.",""},
            {"Shan Wang et al. “Hydrogen production from water electrolysis: role of catalysts”, Nano Convergence, 2021, pp.1-23.",""},
            {"Jo, J.H., “Development of various water electrolysis technologies for the production of green hydrogen”, KEPRI NEWS, 2023, pp.28-31.", ""},
            {"“[에너지 백과] 수전해,” SK E&S, 2023.05.15 수정, 2023.11.18 접속,","https://media.skens.com/4952."},
            {"“Hydrogen supply,” International Energy Agency (IEA)","https://www.iea.org/energy-system/low-emission-fuels/hydrogen"}
    };

    /**
     * 논문2
     */
    String title2 = "물 전기 분해에 의한 수소 생산";
    String[] author2 = new String[]{"박지현"};
    String[][] contents2 = new String[][]{
            {"목차1"},
            {"목차2", "목차2-1", "목차2-2", "목차2-3"},
            {"목차3", "목차3-1", "목차3-2", "목차3-3", "목차3-4"}
    };
    String[][] text2 = new String[][]{
            {"개요"},
            {"물 전기 분해에 의한 수소 생산의 주요 반응",
                    "물 전기 분해에 의한 수소/산소 생산 총 반응",
                    "수소 발생 반응(Hydrogen Evolution Reaction, HER)",
                    "산소 발생 반응(Oxygen Evolution Reaction, OER)"},
            {"물 전기 분해 기술의 종류",
                    "양이온교환막 수전해(Proton Exchange Membrane, PEM)",
                    "음이온교환막 수전해(Anion Exchange Membrane, AEM)",
                    "알칼라인 수전해(Alkaline Electrolysis, AEC)",
                    "고온 고체산화물 수전해(High-temperature Solid Oxide water Electrolysis, SOE)"}
    };
    String[][] references2 = new String[][] {
            {"이신근 외 5인, “수소생산 기술동향”, 한국에너지기술연구원, Clean Technol., Vol.23, No.2, 2017, pp.121-132.", ""},
            {"이지현 외 1인, 기술, “경제성을 고려한 최적 친환경 수소생산 기술 선정 방법”, New & Renewable Energy, Vol. 19, No.2, 2023, pp.1-10.", ""},
            {"황갑진 외 1인, “물 전기분해에 의한 수소제조 기술”, Membrane Journal, Vol.27, No.6, 2017, pp.477-486.",""},
            {"Shan Wang et al. “Hydrogen production from water electrolysis: role of catalysts”, Nano Convergence, 2021, pp.1-23.",""},
            {"Jo, J.H., “Development of various water electrolysis technologies for the production of green hydrogen”, KEPRI NEWS, 2023, pp.28-31.", ""},
            {"“[에너지 백과] 수전해,” SK E&S, 2023.05.15 수정, 2023.11.18 접속,","https://media.skens.com/4952."},
            {"“Hydrogen supply,” International Energy Agency (IEA)","https://www.iea.org/energy-system/low-emission-fuels/hydrogen"}
    };

    /**
     * 논문3
     */

    /**
     * 논문4
     */

    /**
     * 논문5
     */

    /**
     * 논문6
     */

    /**
     * 논문7
     */

    /**
     * 논문8
     */

    /**
     * 논문9
     */

    /**
     * 논문10
     */

    /**
     * 논문11
     */

    /**
     * 논문12
     */

    /**
     * 논문13
     */

    /**
     * 논문14
     */

    /**
     * 논문15
     */

    /**
     * 논문16
     */

    /**
     * 논문17
     */

    /**
     * 논문18
     */

    /**
     * 논문19
     */

    /**
     * 논문20
     */



//    private List<ThesisDto> thesisList = new ArrayList<>() {{
//        add(new ThesisDto());
//        add(new ThesisDto());
//        add(new ThesisDto());
//        add(new ThesisDto());
//        add(new ThesisDto());
//        add(new ThesisDto());
//    }};

    @GetMapping({"/thesis"})
    public List<ThesisDto> showAllThesis() {
        String title = "에너지 신기술 및 동향";
        String[] author = new String[]{"최서정"};
        String[][] contents = new String[][]{{"목차1"}, {"목차2", "목차2-1", "목차2-2"}, {"목차3", "목차3-1", "목차3-2"}, {"목차4"}, {"목차5"}};
        String[][] text = new String[][]{{"mokcha1"}, {"", "mokcha2-1", "mokcha2-2"}, {"", "mokcha3-1", "mokcha3-2"}};
        String[][] references = new String[][]{{"참고문헌1", "참고문헌1링크"}, {"참고문헌2", "참고문헌2링크"}};
        ThesisDto testDto = new ThesisDto(1, "배터리", title, author, contents, text, references);
        String title2 = "바이오  신기술 및 동향";
        String[] var10000 = new String[]{"최서정2"};
        String[][] var14 = new String[][]{{"목차1"}, {"목차2", "목차2-1", "목차2-2"}, {"목차3", "목차3-1", "목차3-2"}, {"목차4"}, {"목차5"}};
        var14 = new String[][]{{"mokcha1"}, {"", "mokcha2-1", "mokcha2-2"}, {"", "mokcha3-1", "mokcha3-2"}};
        var14 = new String[][]{{"참고문헌1", "참고문헌1링크"}, {"참고문헌2", "참고문헌2링크"}};
        ThesisDto testDto2 = new ThesisDto(2, "바이오", title, author, contents, text, references);
        List<ThesisDto> lst = new ArrayList();
        lst.add(testDto);
        lst.add(testDto2);
        return lst;
    }

//    @GetMapping("/thesis/category/{category}")
//    public List<ThesisDto> showThesisByCategory(@PathVariable("category") String category) throws Exception {
//
//        log.info("{}", category);
//        return thesisService.selectByCategory(category);
//    }
//
//    @GetMapping("/thesis/title/{title}")
//    public List<ThesisDto> showThesisByTitle(@PathVariable("title") String title) throws Exception {
//
//        return thesisService.selectByTitle(title);
//    }
}
