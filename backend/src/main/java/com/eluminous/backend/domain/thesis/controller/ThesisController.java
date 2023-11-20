package com.eluminous.backend.domain.thesis.controller;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
@CrossOrigin("*")
public class ThesisController {



    /**
     * 논문 형식
     */

    String title = "";

    String category = "";
    String[] author = new String[]{};
    String[][] contents = new String[][]{

    };
    String[][] text = new String[][]{

    };
    String[][] references = new String[][] {

    };

    /**
     * 논문1
     */
    String title1 = "물 전기 분해에 의한 수소 생산";
    String category1 = "Battery";
    String[] author1 = new String[]{"박지현"};
    String[][] contents1 = new String[][]{
            {"1. 개요"},
            {"2. 물 전기 분해에 의한 수소 생산의 주요 반응",
                    "2-1. 물 전기 분해에 의한 수소/산소 생산 총 반응",
                    "2-2. 수소 발생 반응(Hydrogen Evolution Reaction, HER)",
                    "2-3. 산소 발생 반응(Oxygen Evolution Reaction, OER)"},
            {"3. 물 전기 분해 기술의 종류",
                    "3-1. 양이온교환막 수전해(Proton Exchange Membrane, PEM)",
                    "3-2. 음이온교환막 수전해(Anion Exchange Membrane, AEM)",
                    "3-3. 알칼라인 수전해(Alkaline Electrolysis, AEC)",
                    "3-4. 고온 고체산화물 수전해(High-temperature Solid Oxide water Electrolysis, SOE)"},
            {"4. 수소 기술의 미래 전망"}
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
                            "Cathode : 2H2O + 2e- -> 2OH- + H2"},
            {"물 전기 분해는 두 에너지 매체인 전기와 수소를 기반으로 하는 미래의 에너지 모델에서 핵심역할을 할 수 있다. 그 이유는 수력, 풍력, 태양광 에너지와 같은 재생 가능 에너지원을 쉽게 청정 지속 가능한 수소를 생산하는 물 전기 분해 공정에 연결할 수 있기 때문이다.\n" +
                    "\n" +
                    "현재 상업적으로 생산되고 있는 전해조(electrolyzer)는 알칼리 electrolyzer와 PEM electrolyzer이다. 두 방법 모두 신뢰도가 높고 안전하다고 평가받고 있으나, 수소 경제에서 요구되는 대규모의 수소 공급을 충족하기 위해서는 이런 규모보다 훨씬 커야만 한다. 알칼리 전해조, 특히 PEM electrolyzer의 투자비와 원가를 현저히 낮출 수 있는 기술이 개발되어야 한다. \n" +
                    "\n" +
                    "이러한 관점에서 고체 산화물 electrolyzer(SOE)의 개발이 최근에 크게 주목 받고 있다. SOE는 고온 수증기를 전기 분해하여 수소를 생산하는데 전해에 필요한 에너지의 상당부분을 고가의 전기 대신 고열로써 공급할 수 있으므로 원가 절감이 가능할 것으로 기대되고 있다. 그러나 SOE는 아직 R&D 단계에 있어 성능과 수명 개선을 위하여 많은 노력이 필요하다. \n" +
                    "물로부터 지속 가능한 수소를 생산하는 기술은 재생 가능한 에너지를 배전망에 통합하는 수단 혹은 독립적인 수단으로써 유망하다. 여러 통합 방법이 가능하며, 방법에 따라 생산된 수소의 원가와 재생 가능한 특성이 달라지게 된다. 여러 가지 통합 관련 실증 프로젝트의 결과에 의하면 물 전기 분해는 미래의 재생 가능 수소 생산의 주된 방법이 되기에 적합하다고 판단된다."}
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
    String title2 = "전도성 고분자 기반 바이오센서";
    String category2 = "NewMaterial";
    String[] author2 = new String[]{"이현주"};
    String[][] contents2 = new String[][]{
            {"1. 개요"},
            {"2. Conductive Polymer(전도성 고분자)의 배경", "2-1. polymer(고분자)란?", "2-2. conductive polymer(전도성 고분자)란?"},
            {"3. Conductive polymer(전도성 고분자)의 용도", "3-1. Electrochemical sensors", "3-2. Tactile sensor (artificial skin)"},
            {"4. 발전 방향에 대한 고찰과 결론"}
    };
    String[][] text2 = new String[][]{
            {"Conductive Polymer(전도성 고분자), CP는 독특한 전기적, 광학적 특성을 가지고 있다. CP는 일부 금속 및 무기 반도체의 재료 특성과, 일반적으로 기존 고분자의 특징인 유연성, 가공 및 합성의 용이성과 같은 특성을 함께 지니고 있다. 이런 특성을 바탕으로 CP에 대한 연구는 활발히 진행되고 있다. 전도성 고분자는 전기를 전도하는 능력을 갖추고 있다. 평소에는 절연체처럼 행동하지만, 전기적 혹은 화학적 자극에 의해 전기를 전달할 수 있다. 이런 특성으로 인해 다양한 분야에서 활용될 수 있는 가능성을 보여주고 있다. 대표적인 예시로, Electrochemical sensors를 들 수 있는데, 이는 화학적 반응을 감지해 전기적인 신호로 변환하는 역할을 한다. 이런 센서는 의학, 환경 및 산업 분야에서도 사용되고 있다. 또한 Tactile sensor는 사람의 피부와 유사한 특성을 갖춰 터치 및 압력을 감지하는데 사용될 수 있다. 마지막으로 Thermal sensors는 온도 변화를 감지하고 전기적 신호로 변환해 측정하는데 사용된다. 이처럼 Conductive Polymer(전도성 고분자), CP는 우리의 일상과 기술의 발전에 혁신적인 영향을 미치고 있고, 앞으로 그 활용 범위는 더욱 넓어질 것으로 예상된다."},
            {"",
                    "Polymer(고분자)는 단백질, 핵산, 다당류로 구성된 생명의 기본 구성 요소부터 자동차, 건설, 운송산업, 플라스틱 장난감 및 상용 제품에 이르기까지 우리 존재와 우리를 둘러싼 모든 것의 필수적인 부분을 형성한다. 이런 polymer(고분자)는 반복되는 단위 구조인 monomer가 연결되어 형성된 대규모 분자다. 이는 일련의 monomer단위가 반복되어 연결된 선형 또는 가지 형태로 구성된다. 이는 형태, 크기, 성질이 매우 다양하기에 어떤 형태를 가지고 어떤 구조를 가지는 가에 따라 굉장히 다양한 특성을 나타낸다. 이들은 주로 이어진 고분자 사슬을 형성함으로써 특성을 발휘하는데, 고분자 사슬의 구조와 길이는 이들의 물성, 가용성, 강도 및 유연성을 결정한다. 예를 들어, 선형구조는 유연성을 부여하고, 교차 링크된 3차원 네트워크는 강도와 경도를 증가시키는데 중요한 역할을 한다. 또한 고분자는 다양한 화학적 반응을 통해 형성된다. 이들은 중합 과정을 통해 만들어지며, 중합체 과정은 monomer들이 서로 결합해 긴 고분자 체인을 형성하는 반응이다. 중합체의 특성은 사용된 monomer의 종류와 비율, 중합 반응 조건 등에 의해 결정된다. 따라서 이런 고분자들은 일상생활 뿐만 아니라, 산업과 과학 분야에서도 광범위하게 활용될 수 있다.",
                    "전도성 고분자 복합재(conducting polymer composites, CPC)라 불리는 새로운 종류의 재료가 탄생했다. CPC는 생체 전자 공학을 포함한 여러 분야에서 흥미롭고 새로운 응용 분야를 여는 것으로 나타났다. CPC는 일반적으로 하나 이상의 비전도성 고분자와 polymer matrix 전체에 분포된 전도성 충진재의 조합으로 구성된다. CPC의 전도도는 주어진 중량 백분율에서 충진재 네트워크에 의해 형성된 CPC의 전도성 단계를 설명하는 percolation threshold의 영향을 받는다. 특정 농도 미만의 충진재 로딩의 경우, 충진재 입자는 더 이상 서로 물리적 접촉을 유지하지 않아 전도에 필요한 전자 전달을 위한 연속 경로를 제공하지 않고 결과적으로 CPC는 전도성(삼출 임계값)이 갑자기 떨어진다. CPC의 단점 중 일부는 처리 조건에 대한 의존성이 높고, 기계적 불안정성 및 전도성 물질 위의 절연된 표면층을 포함하는 것이다. P형 도펀트(산화제)와 결합된 결정 질 폴리 아세틸렌 필름과 같은 유기 전도성 폴리머의 금속 전도성은 1977년 Shirakawa, MacDiarmid 및 Heeger에 의해 처음 발견되었다. 곧 n형 도펀트(환원제)가 유사한 효과를 나타내는 것으로 밝혀졌다. (Chiang et al., 1978) 이런 발견에 따라 고유 전도성 폴리머 (ICP)라고도 알려진 새로운 종류의 유기 전도성 polymer가 확립되었다. ICP에는 산화 또는 환원을 통해 양전하 또는 음전하를 얻을 수 있는 단량체가 포함되어 있으며 이는 결국 ICP의 전기 전도도에 기여한다. ICP의 예로는 PA, PPY, PT, PANI가 있다. 이런 ICP와 CPC는 기계적 안정성과 가공성을 향상시키기 위해 이들의 혼합도 연구되었다. 생체의학 응용 분야를 위해서 개발된 conductive polymer(전도성 고분자) 기반 센서는 생화학적 성분의 존재 여부 등 관심 매개 변수에 따라 달라진다. CP는 효율적이고 실시간이며 다양한 바이오센서를 설계하는데 유용하고 우수한 전기적, 화학적, 기계적 특성을 보유하고 있다. 하나 이상의 CP가 사용하는 특정 유형의 감지 메커니즘을 기반으로 한 여러 리뷰 및 연구는 다양하게 진행되고 있다.",
            },
            {"",
                    "금속 고분자가 발견(Shirakawa et al., 1977)되고 난 후, CP(전도성 고분자)는 신호를 측정하고 증폭하기 위한 전기화학적 바이오센서의 변환기로 광범위하게 사용되었다. CNT(탄소 나노 튜브) 및 금속 나노 입자는 전기 화학 센서에서 전극의 고분자 복합 기반 기능화를 위해 가장 보편적으로 사용되는 충전 재료 중 일부이다. 다양한 유형의 전기화학 바이오센서 개발에 가장 일반적으로 사용되는 ICP로는 PANI, PPy 및 PT가 있다. 낮은 비용, 확장성, 쉬운 처리 능력 및 넓은 표면적, 조절 가능한 수송 특성 및 화학적 특이성과 같은 재료 특성으로 인해 전도성 고분자는 전기화학 감지에 응용할 수 있었다. 공액 CP는 폴리머 사슬에 단일 결합과 이중 결합이 교대로 포함되어 있어 전하 운반체 역할을 하는 비편재화된 전자가 형성된다. 바이오센서의 감도와 선택성을 향상시키기 위해 산화환원 매개체는 분산되거나 도펀트로 첨가되거나 폴리머 매트릭스에 화학적으로 접합된다. 따라서 공액 CP는 생체 인식 층과 최종 전극 사이의 전자 전달을 중재한다. 더욱이, conjugated backbone of CPs는 다양한 화학적 부분에 대한 부착(고정화)을 가능하게 해 그 특성을 조절할 수 있다. 그림1은 비오틴 결합 DNA (biotin-conjugated DNA)분자를 감지하는 데, 사용되는 avidin-functionalized PPy 나노 와이어를 보여준다. 중합된 필름을 기반으로 한 Electrodeposition procedure (전류를 이용해 전도성 표면 상에 금속 또는 합금을 증착하는 과정으로 전기 화학 반응을 통해 기판 상에 코팅 또는 층의 형성을 설명하고, 표면에 박막이나 금속 층을 만들기 위해 전기 분해를 사용하는 것을 의미한다.)는 거대분자를 고정하는 데 사용되는 일반적인 기술이다. 이 기술을 통해 재현성을 높고 매우 얇은 CP 코팅층을 얻을 수 있다. 자기 고정화(Magnetic immobilization)는 바이오 센싱 연구에 중요한 기술 중 하나이다. 자성 바이오 센서는 기본적으로 자기장을 측정하는 자기 센서(magnetic sensor)를 기반으로 생물 시료에 포함되어 있는 특정 단백질, DNA, 또는 세포 등의 특정 대상이나 인체의 건강 상태를 판별할 수 있는 생물 지표를 선별적으로 측정하는 센서다. 이 센서에서 중요한 부분은 바로 자성이 없는 또는 매우 미약한 생물 분자를 어떻게 자기 센서로 특정할 수 있는지를 해결해야 한다. 이를 해결하기 위한 합리적으로 편리한 방법은 자성 물질을 원하는 대상에 부착시키는 것이다. 즉, 우리가 측정하고자 하는 단백질 또는 세포 등의 생체 물질에 자성 나노 입자를 부착시키고, 여기서 발생하는 자기장을 자성 바이오 센서를 이용해 측정함으로써 생체 물질의 유무뿐만 아니라 정량적인 분석이 가능하게 된다. ",
                    "피부는 우수한 촉각 센서이다. 외부의 자극에 따라 진피에 생성된 응력 또는 온도에 따라 수용기(또는 뉴런)들은 전기적인 펄스의 형태로 뇌에 신호를 전달한다. 피부에 자극이 가해지면(즉, 인장률 ε이 증가하면) 응력 σ가 순간적으로 급격히 증가하지만 점성에 의한 응력이 이완되면서 탄성에 의한 응력만 남게 된다. 이때, 순간적인 응력과 평형상태의 응력은 인장률에 비례한다는 것을 좌측 그래프를 통해 알 수 있다. 따라서 30년간 의료 로봇 공학 및 특정 수술 절차 분야에서 유용한 광범위한 촉각 정보를 제공할 수 있는 피부와 유사한 센서를 개발하기 위해서 엄청난 노력을 기울이고 있다. 촉각 감지를 위한 piezoelectric polymer인 polyvinylidene fluoride (PVDF)의 사용은 Dario와 de Rossi(1985)에 의해 처음 보고 되었으며, 이후 촉각 감지를 위해 PVDF를 사용한 여러 연구가 이어졌다. 압저항 기반 촉각 감지에 사용되는 두 가지 널리 사용되는 메커니즘은 저항성 금속 기반 감지와 전도성 폴리머 기반 감지로 크게 분류할 수 있다. 저항성 금속 기반 센서에 대한 일반적인 접근 방식에는 응력/전단력을 감지할 수 있는 압저항 금속으로 구성된 각 감각 요소가 있는 유연한 촉각 센서 배열이 포함된다. 생물학적 피부의 기능성에서 영감을 얻은 유연한 폴리머 기판에 있는 박막 압저항 금속 기반 센서를 기반으로 한 최초의 \"스마트 스킨\" 개발을 보고하였고, 접촉력, 상대 경도, 열 전도성 및 온도를 감지할 수 있는 다중 모드 촉각 센서 배열을 개발했다. (그림 3). 감지 스킨은 유연한 폴리이미드(Kapton) 기판에 배열된 센서 노드 배열로 구성된다. 각 노드는 열전도도 측정 장치, 온도 측정 장치, 경도와 접촉력을 측정할 수 있는 금속 스트레인 게이지가 있는 멤브레인 2개 등 4개의 감지 요소로 구성된다. 같은 그룹은 나중에 다중 모드 센서가 질감 분류 및 기타 감각 데이터를 기반으로 물체를 식별함으로써 인간 피부의 일부 기능을 모방할 수 있음을 입증했다. 일반적인 전도성 폴리머 기반 촉각 센서는 촉각 정보를 감지할 수 있는 유연한 전도성 젤 또는 엘라스토머와 센서 판독을 위한 패턴 전극 세트로 구성된다. Papakostaset al.은 Ag 충전 열가소성 고분자의 스크린 인쇄 트레이스 사이에 반도체 필름을 끼워 제작된 힘 센서를 제안했다. 또한 Shimojoet al.은 압력 관련 변형을 감지할 수 있는 전도성 고무를 사용해 유연한 촉각 감지 배열을 제작했다. Someyaet al.은 폴리이미드 또는 폴리(에틸렌나프탈레이트) 및 유기 트랜지스터 기반 전자 장치를 가공해 제작된 유연한 그물 모양의 압력 및 온도 센서를 개발했다. 최근에는 보다 민감하고 정교한 촉각 센서로의 발전을 추구하고 있고, 고해상도 및 다중 감지 기능, 유연성과 신축성의 향상, 신속한 응답과 에너지 효율성, 다각도 및 다중 센싱에 대한 기술적 발전을 원하고 있다. 이렇게 발전된 기술은 로봇공학에선 인간과 상호작용하는 로봇에 이러한 센서를 탑재하여 보다 정교한 작업과 안전성을 제공하는 데 활용될 것으로 예상된다. 의료 분야에서는 보다 정확하고 신속한 진단을 위해 의료 장비에 적용될 것으로 예상되고, 가상현실과 증강현실 분야에서도 사용자의 터치 및 감각 경험을 향상시키는 데 활용될 수 있다는 가능성이 무궁무진한 분야이다.",
            },
            {"Conductive Polymers(CP)는 우리의 삶과 기술적 발전에 혁명을 일으키고 있는 놀라운 재료 중 하나이다. 전도성, 유연성, 그리고 다양한 센서 응용 가능성을 포함한 그 특성들은 생명과학, 의료, 로봇공학 등 다양한 분야에서 혁신적인 해결책으로 자리 잡고 있다. CP를 기반으로 한 전기화학 센서는 화학적 반응을 신속하게 감지하여 다양한 분야에서 사용되고 있고 인간 피부와 유사한 특성을 가진 인공 피부인 촉각 센서는 의료 및 로봇 분야에서 특히 큰 관심을 받고 있다. 앞으로도 CP 기술은 유연성과 정교성을 높이며, 더욱 다양한 분야에 적용될 가능성이 크기 때문에 CP의 다양한 특성과 끊임없는 기술 발전은 현재와 미래의 기술적 혁신에 중요한 역할을 할 것으로 예상한다. "}
    };
    String[][] references2 = new String[][] {
            {"Nambiar, Shruti, and John TW Yeow. &quot;Conductive polymer-based sensors for biomedical", ""},
            {"applications.&quot; Biosensors and Bioelectronics 26.5 (2011): 1825-1832.", ""},
            {"Kolesar, E.S., Reston, R.R., Ford, D.G., Fitch, R.C., 1992. J. Robot. Syst. 9, 37–63.",""},
            {"Kranz, C., Wohlschlager, H., Schmidt, H.L., Schuhmann, W., 1998. Electroanalysis 10, 546–552.",""},
    };

    /**
     * 논문3
     */
    String title3 = "탄성중합체의 개발 현황 및 응용 분야\n Development of Flexible and Stretchable Polymer Semiconductors and Sensors\n";
    String category3 = "NewMaterial";
    String[] author3 = new String[]{"최서정"};
    String[][] contents3 = new String[][]{
            {"1. 서론"},
            {"2. Supramolecular polymerization", "2-1. formation mechanism", "2-2. characteristics of C5-symmetric corannulene"},
            {"3. 사례 1: IDTBT(indacenodithiophene-co-benzothiadiazole) polymer\n"},
            {"4. 사례 2: EGaln*:PSS"},
            {"5. 결론"}
    };
    String[][] text3 = new String[][]{
            {"Over the past decade, significant attention and progress in polymerization have greatly impacted the design of functional soft materials. Especially, developing intrinsically stretchable polymer semiconductor is advantageous for wearable and implantable electronics applications. \n" +
                    "\n" +
                    "First, to understand the principles of supramolecular polymerization, the realization of chain-growth polymerization is done by designing metastable monomers with a shape-promoted intramolecular hydrogen-bonding network.\n" +
                    "\n" +
                    "Next, near-amorphous IDTBT(indacenodithiophene-co-benzothiadiazole) polymer shows potential as a model compound for next generation intrinsically stretchable high-performance conjugated polymer.\n" +
                    "\n" +
                    "Finally, materials and manufacturing methods of EGaIn(Eutectic-gallium-indium particle) is reported that allows large-area multi-layered patterning of ‘polystyrene sulfonate (PSS)-attached EGaIn’ thin-film. By demonstrating in stretchable display, it validated the versatility and reliability of this manufacturing strategy for soft electronics.\n" +
                    "\n" +
                    "To enable the aforementioned applications, high-resolution, large-area, and high-performance devices should be made, so that it can meet the rising demand for next-generation wearable healthcare devices, soft robotics, and conformable implantable devices, etc.\n"},
            {"",
                    "Step-Growth Polymerization is a propagation involves coupling of multiple combinations of monomers and oligomers of varying lengths.\n" +
                            "\n" +
                            "Chain-Growth Polymerization is that monomers do not polymerize spontaneously without initiators.\n" +
                            "Especially, a metastable monomer is temporarily disabled for spontaneous polymerization in the absence of initiators.\n",
                    "A corannulene core with five amide-appended thioalkyl side chains has chiral because of their nonplanar bowl shape, leading racemization.\n" +
                            "\n" +
                            "Monomer M is metastable and temporarily restricted from spontaneously polymerizing but possesses the capacity to undergo chain-growth polymerization.\n" +
                            "Initiator I lacks the capacity for intramolecular H-bonding and does not self assemble but serves as a proton acceptor for H-bonding interactions.\n" +
                            "\n" +
                            "The polymerization of M with I is driven kinetically and is pathway-dependent in solvent, MCHex, which is an excellent solvent that makes H-bonds in the polymer chain stable at ambient temperatures.\n" +
                            "The extraordinary stability of the polymer in MCHex is essential for achieving the living character of polymerization.\n" +
                            "\n" +
                            "The polymerization occurs only when the stereogenic centers of the monomer and initiator in their chiral side chains are matched in configuration. However, the result of polymerization of M using chiral initiators IR and IS was same in both cases.\n" +
                            "\n" +
                            "Thus, using initiator IR to polymerize only MR leaves MS unpolymerized, and stereoselectively succeed in optically resolving MS and MR. \n" +
                            "This notable stereochemical selection results from the homochiral nature of the polymer with respect to both the chiral side chains and stacked corannulene units.\"\n",},
            {"IDTBT is “near-amorphous” as an intrinsically stretchable polymer semiconductor candidate. Despite low crystallinity in a thin film, it exhibits high charge carrier mobility and near-ideal transistor current-voltage behavior. In addition, it exhibits good air-stability.\n" +
                    "DPPTT (thieno[3,2-b] thiophene-diketopyrrolopyrrole) is a common donor-acceptor system that possess high charge transport properties.\n" +
                    "It served as the building block for many developed intrinsically stretchable polymer semiconductors; excellent charge transport properties, despite of low crystallinity, improved plastic deformation due to the large free volume of polymer chains, dissipate strain energy, as no crack propagation was observed, IDTBT polymer chain were observed to be much better aligned during stretching, both in crystalline and amorphous regions, and upon fabricating fully stretchable organic transistors as active layer, IDTBT-based devices had better performance.\n" +
                    "IDTBT high modulus and high stretchability can be achieved simultaneously in low-crystallinity system. It possesses a higher elastic modulus and higher fracture strain than DPPTT. Amorphous microstructure of IDTBT resulted in high stretchability, its high modulus was attributed to the rigid backbone configuration.\n"},
            {"Conductive large-area multilayered patterning of EGaIn* using standard photolithographic process enabled integration with current industrial manufacturing process. \n" +
                    "The PSS enables compact particle assembly without rupturing during solution shearing, resulting in uniform and densely packed EGaIn*:PSS-based thin-film on top of photoresist (PR)-patterned substrate.\n" +
                    "\n" +
                    "EGaIn has exceptional deformability, stretchability, and high conductivity.\n" +
                    "PSS was used as dispersing polymer since it increases the wettability of ink on substrates for uniform coating and enables cohesion of EGaIn to render the film conductive.\n" +
                    "Using DMSO(dimethyl sulfoxide) as the lift-off solvent, cohesion between EGaIn*:PSS was induced to render the film conductive.\n" +
                    "The formation of a highly uniform and stable EGaIn* film over a large-area via solution shearing does not need a separate mechanical activation step to impart conductivity.\n" +
                    "These attributes were utilized to fabricate interconnects, stretchable display, and multilayer tactile sensors.\n"},
            {"As soft electronics are expected to play a critical role in the fourth-coming electronic applications, where devices will make intimate and conformal contact with the soft tissues of the body.\n" +
                    "\n" +
                    "These projects seek to advance the fields of flexible polymer semiconductors and sensors, paving the way for innovative applications in wireless sensor technologies and soft electronic devices.\n"}
    };
    String[][] references3 = new String[][] {
            {"Gun-Hee Lee, Hyeonji Kim, Juhyun Lee, Jae-Young Bae, Congqi Yang, Hanul Kim, Heemin Kang, Siyoung Q. Choi, Seongjun Park, Seung-Kyun Kang, Jiheong Kang, Zhenan Bao, Jae-Woong Jeong, Steve Park, Large-area photo-patterning of initially conductive EGaIn particle-assembled film for soft electronics,Materials Today,Volume 67,2023,Pages 84-94.", ""},
            {"Chen, H., Yuen, P. Y., Mun, J., Dauskardt, R. H., McCulloch, I., Tok, J. B.-H., Gu, X., Bao, Z., An Intrinsically Stretchable High-Performance Polymer Semiconductor with Low Crystallinity. Adv. Funct. Mater. 2019, 29, 1905340", ""},
            {"supramolecular polymerization.Science347,646-651(2015).",""},
    };

    /**
     * 논문4
     */
    String title4 = "지속가능한 화학공정";
    String category4 = "ProcessDesign";
    String[] author4 = new String[]{"함솔"};
    String[][] contents4 = new String[][]{
            {"1. 서론"},
            {"2. 화학 산업의 환경 오염"},
            {"3. 지속 가능한 성장을 넘어 탈성장으로"},
            {"4. 화학 산업의 변화"},
            {"5. 결혼"}
    };
    String[][] text4 = new String[][]{
            {"인간이 초래한 기후변화는 이미 전 지구 모든 지역에 많은 날씨와 극한 기후에 영향을 미치고 있다. 이로 인해 자연과 사람에 대한 광범위한 악영향과 이와 관련된 손실과 피해가 발생했다. 기후변화는 사람들의 생계에 점점 더 많은 영향을 미치고 있으며 국경을 넘어 경제 및 사회적 영향을 미치고 있다. IPCC의 2023 보고서에 따르면, 전 지구 지표면 온도는 2011~2020년에 1850~1900년보다 약 1.1°C (0.95°C~1.20°C) 더 높았다. 관측된 온난화는 CO2와 메탄(CH4)이 주를 이루는 온실가스(GHG)로 인한 온난화와 함께 인위적으로 발생했다. \n" +
                    " GHG의 배출과 함께 한 인류 문명의 성장은 공학 기술을 꽃피웠다. 하지만 이는 인류의 위기를 초래하고 있다. 이러한 위기로 인해 대두된 지속 가능한 발전 및 탈성장 담론에 대해 알아보고, 이로 인한 화학 공학의 변화와 앞으로의 화학 공학이 나아가야 할 방향에 대해 제시해 보았다.\n"},
            {"전 세계적으로 석유 화학 및 정유 업종은 산업 부문 온실가스 배출량에서 철강 업종 다음으로 배출량이 많다. 2019년, 석유 화학 및 정유 업종의 온실가스 배출량은 약 30억 톤으로, 2019년 총배출량의 5.9% 정도에 이른다. 산업연구원의 2021년도 조사에 따르면 국내의 경우, 석유화학의 온실가스 배출량은 산업 부문 전체의 16.3~17.3% 비중을 차지한다. 배출 구조를 살펴보았을 때, 업스트림에서는 고정, 이동, 탈루의 비중이 많다. 원료의 분류, 정제 과정 중 생성되는 에너지를 회수하여 다시 연료로 사용하기 때문에 직접 연료 연소에 따른 배출이 증가한다. 다운스트림은 저온 저압의 에너지를 사용해 전력 및 스팀의 비중이 높다. 업스트림 공정에서 생산된 기초 유분을 활용해 3대 유도품 및 기타 화학제품을 생산해 간접 배출이 높다. "},
            {"지속가능한 발전은 자본주의적 성장과 소비의 증가를 속성으로 하는 서양 근대의 주류 개발 개념에 기반한다. 하지만 탈성장은 성장에 대한 비판의 뜻을 담고 있는 단어다. 다음은 탈성장 담론의 공통 이념이다. 첫째, 성장의 기술적 측면 (GDP의 증가)에 대한 비판을 넘어, 인간 사고방식에 부정적 영향을 끼치는 점을 비판한다. 둘째, 성장의 한계에 관한 생태학적 관점 외에도, 반자본주의적 사회비판 패러다임을 제공한다. 셋째, 경제위기와 관련된 부정적 개념이 아닌 끊임없는 경쟁과 성취 압박에서의 해방 및 소박한 삶을 통한 행복이라는 긍정적 의미를 지닌다. 즉 탈성장은 단순히 성장을 양적 개념으로 감소시키자는 것이 아니라, 가치를 재편하고 특히 생태적 가치를 다시 살펴, 경제를 다시 문명론적 차원에서 변화시키려는 패러다임 전환에 관한 개념이다. 우리의 일상이 지속되길 원한다면, 이데올로기를 넘어 더 좋은 삶에 포커스를 맞춘 진정한 의미를 가진 공학의 ‘성장’이 필요하다."},
            {"기존의 지속가능한 발전 체제에서 고안해 낸 탄소중립 시나리오, 이에 발맞춰 화학 공정에도 변화의 바람이 불어오고 있다. 기존의 전통적인 엔지니어링 체계에서의 최적해는 제약조건(인력, 자원, 자본, 법률 등)으로 제한되는 범위 안에서 비용, 이윤, 생산성, 설비성능 등을 최적화하는 운전조건, 생산량, 설비투자 등의 변수로 결정된다. (효율적, 이윤추구) 하지만 탄소중립 시대에는 온실가스 배출을 제한해야 하므로 다른 식이 필요하다. 산업연구원의 석유화학산업 탄소중립 전략에 따르면, 국내 석유화학 산업의 온실가스 감축 전략은 크게 네 가지로 나눌 수 있다. 공정개선(생산설비 효율 향상), 원료대체(바이오 나프타 MTO), 연료 대체(기존 화석연료, 부생 가스 전기 대체 전기가열로 도입), 자원 순환(폐플라스틱 기계적, 화학적 재사용). 이는 기존 선형공정에서 순환성을 가지는 공정으로의 전환을 의미한다. 또한 물질 수지와 에너지 수지보다 탄소 수지를 가장 중요한 변수로 삼아, 경제성만이 아닌 자원 순환으로 초점을 옮기는 것이다. 연구, 산업 현장의 더 빠른 전환을 위해서는 탈성장에 관한 논의가 이루어져야 한다."},
            {"탈성장과 공학은 대척점에 있는 것이 아니다. 단지 그동안의 공학이 경제성과 개발의 관점에서 성장했을 뿐이다. 정말로 지속 가능한 공학을 원한다면 진정한 성장이 무엇인지 돌아보아야 한다. 근시안적 사고를 버리고 정말로 지속 가능하게 만들어야 하는 것은 당장의 풍요가 아닌 인류, 우리의 삶이다. 현재는 공학의 전환기라 생각한다. 전환기가 아니라면 전환기로 만들어야 한다. 쉽지 않은 일이지만 화학 공학도로서, 이 시기의 변화를 이끄는 공학자가 되길 소망한다."}
    };
    String[][] references4 = new String[][] {
            {"IPCC. (2023). “Climate Change 2023: Synthesis Report. Contribution of Working Groups I, II and III to the Sixth Assessment Report of the Intergovernmental Panel on Climate Change”, IPCC, Geneva, Switzerland", ""},
            {"조용원 외 2인. (2021). “석유화학산업 탄소중립 전략과 정책적 대응방안”, 산업연구원, 세종", ""},
            {"주화주, 윤제용. (2022). “기후위기 극복을 위한 화학산업 분야 탄소중립 엔지니어링에 대한 제언”, 공업화학 전망, 25(2), pp.34-39",""},
            {"조영준. (2021). “성장지상주의와 탈성장사회”, 대한철학회, 160, pp.187-213"}
    };

    /**
     * 논문5
     */
    String title5 = "3D 바이오 프린팅 기반 생체 재료 제작";
    String category5 = "Bio";
    String[] author5 = new String[]{"최영민"};
    String[][] contents5 = new String[][]{
            {"1. 요약"},
            {"2. 서론"},
            {"3. 연구 내용", "3-1. 바이오 프린팅에 사용되는 소재 특성", "3-2. 3D 바이오 프린팅에 사용되는 소재", "3-3. 3D 바이오 프린팅 방법"},
            {"4. 연구 현황 및 전망", "4-1. 3D 프린팅 기술의 의료분야 활용 사례", "4-2. 3D 바이오 프린팅 기술의 전망"}
    };
    String[][] text5 = new String[][]{
            {"3D 프린팅 기술은 재료 과학, 제조, 교육, 의료 분야 등 다양한 분야에서 사용되어 왔고 이 기술을 향상시키기 위한 많은 연구들이 진행 중이다. 그 중 세포와 생체적합성 물질의 적층을 통해 인공 조직, 장기 및 뼈를 제작하는 기술이 도입되어 이식을 위한 인간의 장기 전체를 생산할 수 있는데, 이 기술이 바로 3D 바이오 프린팅 기술이다. 실제로 국내 삼성서울병원에서 3D 프린터를 이용해 만든 환자의 골격 모델을 활용해 암이 퍼진 얼굴 골격을 절제하는 수술을 진행한 사레가 있다. 앞으로 3D 바이오 프린팅 기술을 이용하여 환자 맞춤형 장기 출력을 포함한 생체 의학적 응용 가능성이 많을 것으로 전망된다.  \n"},
            {"3D 프린터는 다양한 산업에서 사용되고 있으며 대표적인 두 가지 인쇄 방식으로는 액체 기반의 광 경화 수지면에 자외선 광을 조사하여 경화에 의해 생긴 층을 겹겹히 적층 시키는 광조형법(stereolithography, SLA)과, 고체 필라멘트를 녹여서 한층 한층 쌓아가며 3차원으로 프린팅 하는 방식인 융용압출조형(fused deposition modeling, FDM) 방식이 있다.  3D 바이오 프린팅 기술은 의학 분야에 많은 발전을 일으켰다. 의학 분야에 있어서 수술의 사전 준비를 위한 조직을 생산할 수 있게 되었으며, 새로운 약물을 개발할 때 그 약물에 대한 효능 및 부작용을 실제 사람이 아닌 인공 장기를 통해 쉽게 확인하는 것이 가능해졌다. 약물의 독성 역시 사람에게 미치는 영향에 대해 더 쉽게 연구할 수 있게 되었다.  3D 바이오 프린터가 불러오는 무한한 의학적 발전 가능성으로 인해 계속해서 이 기술의 여러 방법과 각 방식에 맞는 생체 재료 등에 대한 연구가 끊임없이 이루어지고 있다고 한다. \n"},
            {"",
                    "1)인쇄 가능성\n" +
                            "바이오 프린팅을 할 때 소재의 점도를 고려하지 않는 경우, 인쇄하는 과정 중에 노즐 막힘 현상이 발생할 수 있으며 인쇄 후 너무 낮은 점성으로 인해 구조가 유지되지 못하는 경우가 생길 수 있으므로 소재의 점도는 매우 중요한 요소이다. 프린터의 종류에 따라 사용 가능한 점도의 범위를 다르게 가지며 사용하는 재료에 따라서도 점도가 다르다. 점도에 따라 만들어지는 제품의 세포부착성이 달라지며 재료 선택 시 점도 외에 세포에 미치는 영향도 고려해야 하므로 기술에 따라서 알맞은 재료를 선택하는 것은 매우 중요하다. \n" +
                            "\n" +
                            "2)생체적합성\n" +
                            "자가이식을 제외한 동종/타종이식의 경우 사람에게 맞는 조직 또는 장기를 사용하지 않아 적합하지 않은 경우 자가면역반응에 의해서 원래의 기능을 상실하게 된다. 자가면역반응 없이 세포의 활성, 기능, 신호 전달을 돕기 위해서는 생체적합성이 맞는 재료를 선택하는 것이 중요하다. 생체적합성이란 거부반응이 없는 것은 물론, 조직이나 장기를 이루는 구성요소들이 생리활성 및 기능조절에 관여하는 것도 포함하는 것을 말한다. 알맞은 생체적합성을 얻기 위해 보통 천연/합성고분자가 많이 사용된다. \n" +
                            "\n" +
                            "3)생분해성 및 부산물\n" +
                            "세포가 성장할 공간을 확보하기 위해서는 제작된 지지체 또는 조직의 분해속도를 파악하는 것이 필수적이며 조절 또한 할 수 있어야 하고 분해속도와 새로운 조직이 형성되는 속도가 같아야 한다. 만약 분해속도가 더 빠를 경우, 1) 알맞은 구조 형성이 어렵고 2) 세포가 기능에 맞게 분화하는데 문제가 발생할 수 있으며 3) 새로 형성되는 장기가 본래 기능을 못하게 된다. 반대로 분해속도가 더 느릴 경우에는 새로운 조직 형성이 방해된다. \n" +
                            "\n" +
                            "지지체가 분해되면서 나오는 분해산물도 중요한 요소인데, 분해산물은 독성이 없고 빠르게 대사되어야 한다. 분해산물이 독성을 가지면 1) 우리 몸의 단백질이나 작은 분자와 결합하여 기능을 방해하거나 2) pH 변화를 유도하거나 3) 면역글로불린의 생성을 유도하여 체온에 변화를 줄 수 있다. \n" +
                            "\n" +
                            "4)기계적 물성\n" +
                            "3차원 구조를 유지하지 못하면 그 구조와 기능을 잃어 새로 이식한 것이 원래의 기능을 수행할 수 없게 된다. 재료의 종류에 따라 가지는 물리적 특성이 다르고 인체의 부위나 역할마다 가지는 물리적 특성 또한 다르기 때문에 각 기능에 맞는 재료의 선택이 중요하다. \n" +
                            "\n" +
                            "5)생체 모방\n" +
                            "세포의 활성 뿐만 아니라 주변 환경의 특징이나 체내 환경을 물리화학적으로 이해하는 것이 중요하므로 공학, 의학, 유체역학, 생체재료학, 세포생물학 등 여러 분야의 연구가 필요하다. \n",
                    "1) 자연유래(천연) 고분자\n" +
                            "예시로는 젤라틴, 키토산, 히알루론산, 알지네이트, 아가, 젤란검, 피브란, 케라틴, 셀룰로오스 등이 있다. 천연 고분자의 장점으로는 가공 및 조형이 쉬우며 생체적합성이 높고 인체에 도입되었을 때 대부분 좋은 생리활성을 가진다. 세포부착성이 좋고 면역반응이 일어나지 않아 생체모방 ECM 제작 시 유리하다. 그러나 내열성이 낮아 열에 의한 변성이 쉽게 일어나고 기계적 물성이 낮아 물리적 힘에 의해 구조나 형태가 쉽게 변형된다. 몸에서 빠르게 분해되므로 분해속도 조절이 어렵다는 단점을 가진다. \n" +
                            "\n" +
                            "2) 합성 고분자\n" +
                            "예시로는 PLA(Poly lactic acid), PEG(Poly ethylene glycol), PVA(Poly vinyl alcohol), PLLA(Poly L lactic acid), PLGA(Poly lactic-co-glycolic acid), PCL(Poly-caprolactone) 등이 있다. 하이드로겔 상태로 만들기 쉬운 천연고분자에 반해, 합성고분자는 형태를 만들려면 열 가하거나 유기 용매로 녹여야 하므로 가공이 어렵고 생리활성 떨어진다는 단점이 있다. 그러나 여러 장점 또한 가진다. 일반적으로 생분해성 고분자이므로 사람의 체내에서 분해가 되며 분해산물 역시 세포 독성을 갖지 않는다. 천연고분자에 비해 기계적 물성이 좋아 구조나 형태를 만들 때 필요한 물성이나 강도를 확보하기 좋으며, 인체 내에서 분해 속도를 조절하기 용이하다. 또한 FDA 승인이 되어 의료용 재료로 사용하기에 적합하다.\"\n",},
            {"",
                    "1) 턱뼈 복원 수술\n" +
                            "양악수술 실패 경우, 3D 프린터로 뼈 모양 출력 후 뼈와 딱 맞는 보형물을 제작하여 원래의 모습으로 복원하는 것이 가능하게 된다(a\uD83E\uDC6Ab). 보형물이 뼈와 딱 맞아 수술 후에도 이동이 없고 보형물과 자신의 뼈 사이에 경계가 생기지 않아 부작용을 최소화 할 수 있다. \n" +
                            "\n" +
                            "2) 두개골 성형수술\n" +
                            "환자의 CT 정보를 바탕으로 3D 프린터에 장착된 레이저가 티타늄을 1500℃의 열로 녹여서 환자의 두개골 모형을 프린팅 하였다. 티타늄 임플란트를 재료로 사용함으로써 수술시간을 단축하고 감염 문제를 줄일 수 있었다. 티타늄 재질은 가볍고 강도가 좋다는 장점을 가진다. \n" +
                            "\n" +
                            "3)치아 보철물 제작\n" +
                            "3D CT와 치과용 3D 스캐너를 이용하여 환자의 치아구조 데이터를 획득한 다음 3D 프린팅 기술을 활용하여 치아교정장치와 임플란트를 제작할 수 있다. 작은 오차만으로도 치명적인 결과를 가져올 수 있는 임플란트 수술의 경우, 인간의 손에 의존하는 것보다 3D 프린팅 기술을 활용하는 것이 더욱 신속하고 정밀한 수술을 가능하게 한다. \n",
                    "최근 3D 프린팅 기술의 가능성이 각광받고 있음에 따라 3D 바이오 프린팅 기술에 대한 관심도와 연구 수행도 또한 높아지는 추세이다. 3D 바이오 프린팅 기술이 가져오는 여러 단점을 극복하는 방법을 모색하며 이 기술이 가지는 장점은 극대화 시키는 방법이 고안되어야 할 것이다. 특정 생화학적 성분을 취급하기 위한 3D 바이오 프린터 디자인 시작을 위해서는 기술에 적합한 재료의 범위를 확대해야 하고 재료 증착 과정에서 정밀도와 특이성을 증가시킬 수 있어야 한다.  3D 프린팅을 의학 분야에 실질적으로 활용하기 위해서는 각 조직의 특성에 맞게 물리 화학적 성질이 조절 가능한 바이오 잉크의 개발이 필수적으로 요구되며 생체적합성 및 주변 조직과의 일체화 또한 고려되어야 할 요소이다. 현재 높이 취급되는 3D 바이오 프린팅 기술의 발전 가능성에 부합하기 위해서는 생명, 재료, 기계, 의학 등 다양한 분야의 협업이 진행되어야 할 것으로 보인다. \n" +
                            "\n"}
    };
    String[][] references5 = new String[][] {
            {"Sung Ho Kim et al. (2015). Status and Prospect of 3D Bio-Printing Technology. KSBB Journal, 30(6), pp.268-274.\n", ""},
            {"So Hyeon Park et al. (2015). 3D Printing Technology for Biomedical\n" +
                    " Applications. KIC News, 18(1), pp.67-78.\n", ""},
            {"한국콘텐츠 진흥원. (2014). 3D 프린팅 기술 동향. 한국콘텐츠 진흥원문화기술 심층리포트, 통권 29호, pp.33-47.\n",""},
            {"Tae Yoon Eom. (2016). 3D Bioprinting Technology in Biochemical \n" +
                    "Engineering. Korean Chem. Eng. Res., 54(3), pp.285-292.\n",""},
    };

    /**
     * 논문6
     */
    String title6 = "의료 분야에 사용되는 바이오소재_메디컬 섬유 소재를 중심으로";
    String category6 = "Bio";
    String[] author6 = new String[]{"이지연"};
    String[][] contents6 = new String[][]{
            {"1. 서론"},
            {"2. 메디컬 섬유소재", "2-1. 배경 및 필요성", "2-2. 정의와 분류", "2-3. 기술동향", "2-4. 국내 동향"},
            {"3. 결론"},
    };
    String[][] text6 = new String[][]{
            {"바이오 소재는 폭 넓은 의미를 가지므로 이 중 주제에서 말하고자 하는 바이오 소재를 생체 재료로 특정하고자 한다. 생체 재료는 살아있는 인간의 생체 조직과 접하여 사용되어 생체에 유해한 영향을 미치지 않고 사용되는 물질이다. 이는 신체에 직접적으로 사용되기 때문에 생체적합성을 만족해야 한다. 이는 세 가지로 분류된다. 우선 생물학적 친화성으로, 독성 염증 야기성, 면역성, 응혈성, 발암성 등을 일으키지 않는 것이다. 다음으로 화학적 친화성은 흡수성, 흡착성, 열화성, 내효소성 용출성 등을 일으키지 않는 것이다. 마지막으로 기계적 친화성으로, 강도, 영률, 피로강도, 경도, 마모 등의 성질을 말한다. 생체 재료로는 고분자, 금속, 세라믹재료가 이용되고 있으며 적용 범위가 매우 넓다. 이러한 재료들이 생체에 안정적으로 적합하게 사용되기 위해 많은 연구가 진행되고 있다."},
            {"",
                    "시간이 흐름에 따라 모든 생물은 노화하면서 신체 기관이나 조직이 퇴행되는 등 변화가 현저히 진행되어 기능이 감소된다. 이로 인해 항상성 유지가 어려워지고 몸이 쇠약해지며, 외부 사고, 질병 등으로 인해 신체적 기능의 손실이 발생한다. 기능을 되찾기 위해 장기이식을 하는 등의 방법이 있으나, 이는 공급보다 수요가 많아 실질적으로 해결이 어렵다. 따라서 신체 기능 회복을 위한 생체 재료 개발이 진행되었다. 이에 더해 고령 인구 증가, 생활 수준의 향상, 건강에 대한 관심 증대로 메디컬 섬유소재 분야의 부가가치가 높아지고, 이를 필요로 하는 사람에 따라 맞춤형으로 제작하는 기술이 개발되고 있으며 이러한 상황이 지속될 것으로 보인다. ",
                    "메디컬 섬유소재란 의료기기와 의약외품에 사용되어 상처 및 감염으로부터 신체를 보호하는 섬유를 통칭한다. 이는 크게 임플란트용 섬유, 비임플란트용 섬유, 체외기능 보조용 섬유, 그리고 보건/위생용 섬유로 네 가지가 있다. 먼저 임플란트용 섬유는 체내 기능 복구 목적으로 삽입되는 것으로, 인공혈관, 봉합사, 유착방지막, 신경도관, 섬유구조체 등이 있다. 비임플란트용 섬유는 피부에는 접촉되지만 체내에는 흡수되지 않는 것으로, 창상치료제, 밴드류, 거즈, 부목 및 붕대, 치과용 섬유 등이 있다. 다음으로 체외기능 보조용 섬유로는 피부와 떨어진 체외에서 인체의 기능을 대치하는 용도로 쓰이며, 혈액필터, 인공신장, 조직재생용 섬유 구조체, 심폐기용 필터 등이 있다. 마지막으로 보건/위생용 섬유는 병원, 가정, 생활용품으로 사용되는 가운, 마스크, 위생용품 등이다. 모든 무독성, 비발암성, 비알레르기 유발성, 생체적합성 등이 요구되며 원하는 형태와 차원(2D, 3D)으로의 제작이 가능해야 한다. 이 중 임플란트용 섬유, 비임플란트용 섬유와 체외기능 보조용 섬유를 중심으로 살펴보고자 한다. 임플란트용 섬유는 엄격한 생체적합성 심사를 거쳐야 하며, 습윤한 환경에서도 유지가 가능한 기계적 물성을 가져야 한다. 또한 주변 조직과의 유착 방지, 선택적 생분해성 등을 부여받아야 할 필요가 있다. 비임플란트용 섬유는 주로 피부 접촉용이기 때문에, 접촉을 원하는 기간 동안 안정적인 접착력 확보와 섬유 조직의 형태 및 물성 유지가 필수적이다. 추가로 치료에 도움이 되는 기능성 물질을 함유하여 빠른 개선을 도울 수 있도록 한다. 체외기능 보조용 섬유는 인공폐, 인공신장, 인공간 등에 사용되므로 대부분 물질 교환을 목적으로 한다. 따라서 넓은 표면적 확보에 효과적인 중공섬유(hollow fiber) 형태로 제작된다.",
                    "\"A. 임플란트용 섬유: 임플란트용 섬유의 경우 메디컬 섬유소재의 전기전도성, 기계적 물성, 생분해성 등 제어 기술개발을 통해 신경 도관, 소화기계 스텐트, 인공혈관, 봉합사 등의 제품에 적용을 시도하고 있다. 최근 임플란트용 섬유의 최고난도 적용 분야는 신경이라고 볼 수 있으며, 끊어진 신경을 연결 및 재생시키기 위해 우수한 전기전도성을 가진 신경 도관을 개발하려는 시도가 있다. 미국 연구팀에서 높은 전기전도성을 나타내는 대표적인 섬유인 탄소나노튜브를 신경 도관으로 활용하기 위해 쥐 모델에 이를 삽입하여 10주 동안 효율성 테스트를 안정적으로 진행한 결과가 있다. 금속으로 제작된 스텐트의 경우, 인체 내 삽입을 진행한 후 추가 시술을 통해 제거해야 하는 단점을 가진다. 따라서 생분해성 섬유소재를 사용하여 이를 해결하려는 방향으로 기술개발이 이루어지고 있다. 분해 속도와 기계적 물성이 다른 두 가지 생분해성 원재료를 사용하거나 코어-시스(core-sheath) 이중층 구조로 소화기계 스텐트를 제작하여 제거 시술이 필요 없도록 연구한 사례가 최근에 발견되었다. 인공혈관의 경우, 생체적합성 증대 및 자연 혈관의 기계적 물성 재현을 위한 천연소재의 사용과 구조 디자인 연구가 활발히 진행되고 있다. 동일한 섬유 원료를 사용하더라도 다른 직조 방식인 방직과 편직을 적용하면 다른 강도와 탄성을 얻을 수 있음을 확인하였으며, 이를 필요에 따라 활용할 수 있을 것으로 기대된다. 또한 자연 혈관을 구성하고 있는 주요 단백질인 엘라스틴과 콜라겐의 기능을 파악하고 있으며, 동시에 생물공학 기술을 통해 생산된 단백질 소재로 혈관 기능을 재구현하기 위한 시도도 진행 중에 있다. 가장 일반적인 임플란트용 메디컬 섬유소재이자 오랜 역사를 가진 봉합사의 경우, 봉합이 실제 진행되는 인체조직 및 기관의 종류에 따라 맞춤형으로 개발하고자 많은 노력을 가하고 있다. 천연 콜라겐 단백질은 고유의 3차원적 구조를 유지할 시 피부 재생에 도움을 줄 수 있으므로, 구조를 잃지 않는 섬유화 공정개발을 통해 피부 맞춤형 봉합사로 활용 가능하다.\n" +
                            "\n" +
                            "B.비임플란트용 섬유: 비임플란트용 섬유는 주로 피부에 부착되는 것이므로 상처 부위의 재생 능력 향상을 돕기 위한 물질 도입 및 습윤 환경 조성에 대한 연구를 진행하고 있다. 피부세포 성장인자 함유 및 복수의 기능성 물질 도입을 통해 시너지 치료 효과를 낼 수 있는 창상치료제 기술개발이 지속되고 있는 추세이다. 그리고 습윤한 환경 조성에 도움을 주면서도 생체적합성을 동시에 가진 고분자 소재로 필름 형태의 섬유를 제작한 후 피부에 적용하려는 기술 개발이 활발히 이루어지고 있다. 분자 생명공학 기술을 이용하여, 생산된 홍합 접착단백질과 습윤력이 우수한 히알루론산을 조합함으로써 피부 접착력과 습윤력을 동시에 만족시키는 마이크로니들 패치가 개발된 사례도 있다.\n" +
                            "\n" +
                            "C. 체외 기능 보조용 섬유: 메디컬 섬유소재의 3D 프린팅 기술개발을 통하여 체외기능 보조용 섬유는 다품종 소량생산이 가능해졌다. 사람은 각자 다른 신체적 구조를 가지고 있으므로 이에 따라 해당 기술을 활용하여 수요자 맞춤형 인공장기를 제작하려는 시도가 최근에 이루어지고 있다. 프린팅에 사용되는 소재인 바이오잉크, 수요자 맞춤형 제작을 위한 컴퓨터 기반 디자인, 실제 제작을 위한 기계적 프린팅 등 모든 단계에서 활발한 3D 바이오 프린팅 기술개발 진행 중에 있다. 특히, 프린팅 과정 중 생체적합성과 생활성을 잃지 않을 수 있는 바이오잉크와 체내 물질 교환기능 재현에 필수적인 중공 구조 제작을 위한 고해상도 프린팅 기술개발이 필요한 상황이다. 이 외에도 표면에서 직접적인 세포배양이 가능한 지지체를 섬유소재의 3D 프린팅 기술로 제작하여, 기존의 체외기능 보조용 제품을 체내 임플란트용으로 전환하는 것의 가능성이 타진되고 있다. 미국에서는 재료공학과 3D 프린팅 기술의 융합을 통해 신장에 존재하는 중공 구조를 모사한 세포 지지체 개발에 성공하였으며, 지지체 위에서 신장 세포 배양도 가능함을 확인하였다.\n",
                    "현재 국내 메디컬 섬유소재 산업은 세계 시장의 약 4% 비중을 차지하고 있으며, 상대적으로 부가가치가 낮은 보건/위생용 섬유 제품이 주를 이루고 있다. 관련 정책의 경우 원천 소재 기술 개발 등의 정책이 추진되고는 있으나 메디컬 섬유소재 관련 고도화에 특화된 정책 수립은 빈번하지 못한 상태이다. 정부 R&D 투자는 현재 연구 개발 단계별 분석 결과, 메디컬 섬유소재 분야의 개발 연구 비율이 기초연구와 응용연구에 비해 매우 높은 상태이다. 즉, 섬유의 고부가가치화를 통한 의료 분야 적용에 가장 필요한 기초연구의 비중이 작으며, 또한 기초에서 개발연구로 넘어가도록 다리를 놓아주는 응용연구 투자가 가장 모자란 상태이다."
            },
            {"지금까지 메디컬 섬유소재에 대한 기본 정보 및 기술 동향, 국내 동향을 알아보았다. 기술이 발전함에 따라 평균 수명이 늘어나 고령화 사회에 들어온 지금, 메디컬 섬유소재는 인간에게 꼭 필요한 존재이다. 또한 건강에 관심이 많아지고 있는 사회에서 이러한 의료용 소재는 앞으로 더욱 연구되어야 할 분야이기도 하다. 현재도 활발히 연구가 진행되고 있지만 기초 및 응용연구 투자에 초점을 두고 연구 및 개발이 이루어진다면 더욱 넓게 활용될 것이라 예상된다. 메디컬 섬유소재가 조금 더 실질적인 측면에서 연구된다면 사람들에게 좋은 환경의 의료 서비스를 제공할 수 있을 것이며, 삶의 질 또한 향상될 것이다."},
    };
    String[][] references6 = new String[][] {
            {"정구인 외 3인, 의공학 분야에서 사용되는 의용생체재료의 연구 동향 및 전망, KIC News, 13(6), pp.18-31", ""},
            {"정두엽, 메디컬 섬유소재, 한국과학기술기획평가원, 2022", ""},
    };

    

    /**
     * 논문7
     */

    String title7 = "반도체 소재와 소자 원리";

    String category7 = "SemiConductor";
    String[] author7 = new String[]{"노은혜", "박은서"};
    String[][] contents7 = new String[][]{
            {"1. 반도체 특성과 공정단계"},
            {"2. 반도체 소재", "2-1. 원소 반도체",
                    "2-2. 화합물 반도체",
                    "2-3. 산화물 반도체",
                    "2-4. 유기 반도체"
            },
            {"3. 반도체 소자 원리",
                    "3-1. 다이오드",
                    "3-2. 커패시터",
                    "3-3. 트랜지스터"
            },
            {"4. 차세대 반도체 연구 현황",
                    "4-1. 디스플레이와 반도체",
                    "4-2. 광반도체",
                    "4-3. 전력반도체"
            },
            {"5. 결론"}
    };
    String[][] text7 = new String[][]{
            {"기술이 발전함에 따라 반도체 공정은 섬세해지고, 집적도가 증가함에 따라 발생하는 발열 현상과 전력소모 문제를 해결하는 것이 이슈가 되고 있다. 또한 다양한 디스플레이 제품과 기술의 발전은 그에 걸맞은 고성능 반도체 소자를 요구한다. 이렇게 산업의 발전에 큰 부분을 차지하는 반도체의 특성과 반도체 재료, 소자에 대해 알아보고자 한다.\n" +
                    "반도체는 전기가 통하는 위치인 전도대와 전기가 통하지 않는 위치인 가전자대 사이의 거리인 에너지밴드인 Eg가 부도체와 도체의 중간 정도인 물질로, 부도체는 Eg가 매우 멀고, 도체는 전도대와 가전자대가 중첩되어 있어 언제나 전기가 통할 수 있다. 반도체의 이러한 성질을 이용하여 집적회로(IC, Integrated Circuits) 산업과 기술을 만든다.\n" +
                    "반도체 제조 과정은 8대공정으로 알려져 있는데, 그 과정은 다음과 같다.\n" +
                    "① 웨이퍼 제조 ② 산화막 형성 ③ 포토 공정 ④ 에칭 공정 ⑤ 박막증착(CVD, PVD) ⑥ 금속막(배선) ⑦수율 측정 ⑧패키지\"\n"},
            {"",
            "원소 반도체란 단일 원소로서 반도체성을 나타내는 물질로 원소 주기율표의 제14족에 속하는 실리콘(Si)과 게르마늄(Ge)을 주로 이용한다. 초기 반도체 산업에서는 게르마늄을 주로 사용하였으나 집적회로의 발전에 따라 공정과 가격 등의 이유로 대부분 실리콘을 주 원료로 사용하고 있다. 실리콘은 양이 풍부하고, 실리콘을 추출하고 정제, 결정화하는 공정은 경제적이며 결정화된 실리콘은 상대적으로 견고한 결합을 형성하기 때문에 실리콘 결정은 강력한 기계적 특성을 가지고 있다. 게다가 실리콘의 경우 폐기되어도 환경적 문제를 거의 일으키지 않는다. 또한 실리콘의 밴드 갭 에너지는 약 1.12eV로 적절한 반면 게르마늄의 밴드 갭 에너지는 0.67eV이다. 게르마늄은 실리콘에 비해 전자의 이동도가 약 3배나 높음에도 불구하고 밴드 갭이 작아 고온에서 사용하기 어렵다. 또, 실리콘은 안정된 산화막 SiO2를 쉽게 만들고 이는 절연막으로 사용하기 적합하다. 따라서 실리콘은 원소 반도체로서 독보적인 효용성을 보여준다고 할 수 있다.\n" +
                    "비정질 실리콘은 실리콘 원자가 결정구조를 이루지 않고 무질서하게 배열하고 있는 구조이다. 원자가 무질서하게 배열되어 있기 때문에 이동하는 자유 전자가 원자에 부딪힐 가능성이 매우 크고 전자의 이동도가 가장 작다고 할 수 있다. 그러나 비정질 실리콘은 만들기가 쉽고 제작 비용이 가장 저렴하다는 장점이 있다. 비정질 실리콘은 실리콘 웨이퍼 위에 화학적 기상 증착(CVD) 또는 물리적 기상 증착(PVD)을 이용함으로써 얻을 수 있고, 전도성이 매우 낮다.\n" +
                    "단결정 실리콘이란, 시료의 어느 부분을 보아도 결정 축의 방향이 같은 실리콘을 말한다. 이때 실리콘 원자들은 규칙적으로 배열되어 있으며 각 원자들 사이에 공유결합이 형성되어 있어 매우 안정적이다. 또한 자유전자가 이동할 때 가장 자유롭게 이동하는 결정 구조를 가지고 있기 때문에 전자의 이동도가 가장 크다.\n" +
                    "다결정 실리콘은 결정 축의 방향이 다른 수많은 단결정들이 모여 있는 형태의 실리콘을 말한다. 다결정의 경우 자유전자가 이동할 때 결정 축이 다른 결정면과 만나게 되면 이동속도가 감소한다. 따라서 비정질 실리콘과 단결정 실리콘의 중간 정도의 이동도를 가진다.\n" +
                    "\n",
            "기존 산업에서 실리콘 반도체를 사용했다면, 차세대 혁신의 기반이 되는 것은 화합물 반도체이다. 화합물 반도체는 실리콘에 비해 전자와 정공의 이동도가 크기 때문에 훨씬 높은 주파수에서 작동할 수 있어 고속 데이터 전송이 가능하다. 전자와 정공의 직접 천이(Direct Transition) 특성을 가지고 있으며 다양한 원소를 조합함으로써 밴드 갭을 조절할 수 있다는 장점이 있다. 다만 이러한 화합물 반도체는 실리콘 반도체에 비해 제조하기 어렵고 결정의 결함 수가 많으며 결정 제조 비용이 높다는 단점이 있다.\n" +
                    "화합물 반도체는 크게 인공적으로 제조하는 Ⅲ-Ⅴ족 화합물 반도체(GaN, GaP, GaAs, GaSb, InP, InAs, InSb, Ga1-xAlxAs 등)와 자연계에 존재하는 Ⅱ-Ⅳ족 화합물 반도체(ZnS, CdS, ZnSe, CdSe, ZnTe, CdTe, Hg1-xCdxTe 등)로 분류할 수 있다. GaAs의 증착은 Ⅲ족 원료에 유기금속 소스를 사용하는 기상 성장법인 MOCVD를 주로 이용하는데, 이는 MBE법에 비해 성장 속도를 확보하고 장치를 대형화시키기 쉬우며 양산성이 우수하다. GaN으로 대표되는 Ⅲ족 질화물 반도체는 물리적, 화학적 성질이 우수해 중요한 반도체 재료로 각광받고 있다. Ⅱ-Ⅳ족 화합물 반도체는 원자 반도체와는 캐리어의 이동도, 에너지 밴드 구조 등이 달라 전기적, 광학적 성질이 크게 다르다. 따라서 발광 다이오드, 반도체 레이저, 고주파 발진 소자와 같이 실리콘으로는 실현할 수 없는 소자를 제작하는 것이 가능하다. \n" +
                    "\n",
            "산화물 반도체란 산화물 소재에 도핑을 통해 전도성을 타입을 결정, 제어하고 에너지 밴드 갭을 조절해 광전자 소자로 응용가능한 반도체 소재이다. 도핑이란, 반도체에서 전하 캐리어의 농도를 조작하기 위해 제어된 양의 불순물을 결정에 추가하는 것이다. 산화물 반도체는 일반적으로 넓은 밴드갭을 갖기 때문에 에너지가 작은 가시광이나 적외선은 흡수되지 못한다. 가시광선이 흡수되지 못하고 통과하는 특성 덕분에 산화물 반도체는 투명하게 보인다는 큰 특징을 가지게 되고, 우수한 전기적, 광학적 특성을 보인다면 다양한 산업 분야에서 응용될 가능성이 크다.\n" +
                    "금속 산화물 반도체 물질이자 높은 전하 이동도를 가지는 투명 반도체인 IGZO(Indium Gallium Zinc Oxide)는 인듐, 갈륨, 아연, 산소로 구성된 산화물 반도체로, 3eV 이상의 큰 밴드 갭을 갖는다. IGZO는 박막 트랜지스터(TFT)를 제작하는데 활용되고 금속 산화물 반도체인 IGZO는 금속의 s오비탈과 산소의 p오비탈로 구성되어 있어 구형 형태의 금속의 s오비탈에 의해 캐리어의 이동성이 크게 감소하지 않는다. 이는 방향성이 강한 sp3오비탈로 구성된 비정질 실리콘 반도체와 대비된다. 따라서 IGZO 박막 트랜지스터는 비정질 실리콘으로 제작된 박막 트랜지스터보다 전하 이동도가 높다는 특징을 갖는다. 또한 IGZO 제조 공정은 비정질 실리콘 반도체 제조 공정과 유사해 기존 설비를 활용할 수 있다. \n" +
                    "\n"},
            {"",
            "다이오드는 전류 흐름에 대한 밸브 역할을 하는 것으로, p형 반도체와 n형 반도체를 접합시키면 다이오드가 된다. 가운데에는 양이온과 음이온이 존재하며 정공과 자유전자는 존재하지 않는데, 이 영역을 공핍층(depletion layer)이라고 하고, 공핍층을 사이에 두고 p, n형 반도체에 전계(electric field)가 형성되고, 이 영역은 전자가 함부로 넘어오는 것을 막아주는 역할을 하여 전위장벽(potential barrier)이라고 한다. 이 영역의 전압을 넘겨야 전자가 이동할 수 있다.\n" +
                    "순방향으로 전압을 걸어주면(n형 -, p형 +) 전자가 p형쪽으로, 정공은 n형쪽으로 전자와 정공이 중간에서 만나 결합하면서 공핍층이 줄어들고 재결합으로 에너지가 방출된다. 반면에 역방향으로 전압을 걸어주면 각자 전압을 건 쪽으로 전자와 정공이 몰리면서 공핍층이 넓어져 전류가 흐르지 않게 된다.\n" +
                    "\n",
            "커패시터는 전기를 저장하고 흘려주는 임시 창고 역할을 하는 것으로, 필요한 전류보다 많은 양이 흐르면 이를 저장하고, 반대 경우에는 저장한 전류를 방출하는 역할을 한다. 두 개의 금속판 사이에 BaTiO3같은 유전체를 끼워 만든다.\n" +
                    "유전체는 전하를 통과시키지 않지만 대전될 수는 있는 물질로, 전압을 걸면 전하가 축적될 때까지 전류가 흐르고 유전체는 전자가 이동하는 것을 막는다. 전하가 완전히 축적되면 전류가 흐르지 않는다.\"\n",
            "트랜지스터는 전기신호를 증폭하고 전자적 스위치로서 기능하는 반도체 소자이다. 전기전도성을 가지는 동시에 저항의 역할도 하는데 트랜지스터는 3개의 다리를 가지고 있고 순서대로 접지 역할을 하는 E(이미터), 입력을 뜻하는 B(베이스), 출력을 뜻하는 C(컬렉터)로 구성되어 있다. 트랜지스터는 반도체의 접합에 따라 pnp형과 npn형으로 구분할 수 있고, 이러한 트랜지스터에도 다양한 종류가 있는데, BJT(Bipolar junction Transistor), FET(Field Effect Transistor), TFT(Thin Film Transistor) 등이 그것이다.\n" +
                    "트랜지스터의 기능인 스위칭과 증폭 기능에 대해 알아보자. PN접합에서 순방향의 전압을 걸어준다는 것은 P형 반도체에 양극(+), N형 반도체에 음극(-)을 연결한 것이다. E와 B에 순방향 전압을, B와 C에는 역방향 전압을 걸어주면, E와 B의 캐리어들이 공핍층을 넘어가기 때문에 전류는 P형 반도체에서 N형 반도체로 흐르게 된다. 그리고 B와 C 사이 공핍층은 더욱 넓어진다. 따라서 E와 B의 PN접합 회로에는 전류가 흐르게 되는데 베이스는 매우 얇기 때문에 E에서 방출되는 캐리어가 B를 건너 C까지 이동해 모아진다. B에 전류가 흐르면 전체 회로에 전류가 흐르고 반대의 경우엔 아니라는 사실을 통해 트랜지스터의 스위칭 기능을 확인할 수 있다. 이때 E와 B에 걸어준 전압을 바이어스 전압이라 한다. 그리고 C로 이동한 캐리어는 원래 C에 있던 캐리어와 합쳐지면서 신호가 증폭되는 증폭 효과가 나타난다.\n"},
            {"",
            "디스플레이용 반도체의 종류에는 CIS(CMOS Image Sensors)와 DDI(Display Driver IC)가 있는데, 둘 다 각종 전자제품의 영상 표현과 관련이 있지만, CIS는 CMOS라는 소자를 가지고 빛이 들어오면 컬러 이미지를 전기 신호로 바꿔주는 역할을, DDI는 CIS에서 들어오는 빛의 신호를 전기 신호로 받아 다시 빛으로 바꿔주어 사람이 볼 수 있게 하는 역할을 하는 차이점이 있다.\n" +
                    "드라이버 IC(DDI)가 패널의 각 픽셀에 각각의 서브 픽셀을 켜거나 끄고, 표현할 색의 차이 등의 행동 명령을 내리면, Gate IC와 Source IC의 전압차를 이용해 전류를 TFT에 전달하고, TFT는 해당 명령에 따라 각 서브 픽셀을 직접 켜거나 끄는 스위치 역할을 하여 원하는 이미지를 패널에 생성시키는 순서로 디스플레이용 반도체가 작동한다. 디스플레이 화소에는 각각의 삼원색을 표시하는 RGB 부화소가 3개씩 존재하고, DDI는 이러한 부화소 트랜지스터를 조절하며, DDI가 모여 다양한 색이 나타난다. Gate IC는 세로로, Source IC는 가로로 존재한다.\n" +
                    "패널 DDI는 한 패널에 다수의 DDI를 사용하고, 패널 DDI의 Source IC는 저전압 신호를 받아 액정 구동 전압의 출력 신호를 만들어내고, Gate IC는 디지털 입력 신호를 받아 고전압의 ON/OFF 구동 신호를 만들어낸다.\n" +
                    "박막 트랜지스터(TFT)에 대해 알아보자. 먼저, 트랜지스터란 반도체로 이루어진 전자회로의 구성요소로(ON, OFF 기능), 전류의 흐름을 조절하는 밸브 역할을 하는데, 박막 트랜지스터(TFT: Thin Film Transistor)이란 얇은 필름 형태인 박막을 이용하여 만든 트랜지스터로, 디스플레이의 화면을 구성하는 각각의 픽셀 밝기를 조절하는 역할을 한다. 한 개의 픽셀은 R, G, B 세 개의 서브 픽셀로 이루어져 있고, 디스플레이가 색을 구현하기 위해서 각각의 서브 픽셀에 전류가 필요하다.\n" +
                    "LTPS(Low Temperature Polycrystalline Silicon; 저온 다결정 실리콘) TFT란 디스플레이의 픽셀 밝기를 조절하는 TFT의 한 종류로, 비정질 실리콘인 a-Si의 특성을 재결정화를 이용해 변화시켜 전자의 이동 성능을 높인 TFT를 의미한다. 디스플레이용 TFT는 소자 특성에 따라 a-Si, LTPS, IGZO(Oxide TFT) 등을 사용한다. a-Si는 비정질 TFT이기 때문에 전자 이동 속도가 느리고, LTPS는 균일하긴 하지만 구간마다 다르기 때문에 전자 이동도가 단결정 실리콘에 비해서는 느리다. 전자의 이동이 빠르면 단시간에 원하는 전류량을 충분히 보낼 수 있어, 촘촘한 회로 구성이 필요한 고해상도 디스플레이 패널에 유리하다.\n" +
                    "Oxide TFT는 산화물(IGZO) 기반 TFT로, 단결정 실리콘보다 전자의 이동 속도가 빠른 장점이 있고, 투명한 소재의 특성으로 광원으로부터 빛을 차단하는 부분을 최소화할 수 있다. 따라서 높은 휘도를 유지하면서 전력 소모를 최소화할 수 있다.\n",
            "광반도체 기술이란 광학과 전자공학이 합쳐진 기술로, 빛의 고유한 성질을 이용해 기술적으로 개발하여 조명, TV, 휴대폰, 모바일 기기의 디스플레이, 광통신, 광컴퓨터 등에 이용된다. PN접합으로, 정공과 전자가 결합하며 에너지가 발생하고, 이때 발생하는 에너지가 빛으로 나타나는 경우 광반도체라고 한다.\n" +
                    "광통신 시스템 및 네트워크, 광섬유 및 관련 소자와 재료, 광소자, 광정보처리 및 디스플레이, LCD(액정디스플레이), FPD(평판디스플레이), LED, OLED(유기발광 다이오드), 구조해석, 자동화 등의 생산기술, 전자재료 등에 광반도체 기술이 응용될 수 있다.\n",
            "전력반도체란 전력 변환, 전력 변압, 전력 안정, 전력 분배 및 전력 제어 등을 수행하는 데 사용하는 반도체 부품으로 기존 Si 기반의 반도체 소자에 SiC, GaN(화합물 반도체) 물질 기반의 전력 반도체로 사용하기에 적절한 특징을 지니는 기반의 소자를 사용해 차세대 전력 반도체의 개발을 진행중에 있다. 이를 통해 열특성을 향상시키고, 속도를 강화시키고, 고전압, 고전류, 스위칭 손실 최소화 등이 가능하다.\n" +
                    "전력반도체는 전력을 사용하는 모든 기기에 사용이 가능하고, 전원 또는 배터리로부터 공급되는 전력을 통해 다양한 시스템이 필요로 하는 전압과 전류 수준으로 변화시켜 시스템 전체의 전력을 관리한다. 또한 교류를 직류로 변환시키고, 전압을 승압 및 강압하는 변환을 진행하며, 전력을 분배하거나 On/Off 하는 기능을 수행한다.\n" +
                    "전력반도체 소자 종류에는 MOSFET, 바이폴라, IGBT(Insulated Gate Bipolar Transistor)가 있다. 이 중 IGBT는 입력부가 MOSFET 구조이고, 출력부가 바이폴라 구조인 복합 디바이스로, 전자와 정공의 2종류 캐리어를 사용하는 바이폴라 소자이다. 비교적 빠른 스위칭의 특성을 갖지만 파워 MOSFET에 비해서는 열등한 약점이 있다.\n"
            },
            {"이번 프로젝트를 통해 반도체 공정 단계 (8대공정)와 반도체 기본 특성(물리적 화학적 특징), 소자(다이오드, 커패시터, 트랜지스터)의 특성과 작동 원리를 알아볼 수 있었고, 반도체 재료에 따라 원소반도체, 화합물반도체, 산화물반도체, 유기반도체로 분류되며, 소재의 합성과 발전이 어떠한 장점을 바탕으로 발전되었는지 확인할 수 있었다.\n" +
                    "또한 차세대 반도체로 연구되는 디스플레이와 반도체, 광반도체, 전력반도체의 연구 및 개발 상황과 차세대 반도체들이 어떠한 산업분야에 어떠한 방식으로 이용되는지 알아볼 수 있었다.\n"
                    }
    };
    String[][] references7 = new String[][] {
            {"(1)\t김도우. (2023). 알기쉬운 반도체 제조공정. 복두출판사.",""},
            {"(2)\t기쿠치 마사노리. (2022). 처음 배우는 반도체. 북스힐.",""},
            {"(3)\t다이오드 역할, 종류, 구조 및 원리(웹사이트), 2023.11.13.", "https://krnd.kr/%EB%8B%A4%EC%9D%B4%EC%98%A4%EB%93%9C-%EC%97%AD%ED%95%A0-%EC%A2%85%EB%A5%98-%EA%B5%AC%EC%A1%B0-%EB%B0%8F-%EC%9B%90%EB%A6%AC/"},
            {"(4)\t전자혁명의 시초 ‘트랜지스터’ 알아보기(웹사이트), 2023.11.13.", "https://news.samsungdisplay.com/23538/"},
            {"(5)\t정용성. (2022). 반도체 소자의 이해. 정일.",""},
            {"(6)\t최병태. (2020). 반도체 소자의 산업현황 및 기술동향 (국내석사학위논문). 忠南大學校 産業大學院, 대전.",""},
            {"(7)\tFeng M ,Holonyak N ,Hafez W . (2004). Light-emitting transistor: Light emission from InGaP/GaAs heterojunction bipolar transistors Applied Physics Letters, 84 (1) ,151-153.",""},
            {"(8)\tVerzellesi G ,Bergamini D ,Betta G -F D ,Piemonte C ,Boscardin M ,Bosisio L ,Bettarini S ,Batignani G . (2006). N-p-n bipolar-junction-transistor detector with integrated p-n-p biasing transistor-feasibility study, design and first experimental results Semiconductor science and technology, 21 (2) ,194-200.",""}
    };




    /**
     * 논문8
     */

    String title8 = "Edge-directed BCP nanopatterns";

    String category8 = "SemiConductor";
    String[] author8 = new String[]{"구도은", "정우림"};
    String[][] contents8 = new String[][]{
            {"1. 서론", "1-1. 그래핀이란?", "1-2. 그래핀 성장법", "1-3. 그래핀의 응용"},
            {"2. 그래핀과 나노패터닝", "2-1. Block copolymer를 이용한 나노패터닝 형성", "2-2. Edge-directed BCP nanopatterns"},
            {"3. DSA 기술을 적용한 GNR의 특성 분석", "3-1. GNR의 LER 및 LWR 값 분석", "3-2. 순수 그래핀과 GNR의 라만 스펙트럼 비교"},
            {"4. 결론"}
    };
    String[][] text8 = new String[][]{
            {"",
                    "그래핀(graphene)은 탄소 동소체 중 하나로, 탄소 원자들이 육각형의 격자로 모여 sp2 구조로 2차원 평면을 이루고 있는 구조이다. 흑연은 그래핀 이 여러 층으로 되어 있는 형태로, 흑연을 박리하여 얻은 1장 layer가 그래핀이라고 할 수 있다. 원자 1개의 두께로 이루어진 얇은 막으로, 두께는 약 0.2nm 정도로 매우 얇으면서 물리적, 화학적 안정성이 높다.\n" +
                    "\n" +
                    "2004년 물리학자 안드레 가임과 콘스탄틴 노보셀로프 가 연필심을 스카치 테이프로 뗴어내는 방식으로 그래핀을 처음 분리하였고, 그 공로로 노벨 물리학상을 수상하였다.\n" +
                    "\n" +
                    "현존하는 소재 중 가장 얇은 물질로 구리보다 전류밀도가 높고 극저온에서만 관측되는 양자 홀효과를 상온에서 보이는 특성이 있다. (※양자홀효과: 도체나 반도체에 전류가 흐를 때 수직 방향으로 자기장을 걸면 이에 비례해 전압이 생기는 현상) 그래핀은 투명하며 빛의 2~3%만을 흡수해도 상온에서 은보다 열전도성이 높으며, 전자가 마치 질량이 없는 것처럼 움직여 기존 반도체보다 전기의 흐름이 빨라질 수 있어 실리콘 기판을 대체할 수 있는 차세대 재료로 각광받고 있다. 그래핀은 강도, 열전도율, 전자이동도 등 여러 가지 특징이 현존하는 물질 중 가장 뛰어난 소재로 디스플레이, 이차전지, 태양전지, 자동차 및 조명 등 다양한 분야에 응용되어 관련 산업의 성장을 견인할 전략적 핵심소재로 인정받고 있다.\"\n",
                    "현재까지 이루어진 그래핀의 개발은 크게 그래핀을 대량생산할 수 있는 그래핀 ‘합성분야’와 생산된 그래핀을 적용하여 기존의 재료를 대체하여 성능을 개선시킬 수 있는 ‘응용분야’로 진행되고 있다. 현재 그래핀을 생산하는 방법은 크게 4가지 Process로 구분되나, 본격 대량생산에 이르기까지는 일정기간 소요될 것으로 예상된다.\n" +
                            " \n" +
                            "셀로판테이프를 활용한 기계적 박리법, 메탄과 수소 등과 탄소의 반응을 이용한 화학증착법, 실리콘 카바이드를 한층 한층 쌓아올려 만드는 에피텍셜 합성법, 산화-환원 반응을 이용한 화학적 박리법 등이 있다.\"\n",
                    "그래핀은 투명전극, 가스 베리어, 에너지 전극, 인쇄전자용 잉크, 복합소재, 방열소재 등으로 쓰일 수 있다.\n"},
            {"",
            "그래핀의 우수한 전하 수송 특성에도 불구하고, 그래핀의 밴드갭이 kT 이상이 되지 못하여 전기 소자로의 적용이 제한되고 있다. 즉 그래핀이 도체의 성질을 띄기에, 반도체로 사용하 기에 제한이 따르는 단점이 있다. 이러한 문제점을 해결하고자 quantum confinement 효과를 이용하여 그래핀의 밴드갬을 늘이고자 하는 노력이 많이 경주되고 있다. 이와 같이 그래 핀의 밴드갭을 형성하기 위한 노력들에는 Scanning tunneling lithography, Nanoparticle, Block copolymer를 이용한 나노패터닝 등이 있다. 이 중 Block copolymer를 이용한 나노패터닝 기술에 대해 알아보았다.  \n" +
                    "\n" +
                    "Block copolymer를 이용한 나노패터닝 기술의 공정과정은 다음과 같다. 그래핀 층 위에 10nm 두께의 SiO2를 형성하여 wetting 성질을 향상시킨다. Polystrene (PS) 과 Poly(methyl methacrylate) (PMMA)의 계면에너지를 조절하고 cylindrical domain의 수직 배향성을 향상시키기 위해서 SiO2 층 위에 MMA, S, glycidyl methacrylate (GMA)로 구성된 random copolymer 층 (P(S-r-MMA-r-GMA))을 형성한다. 그 위에 block copolymer인 P(S-b-MMA)층을 형성하고 PMMA층을 UV 조사를 통하여 제거시킨다. O2 플라즈마와 CHF3 + O2 혼합가스 플라즈마를 사용하여 P(S-r-MMA-r-GMA) 층과 SiO2 층을 식각해냄으로서 그래핀 층 위에 패턴을 형성하고 마지막으로 O2 플라즈마를 사용함으로서 그래핀에 나노 패턴 형성을 마무리한다. 패턴 형성 후 남아있는 패터닝 구조체는 HF 용액을 이용하여 SiO2 제거함으로서 없앨 수 있다.\n" +
                    "\n",
                    "Block copolymer 중 자가조립 관련 “Atomically Flat, 2D Edge-Directed Self-Assembly of Block Copolymers” 논문을 리뷰하였다.\n" +
                            "\n" +
                            "2D material(그래핀, MoS2, h-BN)의 단층, 소수층 플레이크는 벌크 결정에서 SiO2 기판 위로 기계적으로 박리된다. 추가 처리, 표면 변형없이 실린더 형태를 형성하느 PS-b-PDMS BCP와 PS 단독중합체를 9:1로 혼합하였다. 박막 기판 위를 스핀 코팅, 열처리 (280˚C, 3분)를 하면 자가조립이 촉발된다. \n" +
                            "\n" +
                            "이 그림은 8nm 폭의 평면 내 나노실린더가 120nm 폭의 선형 모양 그래핀 플레이크를 따라 고도로 정렬된 것이다. 나노실린더의 방향 매핑을 보여주며 플레이크 길이 방향을 따라 단방향 정렬을 보여준다. \n" +
                            "\n" +
                            "Edge-directed BCP nanopattern에 대해 분석하였다. 이 표에서는 interfacial energy(γ) 차이를 보여주고 있는데, 2D 플레이크가 있는 경우 표면에너지가 변형됨을 알 수 있고, 이는 wetting 거동 변화로 이어질 수 있다. \n" +
                            "\n" +
                            "SiO2 표면에서 PS와 PDMS의 wetting은 반데르발스 상호작용에 의해 지배된다. 그래핀의 경우 π 오비탈 사이의 중첩을 통해 PS의 페닐 측 그룹과 특정 π-π 상호작용을 가질 수 있으며, 그 강도는 일반적인 수소결합과 비슷하다. 따라서 그래핀에서의 계면에너지 차이는 비교적 작다. 반면, h-BN의 경우, 질소 붕소의 전기음성도 차이로 인해 전하 분포가 불균일하여 π 전자가 부분적으로 비편재화된다. 상대적으로 낮은 전하밀도를 갖는 방향고리의 중 심이 우선적으로 질소원자 위에 위치하여 특정 원자 배열을 제시한다. 따라서 h-BN은 계면에너지 차이가 큰 것이다. \n" +
                            "\n"
            },
            {"",
            "위에서 소개된 BCP directed self-assembly (DSA) 기술은 패터닝된 그래핀 나노 리본 (GNR)을 제작하는데 사용할 수 있다.  BCP의 패턴이 그래핀에도 옮겨질 경우 만들어지는 GNR은 10 nm의 간격을 갖게 되는데, 이 경우 그래핀의 on/off 비율이 60,000까지 증가하며, 그래핀이 반도체의 물성을 띠기 위해 필요한 증가된 밴드갭의 조건을 만족하게 된다. 여기서 on/off 비율은 on-state에서의 전류와 off-state에서의 전류 크기의 비율이다.\n" +
                    "\n" +
                    "반도체에서는 roughness 수치가 중요한데, 여기서 살펴볼 roughness에는 Line Edge Roughness (LER), 선 가장자리 거칠기와 Line Width Roughness (LWR), 선폭 거칠기가 있다. LER은 반도체의 edge가 이상적인 상태에서의 edge에 비해 얼마나 벗어나 있는가를 뜻하며, LWR은 선폭이 얼마나 벗어나 있는가를 뜻한다. 기존의 포토리소그래피 (photolithography)로 처리된, 패턴이 새겨진 BCP를 이용한 GNR 패터닝은 정교한 품질의 패턴을 만들어 내는데에 내재적인 한계가 있다. 따라서 BCP 나노패턴의 LER와 LWR가 악화될 우려가 있으며 결과적으로 생산되는 GNR의 반도체로서의 품질이 저하된다. 이에 비해, directed self-assembly 로 생성된 패턴의 BCP는 이러한 GNR의 결함과 훼손을 최소화할 수 있다. \n" +
                    "\n" +
                    "여기서 소개하는 Edge-directed self-assembly 기술로 패터닝한 GNR의 Line Edge Roughness (LWR)와 Line Width Roughness (LWR) 은 각각 2.13 nm와 1.43 nm이다. 이는 BCP를 가지고 chemoepitaxy나 nanoimprinting과 같은 다른 기술로 패터닝을 한 것에 비해 훨씬 낮은 수치를 드러내는데, 이는 DSA 기술로 BCP에 만들어낸 2D edge가 원자 단위 수준으로 민감하기 때문이다. 또한 DSA로 패터닝한 GNR의 LER 및 LWR 수치는 알려진 리소그래피 방법 중 가장 높은 품질의 패턴을 생산하는 EUV 리소그래피 수치에 준한다. 이는 실제로 반도체 리소그래피에서 사용되는 기술인데, DSA는 EUV를 이용한 패터닝에 비해 비용과 복잡성 측면에서 더 유리한 기술이다. 이런 측면에서 DSA 기술은 넓은 면적의 나노 패터닝을 할 때 EUV 리소그래피와 호환 가능한 기술이라고 생각된다.\"\n",
                    "라만 스펙트럼을 이용하면 그래핀 층의 개수, 도핑 상태, 그리고 결함 수준 등을 알 수 있다. 라만 분광법에서 모든 탄소는 공통적으로 G peak와 D peak라는 특징적인 피크를 보인다. 800-2000 cm-1 범위에서 G peak는 1580 cm-1, D peak는 1350 cm-1에서 나타나는데, G peak의 경우 Brillouin-zone 중심에서 축퇴(degenerate)하는 E2g phonon에 상응하는 것이고, D peak는 Brillouin-zone의 K 점 주변 TO phonon에 의해 나타나는 것이다. 2D peak는 이 D peak의 second-order으로, 2700 cm-1에서 관찰 가능하다.\n" +
                            "\n" +
                            "이 실험에서는 패터닝 처리를 하지 않은 순수 그래핀 (Graphene으로 표시)과 GNR의 라만 스펙트럼을 2D peak과 G및 D peak에서 비교해 보았다. 먼저 순수 graphene은 2D와 G peak에서의 intensity 비율이 4에 가까우며, 따라서 단층 그래핀이라는 것을 확인할 수 있었다. 그에 비해 GNR의 2D peak의 intensity는 훨씬 낮았다.\n" +
                            "그래핀의 2D peak는 물질의 sp2 결합된 탄소 원자들의 면적 밀도에 비례한다. 순수 그래핀에 비해 낮게 나타나는 GNR의 2D peak intensity는 패턴을 따라 식각 공정을 거치면서 남아있는 sp2 탄소 수가 줄었기 때문이다. 한편, 순수 그래핀에서 G peak가 뚜렷하게 나타나는 것에 비해 GNR에서는 D band의 intensity가 높게 나타나며, D’ peak도 나타난다. 순수 그래핀에서 보이지 않는 두 peak가 GNR에서 나타나는 이유는 D-와 D’- band가 나노 리본의 edge에서 일어나는 scattering 때문이며, 이는 GNR이 만들어질 때 edge site가 생성됨을 뜻한다.\"\n"
            },

            {"가임과 노보셀로프가 흑연에서 그래핀 층을 분리해 낸 이후로부터 그래핀은 “꿈의 신소재”라고 불리며 연구와 투자가 계속되어져 왔다. 특히 기존 반도체의 기판을 구성하는 실리콘이 고온과 고압에 약하다는 단점을 보완할 수 있다는 특징에서 시작한, 그래핀을 반도체 시장에 활용하기 위한 연구는 진행중에 있다. 우리나라에서 삼성전자와 LG전자와 같이 반도체와 가전을 생산하는 기업들은 각각 그래핀 제조 기업인 ‘그래핀스퀘어’의 지분을 매입하고, 그래핀을 적용한 가전 제품을 선보이는 등 그래핀 소재에 대한 투자를 계속해 오고 있다. 이러한 기업들의 시도는 제품의 내구성 및 에너지 효율을 높이는 목적을 위한 것으로 해석된다. 시장조사업체 모르도르 인텔리전스가 조사한 바에 따르면 전 세계적으로 그래핀 시장 규모는 2023년 기준 1조 50억원 규모에서 2028년에는 6조 1613억원 규모에 이를 것으로 예상된다. \n" +
                    "\n" +
                    "현재 그래핀 시장에서 요구되는 기술적 성능은 제조수율, 저가, 순도, 저결함도, 두께 균일도, 대면 적화 등이 있다. 그래핀을 나노 플레이크, GO(그래핀 산화물), CVD 그래핀으로 구분할 때, 전체 수요 중 그래핀 나노플레이크가 절반을 차지하는데, 상용화하는 공정에서 불순물로 인한 순도 저하나 플레이크의 불균일성으로 인한 공정의 신뢰성이 떨어지기도 한다. 그래핀이 sp2구조라 분산도가 낮아 균일성을 낮다는 분석이 있어, 이를 높이기 위한 용매 설계가 필요하다. \n" +
                    "\n" +
                    "본 연구에서 우리는 도체의 물성을 띠는 그래핀의 밴드 갭을 높여 반도체에 활용하기 위해 쓰이는 그래핀 패터닝 기술에 대해서 다루었으며, 특히 자가 조립된 (DSA) block copolymer (BCP)를 이용해 그래핀을 패터닝한 실험을 중점적으로 다루면서 그 효과를 알아보았다. 상대적으로 낮은 비용으로도 EUV로 패터닝한 그래핀만큼의 높은 품질을 가진 제품을 생산해 낼 수 있다는 장점으로, 그래핀을 활용한 전자제품을 상용화하려는 앞으로의 반도체 시장에서 상당히 주목할만한 기술이라고 평가된다. \n" +
                    "\n"}

    };
    String[][] references8 = new String[][] {
            {"(1)De Heer et al. Epitaxial graphene, Solid State Communications 143, pp.92-100 (2007).", ""},
            {"(2)Ishigami et al. Atomic Structure of Graphene on SiO2, Nano Letters 7(6), pp. 1643-1648 (2007).", ""},
            {"(3)Kim et al. Atomically Flat, 2D Edge-Directed Self-Assembly of Block Copolymers, Advanced Materials 35, pp.1-8 (2023).",""},
            {"(4)Kunc et al. Raman 2D Peak Line Shape in Epigraphene on SiC, Applied Sciences 10(7), pp.1-12 (2020).",""},
            {"(5)Neto et al. The Electronic Properties of Graphene, Reviews of Modern Physics 81(1), pp.109-162 (2009). ",""},
            {"(6)\tYang et al. Quasiparticle Energies and Band Gaps in Graphene Nanoribbons, Physics Review Letter 99, pp.1-5 (2007).",""}
    };



    /**
     * 논문9
     */

    String title9 = "SiC의 결정 구조와 전력반도체 신뢰성 분석\n";

    String category9 = "SemiConductor";
    String[] author9 = new String[]{"김명현", "이서영"};
    String[][] contents9 = new String[][]{
            {"1. SiC 반도체 연구의 필요성"},
            {"2. SiC 반도체의 전기적 특성", "2-1. SiC의 전기적 특성", "2-2. 구조와의 연관성"},
            {"3. SiC 반도체의 구조적 특성", "3-1. 반도체의 구조적 특성", "3-2. SiC의 결함"},
            {"4. SiC 반도체의 연구방향과 그 응용분야"}
    };
    String[][] text9 = new String[][]{
            {"전력반도체는 배터리에 사용되면서 배터리가 전력을 공급하고 배분하는 과정에서 발생하는 필연적 전력손실을 최소화하는 데에 관여한다. 따라서 우수한 전력 반도체로서 작동하기 위해서는 높은 항복전압, 저손실, 그리고 높은 전류분담 능력을 갖는 것이 필수적인 요소이다. \n" +
                    "뿐만 아니라 발열로 인한 전력 손실과 이로 인한 동작 불안정성의 특성들이 전력반도체의 신뢰성에 영향을 미칠 수 있기 때문에 다음의 요소도 고려할 필요가 있다. 온-저항은 반도체 동작 시 입력 저항으로, 온-저항이 클수록 발열에 의한 전력 손실이 커지고, 또한 발열에 의하여 동작이 불안정해져 소자의 수명이 단축되어 신뢰성이 저하된다. 따라서 내압과 온-저항을 개선하기 위한 접근법으로 소자의 구조를 변경하여 공핍층에서 금지대의 폭을 더욱 크게 만들거나, 실리콘 대신 큰 대역 간극을 갖는 반도체 재료를 바탕으로 MOSFET의 일종인 IGBT(고전압 에서도 고속 스위칭 동작이 필요한 곳에서 사용됨)를 개발하는 방법이 있다. 최근 새로운 재료 중 특히나 실용적인 SiC 반도체를 이용한다면 내압은 실리콘의 10배, 전력 손실은 100분의 1배로 억제되는 동시에 낮은 온-저항의 특성으로 인한 스위칭 속도의 개선될 것으로 예상하고 있다. 그러나 이외에도 SiC는 전력반도체로써 기능하기에 우수한 물성인 고에너지갭 특성 및 높은 열전도도, 항복전압 및 포화 이동도 등을 갖고 있어 전력 산업에서 가장 발전가능성이 높은 소재로 각광을 받고 있다.\n" +
                    "앞으로의 다를 내용에 있어서는 SiC의 구조적인 분석을 바탕으로 차세대 전력 반도체로서 갖는 SiC의 전기적인 우수성을 해석할 것이고, 뿐만 아니라 최근 대두되고 있는 에피택시 성장기술이 현재 SiC의 상용화를 가로막고 있는 다양한 내부 결함들을 어떤 식으로 보완시켜 신뢰성을 확보해 나갈 것인지를 서술하면서 앞으로 SiC 및 관련 기술이 발전해 나갈 방향성에 대해 구조적인 관점에서 논의하고자 한다.\n"},
            {"",
                    "SiC 전력반도체는 기존의 Si 반도체와 비교하여, 여러 분야에 응용 가능한 우수한 물성을 가진다. SiC 전력반도체를 통해 Si 원소의 특징과 수직소자를 구현할 수 있고, 신뢰성과 생산성이 뛰어나 상용 웨이퍼 수급이 가능하다는 장점이 있다.\n" +
                            "우선 SiC 반도체는 전력변환과정에서 손실이 적어 효율이 높다. SiC의 절연파괴강도는 3*106V/cm이며 이는 Si의 약 10배에 해당한다. 절연파괴강도란, 소자의 높은 전기 저항률을 유지할 수 있는 강도를 의미한다. 이 전계강도가 클수록 시스템의 전기적 손실은 줄어든다. 즉, SiC 반도체를 통해 내전압이 높으면서도 손실이 적은 전력소자의 구현이 가능함을 의미한다.\n" +
                            "SiC의 전류밀도는 Si와 비교하여 5~10배 크다. 이는 더 작은 칩으로 동일한 성능을 구현해 낼 수 있음을 의미하며, 이는 칩 단가 하락과 스위칭 손실의 감소를 가져온다. 1980년대까지는 SiC 반도체 중에서도 금속산화막반도체 전계효과트랜지스터 (Metal Oxide Semiconductor Field Effect Transistor, MOSFET)와 바이폴라접합 트랜지스터 (Bipolar Junction Transistor, BJT)가 주로 개발되었다. 이후 1980년대 중반, MOSFET과 BJT의 장점을 결합시킨 절연게이토바이폴라 트랜지스터 (Insulated Gate Bipolar Transistor, IGBT)가 개발됨으로써, 전력반도체의 비약적 발전이 이루어졌다. 이는 10년여 동안 매년 5~6배에 가까운 전류밀도 향상을 이루어냈다.\n" +
                            "또한, SiC 전력반도체는 드리프트층의 두께를 얇게 하여 특정 항복전압 구현 시에 비저항을 줄일 수 있다. 이 과정에서 소자의 발열은 줄어들고 방열을 위한 장치들의 수를 줄일 수 있다. 시스템의 pn 접합에 가하는 역방향 전압의 크기가 어느 한계를 넘으면 큰 전류가 흐르게 되는데, 이 때의 전압을 항복 전압이라고 부른다. 드리프트층이란, 밴드갭 내의 캐리어가 존재하는 영역을 말하며, 반도체 소자의 성능을 결정하는 데 중요한 역할을 한다. 드리프트 영역의 저항이 높을수록 캐리어의 이동도가 낮아져 반도체의 최적화가 어렵다. SiC 반도체의 발전을 통해, 드리프트 영역의 저항을 효율적으로 감소시킬 수 있게 되었다. Si 반도체의 기본 구조와 비교하였을 때, P+ 영역이 추가적으로 생성됨에 따라 저항이 감소하게 된다. 기존에 특정 영역에만 집중되던 전계가 넓은 영역으로 분산됨에 따라 높은 항복전압 특성을 얻을 수 있게 된 것이다. 그 영역에서 높은 문턱전압 현상을 보인다는 단점이 발생하므로, 관련 연구의 진행이 요구된다.\n" +
                            "또한 시스템에 쌍극성 소자를 사용할 필요 없이, MOSFET이나 쇼트키 다이오드 등의 단극성 소자를 전력변환시스템에 사용하여 충분히 낮은 온저항을 구현할 수 있다. 쌍극성 소자에 비해, 단극성 소자에서 다수의 캐리어들이 사용되므로 재결합 시간이 줄어들어 고속 스위칭이 가능하다는 장점이 있다. 고속 스위칭이 이루어질 경우, 전력을 변환하는데 필요한 수동소자의 크기가 줄어들어 전체적인 시스템의 부피와 무게를 줄일 수 있다.\n" +
                            " SiC의 에너지밴드갭은 3.26eV로, Si보다 세 배 넓은 값을 가진다. 넓은 밴드갭은 반도체 소자로 하여금 항복전압, 도통저항, 역방향손실, 누설전류와 같은 전기적인 특성이 온도에 둔감할 수 있도록 한다. 즉, 높은 동작 온도에서도 안정된 상태를 유지함으로써, 시스템의 방열판의 크기를 줄이거나 쿨러의 크기를 줄일 수 있다는 장점을 지닌다.\n" +
                            "SiC는 3.7W/cmK의 열전도도를 가지며, 이 역시 Si의 3배에 해당한다. 즉 동일한 도통손실이 발생하여 동일한 정도의 발열이 발생해도, Si에 비해 1/3 수준의 면적만으로도 SiC 반도체의 구현이 가능한 것이다. Wide BandGap 반도체에 해당하는 SiC가 강한 공유결합으로 이루어져 있으므로, 격자에너지 산란이 적기 때문에 높은 열전도율을 나타낸다.\n",
                    "구조적 관점에서 보면, 다이아몬드가 가장 이상적인 반도체 소자이지만, 원자간 결합에너지가 너무 강해 불순물의 주입이 어렵고, 금속화와 같은 소자공정에서도 극복해야 할 장벽이 높아 상용화가 쉽지 않다. 에피택시 기술을 도입한 SiC 반도체 웨이퍼는 이상적인 상업용 반도체의 구현에 중요한 역할을 할 것으로 보인다.\n",
                    },
            {"",
                    "반도체 소자를 제조하기 위해서는 구성이 초고순도일 뿐만 아니라 완벽에 가까운 결정 구조를 가져야 하는데 그 이유는 반도체가 전기적인 결함을 갖거나 기계적인 결함을 갖게 되면 반도체 소자의 동작에 불리한 결과를 가져오기 때문이다. 반도체의 구조적인 조직에 따르자면 고체는 결정질(crystalline), 다결정질(poly crystalline), 비정질(amorphous)로 구분된다. 이 중에서 반도체 웨이퍼 제조공정은 순수하고 단결정인 실리콘 구조를 요구하고 있다. 단결정의 반복되는 단위격자는 허용 범위 내에서 전기적, 기계적 특성을 제공하여 보다 제어하기에 용이하기 때문이다. 반면에 허용하기 어려운 결정 구조와 결함은 웨이퍼 제조공정에 영향을 주어 미소결함의 형성에 영향을 미치게 된다. 반도체는 동일 구조 내에서도 서로 다른 방향에서의 결정의 특성은 달라지게 된다.\n" +
                            "반도체의 결함 현상을 줄이고 캐리어 수명시간, 전도 특성, 고전압, 등을 개선시킬 수 있는 기술로 에피 택시가 중요시되고 있다. 박막 결정성장에는 몇 가지 방법이 있지만, 그 중에서 에피택시(epitaxy)는 결정 기판 위에 원자를 정렬시켜서 단결정을 성장시키는 기술로 새로 성장한 막층의 격자구조가 기판의 격자 구조와 같게 되는 특징을 지닌다. 이 에피택셜 성장 기법을 사용하는 가장 중요한 이유는 에피택셜 막에서 불순물을 제어하기가 용이하기 때문이다. 대표적으로 고온 산화 공정에서 실리콘 웨이퍼 상의 산화물을 성장 또는 증착시키는 방식으로 이루어지고 있는데, 이때 적절한 제조공정 제어를 하게 된다면 산화물 층(또는 SiO2층)의 높은 품질, 안정성, 올바른 유전체의 특성을 보장할 수 있는 장점을 지니고 있다.\n",
                    "우선 들어가기에 앞서, SiC 웨이퍼의 결함은 일반적으로 두 가지로 분류된다. 첫번째는 웨이퍼 내의 결정 결함이고, 두번째는 웨이퍼 표면 또는 그 부근에서 일어나는 표면 결함이다. 결정 결함에는 Basal plane dislocations (BPDs), stacking faults (SFs), threading edge dislocations (TEDs), threading screw dislocations (TSDs), micropipes and grain boundaries 등이 있고, 결정 성장 과정에서 형성된 다음의 결함들은 이후 에피택셜 층과 웨이퍼로 확장되어 표면결함인 Carrots, Polytype Inclusions, Scratches를 야기한다. 이때, SiC의 에피층 제조 공정 중 에피 영역 내에 주로 Micropipes dislocations (MPDs), Basel plane dislocations (BPDs), Carbon vacancy (Vc) 등의 결함들이 발생하고 있고, 이는 전체 반도체의 신뢰성(낮은 스위칭 특성 야기)에 영향을 미칠 수 있다. 그리고 다양한 결함은 저마다 다른 정도의 영향을 유발한다. 따라서 결정 내에 존재하는 내부결함들을 분석해서 SiC반도체 소자에 응용될 SiC 기질의 질을 향상시킬 수 있는 성장조건을 찾아냄으로써, 어떻게 결함 밀도가 더 낮아지도록 SiC 웨이퍼를 성장시킬지 기술 개발 방향을 찾는 것이 매우 중요한 과제이다.\n" +
                            "우선 SiC 내 결함 중에서 MPDs(Micropipes dislocations)는 에피 성장 시에 가장 많이 볼 수 있는 결함으로, 기판에서 edge와 screw dislocation이 혼합되어 형성된 결함이다. MPDs가 생성되는 이유 중 첫 번째는 SiC 기판 표면의 손상을 감소시키는 고온 및 자외선 공정 등으로 인해 생성되고, 두 번째는 SiC 기판 위 불순물 간의 충돌에 의한 잔여물이 이후에 에피 성장 시에 불완전한 격자 조합을 야기하면서 거시적인 결함 형태로 생성된다. MPDs는 누설 전류의 증가와 항복전압을 감소시키는 역할을 한다. 현재는 에피택시 과정에서 흑연(C)외에 활성탄 비율의 조절 등의 성장 조건, 온도, 압력의 정밀한 조절을 통해 그 밀도를 0에 가깝게 조절할 수 있는 상황이다. 뿐만 아니라 특정 결정 면에 대한 SiC의 결정 성장 방향은 마이크로 파이프의 발생을 줄일 수 있는 또 다른 방법이 될 수 있다. 예를 들어, SiC의 원자 표면에 대해 6H에서의 (1100),(1120)에서 표면마다 접합의 구성이 고유하게 구성되고, 적층 단층 밀도가 (1120)이 높다는 것을 통해 c축에 수직한 방향으로의 성장이 용이함을 알 수 있다. 또한 4H의 (1100)방향의 경우 좁은 하부 표면으로 더 핵이 많이 생성되고 재배열이 쉽기 때문에 4H에서의 제어가 쉽다는 것을 알 수 있다.\n" +
                            "다음으로 SiC 내 결함 중 BPDs(Basal plane dislocations)는 고밀도의 어긋난 결함으로 인해 생성된다. 또한 BPDs는 주로 SiC 격자 상수의 c-axis에 존재하는데 이는 4H 그리고 6H-SiC 결정 구조의 기울어진 면 사이에 큰 공간이 발생함에 따라 나타나게 된다. BPDs가 생성되는 이유는 MPDs와 마찬가지로 기판 표면의 안정적인 에피 성장을 위해 성장 온도와 실온의 차이와 basal plane의 기울어진 결정 경계로 인해 생성된다. 이로 인해 MOSFET 또는 JFET의 누설 전류를 증가시키는 것으로 알려져 있다. BPDs의 전위선은 성장 방향에 수직이기 때문에 응력 한계가 발생하고 있고 아직까지 결함 밀도의 감소를 위해 연구 중이다. 현재까지 응력을 줄일 수 있는 방법으로는 Carbon/Si 비율 조절, 방사형 및 푹 방향 온도 구배를 조절하는 것 외에도 성장면 자체의 모양이 결정에 응력을 유발하는 것을 이용하고 있다. 성장 계면의 곡률이 높을수록 더 많은 BPD배열을 형성하고 이는 응력의 양을 최소화하여 앞으로 응력과 BPD의 상관관계를 증명함으로써 줄일 수 있을 것으로 보인다.\n" +
                            "앞에서 서술한 바와 같이 SiC 기반 전력 소자에서 에피 영역의 품질은 해당 기반 소자의 성능을 결정하는 큰 요소로서, 에피 영역의 두께와 도핑농도를 조절함으로서 다이오드, 트랜지스터, 사이리스터 등에서 높은 항복전압과 고효율 소자를 구현을 수 있다. 그러나, 에피 영역의 성장 조건 가운데 두께와 도핑농도의 최적화는 Carbon/Si 비율과 성장 온도 조절의 한계와 맞물려 있으며 주로 이러한 조건을 조절하면서 최적화하는 연구가 계속적으로 진행되고 있다. 또한, SiC 에피 영역의 특성 향상을 위한 측면 가운데에는 캐리어 수명시간을 길게 유지할 수 있는 것이 중요하다. 현재 SiC 유니 폴라 소자에서는 캐리 어 수명시간 조절이 가능하지만, 바이 폴라 소자에서는 에피 영역의 결함들이 낮은 캐리어 수명시간과 문턱전압을 야기하는 주된 장애물로 알려져 있다. 그러므로 SiC 에피 영역의 결함들의 농도와 ~10μs 이상의 캐리어 수명시간을 증가시킬 수 있는 연구가 필요하다.\n" +
                            "Vc(Carbon Vacancy)가 대표적으로 캐리어 수명시간 단축을 유발하는 결함으로, 낮은 성장 온도에서 높은 Carbon/Si 비율일 때 Vc가 감소하게 된다. 최근 이를 위한 대안으로 두가지 방안이 대두되고 있는데, 첫번째는 SiC 에피 영역의 Si-face를 감소시키기 위해 SiO2 층을 열산화 공정으로 생성하는 방법이 있고, 두 번째는 1,600℃ 이상의 고온 상태에서 표면에 Carbon 이온 주입 공정을 하는 방법이 있다. 이를 통해 에피 영역에 탄소를 주입시켜 Vc 감소 및 캐리어 개선의 결과를 얻을 수 있다.\n",
            },
            {"SiC 소자는 WBD(전력 반도체) 물질 중에서도 에피 생산기술과 신뢰성이 확보되었다는 점에서 우수성을 가진다. SiC의 우수한 물성에 더하여, 단결정 및 에피택시 성장 기술의 확립은 초저손실, 고열전도율, 고온반도체의 구현에 기여하였다.\n" +
                    "SiC 기반 다이오드의 구조를 조정함으로써, 항복 전압의 향상과 높은 전류 밀도의 구현 등을 이룰 수 있다. 발전된 SiC 다이오드에서는 높은 열전도도라는 특성을 활용하여 고온 환경에서의 응용을 개발하고 있다. 따라서, 화력발전소 연소기나 자동차 엔진의 연소제어용 시스템 IC의 구현을 이뤄낼 것으로 전망된다.\n" +
                    "또한, SiC 반도체에서 에피 영역의 품질은 고전압, 높은 캐리어 수명 시간, 전도 특성 등을 개선할 수 있는 요소이다. 결정의 결함에 대한 연구가 지속됨에 따라 소자의 개발이 이루어지고 있으며, 수십 kV 이상의 전력 소자에 WBD SiC 소자가 응용될 것으로 전망된다.\n" +
                    "다른 Wide BandGap 물질들과는 달리, SiC를 활용해서는 양질의 상업용 기판이 생산되고 있다. 현재 전력반도체는 인공지능과 사물인터넷 등과 같은 서버 파워서플라이 분야와 하이브리드 자동차 등에 활용된다. 반도체 웨이퍼 기술이 발전하고, 전기자동차의 수요가 증가함에 따라 SiC 전력반도체의 성능의 향상도 함께 요구될 것이다.\n" +
                    "\n"}

    };
    String[][] references9 = new String[][] {
            {"[1] 박성준∙구상모, 탄화규소 (SiC) 기반 파워 소자 동향 및 응용, 전기전자재료 제30권 제6호, 2017, 19-26.", ""},
            {"[2] 김은동, SiC 반도체 기술현황과 전망, 한국전기전자재료학회 2001년도 추계학술대회 논문집, 2001, 13-16.", ""},
            {"[3] 강인호, SiC 전력반도체 기술, 전력전자학회지 제24권 제2호, 2019, 26-32.",""},
            {"[4] 강인호∙방욱∙문정현∙나문경, SiC 전력반도체 소자기술 동향, Ceramist Volume 16 Issue 4, 2013, 7-16.",""},
            {"[5]Po-Chih Chen 외 11명. Defect Inspection Techniques in SiC, 2022",""},
            {"[6]김화목, 강승민, 주경, 심광보. 승화법에 의한 6H-SiC 단결정 성장 : (II) 내부 결함 해석, 한국결정성장학회지. v.7 no.2. 1997년. pp.191-196",""},
            {"[7]강승민, 오근호. 6H - SiC bulk 단결정 성장 양상과 micropipe에 관한 연구. 한국결정성장학회지. v.5 no.1. 1995년. pp.44-49",""},
            {"[8]Jun Lin Liu, Ji Qiang Gao, Ji Kuan Cheng, Jian Feng Yang, Guan Jun Qiao. Methods for the reduction of the micropipe density in SiC single crystals. 2007",""},
            {"[9] J. Millán, P. Godignon, X. Perpiñà, A. Pérez-Tomás and J. Rebollo, \"A Survey of Wide Bandgap Power Semiconductor Devices,\" in IEEE Transactions on Power Electronics, vol. 29, no. 5, pp. 2155-2163, May 2014, doi: 10.1109/TPEL.2013.2268900",""},
            {"[10] Dong-Geun Shin , Byung-Sook Kim, Hae-Rok Son and Moo-Seong Kim, “Study on the growth of 4H-SiC single crystal with high purity SiC fine powder” in Journal of the Korean Crystal Growth and Crystal Technology Vol. 29, No. 6 (2019) 383-388\n" +
                    "Volume 136, June 2023, 10989",""},
            {"[11] Jun Takahashi, Noboru Ohtani, Masakazu Katsuno, Seiji Shinoyama, “Sublimation growth of 6H- and 4H-SiC single crystals in the [1 i 0 O] and [1 1 2 O] directions” in Journal of Crystal Growth 181 (1997) 229-240",""}
    };


    /**
     * 논문10
     */

    String title10 = "건식식각공정 동향\n" +
            ":3차원 적층 기술 중심으로";

    String category10 = "SemiConductor";
    String[] author10 = new String[]{"이지원"};
    String[][] contents10 = new String[][]{
            {"1. 서론"},
            {"2. 본론 1", "2-1. 식각공정", "2-2. 건식식각공정(Dry Etching)이란?", "2-3. Bosch Process의 문제점"},
            {"3. 본론 2", "3-1. Cryogenic Dry Etching이란?", "3-2. Cryogenic Dry Etching 문제점 및 해결방안"},
            {"4. 결론"}
    };
    String[][] text10 = new String[][]{
            {"최근 4차산업에 돌입하면서 Chat GPT를 비롯한 빅데이터를 다루는 산업이 발달하게 되었으며, 이러한 빅데이터를 이용하여 명령에 대한 연산작업을 실행하는 AI 인공지능에 관련된 산업이 각광을 받고 있다. 또한 점차 보다 가볍고 작으며, 얇고 멀티 기능이 구현 가능한 부품에 대한 수요도 증가하고 있다. 이에 따라 고밀도, 고집적화 및 고성능의 반도체 기술에 대한 개발의 필요성이 대두된다.\n" +
                    "반도체는 크게 메모리 반도체와 비메모리 반도체, 즉 메모리 반도체와 시스템 반도체로 구분할 수 있다. 메모리 반도체는 데이터를 저장하는 역할을, 비메모리 반도체는 데이터의 처리 및 연산 등의 기능을 담당한다. 따라서 빅데이터를 처리하기 위해 메모리 반도체 업계에서 특히 고밀도, 고집적화 반도체가 요구된다.\n" +
                    "이에 반도체의 공정 단계 가운데, 식각 공정에 대한 중요성이 증가된다. 식각 공정이란, 반도체 소자의 회로 패턴을 제외한 나머지 부분을 제거하는 공정 과정이다. 따라서 식각 공정을 거쳐 미세 패턴을 형성하게 될 경우 제한된 크기의 웨이퍼에 더 많은 정보를 저장 가능하기에, 식각 공정이 중요 단계로 거듭나게 되었다.\n" +
                    "그러나 회로 패턴의 미세화는 한계에 도달하게 되었다. 우선 트랜지스터 간의 간섭으로 전류에 누설이 발생하게 되었으며, 고도의 미세화로 인해 기존에 영향을 받지 않던 크기의 미세 입자들이 반응에 참여하게 되면서 불량으로 작용한다. 따라서 최근에는 패턴 미세화의 평면적 한계를 극복하고자 3차원으로 적층하는 기술이 개발된다. 즉 동일 면적에 많은 단을 쌓는 것이 고집적화에 중요하면서, TSV(Through Silicon Via) 기술에 대한 연구가 진행된다.\n" +
                    "\t이에 TSV 기술에 사용된 식각 공정 기술에 대해 살펴보고, 한계를 극복하기 위해 제시된 Cryogenic dry etching에 대해 살펴보고자 한다.\"\n"},
            {"",
                    "식각 공정이란 포토공정이 끝난 후 필요한 회로 패턴 제외 나머지 부분을 제거하는 공정 과정이다. 감광액(PhotoResist, PR)이 없는 부분을 제거하는 방식으로는 건식공정과 습식공정 두 가지의 방법이 있다.\n" +
                            "회로 선폭(Critical Dimension, CD)이 미세화 되면서 5μm 이하에 이르게 된다. 습식 공정으로는 5μm 이하의 선폭을 구현할 수 없기에 습식에서 건식 공정 방식으로 변화하게 되었고, 이에 장비 및 공정의 복잡도가 증가한다. 특히 3D 낸드플래시 셀을 24단 이상으로 쌓기 시작한 2010년대 초반부에 식각 기술이 급격히 변화하였다.\n",
                    "건식 식각은 진공 챔버에 가스 주입 후, 전기 에너지를 공급하여 형성된 자기장으로 인해 가속화된 기체간 충돌을 일으킨다. 이로 인해 이온화가 일어나고, 연쇄반응을 통해 플라즈마(자유전자, 이온, 중성 원자 또는 분자로 구성된 이온화된 기체)상태에 도달한다. 플라즈마 상태로 해리된 반응성 원자와 웨이퍼 위를 덮고 있는 막질 원자가 만나 강한 휘발성을 띠고, 표면에서 떨어져 나간다. 이 과정에서 감광액으로 보호되지 않는 막질은 제거된다.\n" +
                            "건식 식각 공정에서 주의할 점은 1) 균일도(Uniformity)와 2) 식각 속도(Etch Rate), 3) 선택비(Selectivity)이다. 웨이퍼 부위에 따라 균일한 속도로 식각이 진행되어야 특정 부위의 칩에 불량이 발생하는 문제를 막을 수 있다. 또한 식각 속도란 (식각 두께)/(식각 시간)으로, 일정 시간동안 식각이 일어나는 정도이다. 식각 속도가 빠를수록 표면반응에 필요한 반응성 원자와 이온의 양이 줄어들며, 인자의 조절 능력이 증가한다. 따라서 전체적 수율이 향상된다. 선택비는 (물질 X의 식각 속도)/(물질 Y의 식각 속도)로, 물질 X는 Etch Target, 물질 Y는 식각을 원하지 않는 물질(mask layer or other material)이다. 즉 선택도가 클수록 선택적 식각이 잘 일어난다.\n" +
                            "건식 식각 공정은 반응물의 종류 및 플라즈마 가속 유무에 따라 Physical Dry Etching, Chemical Dry Etching, Reactive Ion Etching(RIE)로 분류할 수 있다. TSV는 주로 DRIE(Deep Reactive Ion Etching)을 이용하여 형성한다. DRIE는 Aspect Ratio가 큰 구조로 RIE 방식을 이용하여 식각하는 것으로, Bosch Process와 Cryogenic Process로 나뉜다.\n",
                    "Bosch 공정은 Etching 단계와 Passivation 단계가 번갈아 가며 발생한다. Etching 공정은 주로 SF6 가스를 이용한다. 불화물가스에 플라즈마가 충돌하여 가스분자를 이온으로 변환한 후에, 이온을 실리콘 웨이퍼와 충돌시켜 반응시킴으로써 SiF4(g)를 형성하며 실리콘 웨이퍼를 식각한다. \n" +
                            "\n" +
                            "이후 Passivation 단계에서는 C4F8가스를 이용하여 테프론(Teflon)과 유사한 C4F8막을 형성하여 via의 측면을 보호한다. \n" +
                            "\n" +
                            "따라서 각 사이클에 대응되는 가스를 교대로 사용해야 하기에 긴 dead time을 가지며, etch rate가 낮다. 또한 Passivation 단계에서 Scallop 형상을 띠는 via의 측면이 여러 단계에 걸쳐 톱니 형태를 띠게 되는 Scallop Effect가 발생하게 된다. 따라서 정교한 미세 패턴을 식각하기 어렵다는 문제가 발생한다. 이를 극복하고자 Cryogenic Dry Etching을 이용한다.\n" +
                            "\n"},
            {"",
                    "Cryogenic Dry Etching은 기존의 Bosch 공법과 달리 SF6와 O2가스를 동시에 주입하며 온도는 -110℃의 저온을 가해준다. 따라서 via의 측면에서 Passivation과정이 발생하며 동시에 Si가 노출된 Via의 바닥 부분에서 식각이 발생한다. Etching 온도로부터 실온까지 웨이퍼를 워밍업 하는 사이에 Passivation layer은 완전히 탈착하게 된다. 따라서 Scallop Effect가 발생하지 않아 깨끗한 표면이 형성된다. 추가적으로 극저온으로 인해 화학반응 속도가 낮아지게 되므로 원하는 방향으로의 식각을 더욱 깊게 할 수 있어 고집적도의 회로를 설계할 수 있다.\n",
                    "Cryogenic Dry Etching의 경우 저온 조건 만족을 위해서는 특수한 저온 장치 및 냉각 시스템이 필요된다. 따라서 비교적 고가이며 운영 및 유지 보수 단계에서도 추가 비용이 부과된다. 또한 선택적 식각이 다소 어렵기에 적층 시에 층과 층 사이 경계 부근에서 정밀한 패턴의 형성이 어려울 수 있다는 단점이 있다. 따라서 모든 응용 분야에 적용하기에 어려움이 존재하기도 한다.\n",
                    },
            {"빅데이터 기반 AI 산업이 각광을 받으며 고집적화 메모리 반도체에 대한 수요가 증가됨에 따라 반도체 공정 단계 가운데 회로 패턴을 새기는 식각 공정의 중요성이 급부상하였다. 최근 삼성전자는 최신 식각 기술을 적용할 수 있는 TEL의 장비를 도입하며, SK 하이닉스는 238단을 적층한 낸드플래시를 개발중인 등, 3차원 적층 기술에 대한 연구가 활발하게 진행중이다.\n" +
                    "한편 회로를 미세하게 식각하는 방식에 대하여 한계점에 도달하였기에, 최근에는 3차원으로 소자를 적층하는 기술이 각광을 받고 있으며, 특히 TSV (Through Sillicon Via)가 주목을 받고 있다. 이에 소자 간 전기적 연결을 위해서는 via를 식각 후에 연결해야 한다. 이때 via는 깊은 Aspect Ratio의 undercut 현상이 발생하지 않은 상태일 수록 좋기에, 건식 식각 공정을 주로 이용하며, 그 가운데 플라즈마를 이용하는 RIE 방식이 주로 일어난다. RIE에는 Bosch 방식을 주로 사용하는데, Etching 단계와 측면을 보호하는 Passivation 단계가 차례로 발생하므로 Scallop Effect가 발생하고 공정 비용이 비싸다는 단점이 있다. 따라서 Cryogenic Dry Etching이 사용되는데, 극저온에서 식각 가스만 넣어주더라도 Etching과 Passivation 단계가 동시에 발생할 수 있어 경제적이라는 장점이 있다.\n" +
                    "Cryogenic Dry Etching의 경우 저온 조건이 존재하나, Bosch 공정에서는 두 단계를 반복하는 복잡한 공정과정에서 가스를 조절해야 하므로 더욱 높은 비용이 발생한다. 또한 Bosch 공정은 더 높은 식각률을 제공할 수 있다. 그러나 via 측벽의 거칠기로 인한 정교함 문제 등을 고려하여, 사용자는 적절한 식각 공정을 선택해야 한다.\n"}

    };
    String[][] references10 = new String[][] {
            {"[1] 조도훈. (2021). “TSV (Through-Si-Via) 기술을 이용한 반도체의 3차원 적층 실장”, Journal of Welding and Joining, 39(3), pp. 295-303.", ""},
            {"[2] F. Laerme, A. Schilp, K. Funk and M. Offenberg, \"Bosch deep silicon etching: improving uniformity and etch rate for advanced MEMS applications,\" Technical Digest. IEEE International MEMS 99 Conference. Twelfth IEEE International Conference on Micro Electro Mechanical Systems (Cat. No.99CH36291), Orlando, FL, USA, 1999, pp. 211-216", ""},
            {"[3] Ü Sökmen, “Capabilities of ICP-RIE cryogenic dry etching of silicon: Review of exemplary microstructures”, Journal of Micromechanics and Microengineering, 19(10)",""},
            {"[4] R Dussart, “Plasma cryogenic etching of silicon: from the early days to today's advanced technologies”, Journal of Physics D: Applied Physics, 47(12)",""},
    };


    /**
     * 논문11
     */
    String title11 = "SIB(나트륨 이온 배터리) 양극재와 음극재 연구 동향 및 LIB와의 비교 분석";
    String category11 = "Battery";
    String[] author11 = new String[]{"천지은"};
    String[][] contents11 = new String[][]{
            {"1. 서론"},
            {"2. 연구 동향", "2-1. 양극재", "2-2. 음극재"},
            {"3. 결론 및 제안", "3-1. 양극재", "3-2. 음극재"}
    };
    String[][] text11 = new String[][]{
            {"대규모 에너지 저장 방식의 수요 증가에 비해 리튬 이온 배터리(LIB)의 비싼 원자재 값으로 인해 LIB의 대체로 제작 비용이 상대적으로 저렴한 나트륨 이온 배터리(SIB)가 주목받고 있다. LIB의 전기화학적 성능 또한 SIB가 대체할 수 있을지를 SIB의 양극재, 음극재의 전기화학적 성능을 기반으로 알아보고자 한다. 이에 대한 연구들을 통해 각 소재들의 용량, 에너지 밀도 등 성능을 알아보고 LIB의 양극재, 음극재로 쓰이는 물질들과 성능을 비교해보고자 한다. 그 중에서도 SIB의 양극재와 음극재로 주목받고 있는 프러시안 블루와 하드 카본에 대한 연구를 더 살펴보며 이들 물질의 구조 특성, 전기화학적 성능에 관한 장점 및 한계에 대해 자세히 알아보고자 한다. "},
            {"",
                    "1. 2차원 층 전이 금속 산화물\r\n" +
                            "1) Na1-xFeO2와 유도체\r\n" +
                            "Fe 자리를 Co로 부분적으로 대체한 Na[Fe0.5Co0.5]O2은 용량 유지 및 속도 성능 면에서 주목할 만 하다. Fe 대신에 전이금속 자리를 Co가 차지함으로써 Fe이온의 이동을 억제하여 비가역적 용량을 극적으로 억제할 수 있으며(용량 유지), Co의 존재로 인해 전기 전도성이 증가해 전극이 102mAh g-1에서 최대 30C-rate까지 활성화되었다.(속도 성능)\r\n" +
                            "Wang의 연구에서는 NaFeO2의 결정 구조를 안정화시켰는데, 이는 NaNiO2, Na[Fe1-xNix]O2 (0≤x≤1)과 함께 고용체를 형성함으로써 이루어진 것이다. Fe의 농도가 희석된 형태인 Na[Fe0.3Ni0.7]O2은 Fe3+/4+와 Ni3+/4+의 산화-환원 반응을 통해 용량과 유지량을 증가시킨다. 이 물질은 30싸이클 후에 135mAh g-1, 74% 유지를 보였다. 그들은 valence state를 결정하고 O3-Na[Fe1-yNiy]O2 (y = 0, 0.5, 0,7)에서의 Fe의 전기화학적 반응의 메카니즘을 탐색하기 위해 Fe Mossbauer 스펙트럼을 기록했다. \r\n" +
                            "2) NaXMnO2와 유도체\r\n" +
                            "  NaXMnO2는 Na와 Mn의 비용 효율성 때문에 특히 흥미로운 물질이다. NaXMnO2 (x=0.44~1)은 Parant 등의 첫 번째 연구 후 양극 물질로 광범위하게 연구되고 있다. 이 물질은 낮은 x값(x=0~0.44)에서는 3차원 구조이며, 높은 x값(x>0.5)에서는 2차원 구조이다. \r\n" +
                            "NaxMnO2에 Ni 원소가 첨가된 형태의 물질인 P2-Na2/3[Ni2+1/3Mn4+2/3]O2는 Lu와 Dahn 등에 의해 2001년에 처음 보고되었다. 이 화합물은 습한 공기 중에서 안정하고 물 분자의 삽입을 통한 수화는 일어나지 않는다. 비록 P2-Na2/3[Ni2+1/3Mn4+2/3]O2은 이론 용량이 173mAh g-1로 상대적으로 낮지만, Ni2+/4+의 산화-환원 반응으로 평균 작동 전압 3.5V를 나타내며, 2~4.5V의 전압 범위에서 약 160mAh g-1을 제공한다(그림 e). Ni2+와 Mn3+의 이온 크기가 비슷하기 때문에, Ni2+은 Na2/3MnO2에서 Mn4+대신에 Mn3+자리를 차지하는 것을 선호한다. 그들의 현장 XRD 연구는 산소 이동으로 인한 가역적 P2-O2 상전이를 보여줬으며, 이는 O2상은 충전 시 4V, 방전 시 3.8V 이상의 전압 안정기에서 우세하다. \r\n" +
                            "2. 3차원 다가음이온 화합물\r\n" +
                            "1) 인산염 및 불소인산염 \r\n" +
                            "  LiFePO4와 비교해서, NaFePO4의 전하 이동 저항은 높고, Na+이온의 확산 계수는 약 2배 정도 작다. 최근 밀도 함수 이론 계산은 NaFePO4에서의 Na+ 이온들의 이동 에너지는 LiFePO4의 Li+이온들의 이동 에너지보다 0.05eV가 높았다. 이는 NaFePO4에서의 느린 동역학을 반영한다. Li+과 비교하여 Na+의 큰 이온 크기는 결정 구조로의 Na+의 느린 확산과 관련되어 있다. NaFePO4의 확장형인 Na[Fe0.5Mn0.5]PO4은 합성될 수 있지만, 전극은 전압 안정기를 나타내지 않고 오히려 경사진 곡선을 나타낸다. 이는 Na+ 이온이 크기가 크기 때문에 Na이 풍부한 상과 Na이 부족한 상 사이의 높은 계면 변형으로 인한 것이고, Na[Fe0.5Mn0.5]PO4에 0.6mol의 Na+가 들어가도록 하는 것으로 이어진다. 큰 Na+이온들은 이동과 관련이 있기 때문에, 계면 에너지를 최소화하는 것은 Co, Mn, Ni 등과 같은 다른 전이 금속들의 활용에 필수적이다. \r\n" +
                            "2) 시안화물 – <프러시안 블루> \r\n" +
                            " 프러시안 블루 유사체의 단위분자식은 AXMP[MR(CN)6]·wH2O (A: 알칼리 금속 양이온, MP, MR : 전이금속 양이온, H2O : 결정수)이며, 상온에서 수용액 상 공침 반응을 통해 단일 반응으로 합성되어 친환경적이고 경제적이다. 격자구조는 MP, MR이 각각 6개의 CN-와 팔면체로 배위결합을 하여 이루어지며, 면심 입방 구조(FCC)의 3차원 구조이다. 그러므로 PBA는 open-framework를 포함하고 결정내의 interstitial site, 이온 확산 통로가 다른 물질들보다 넓다. 이로 인해 이온이 빠르게 확산하는 것을 가능하게 하고, Na+처럼 이온 반경이 큰 이온 또한 가역적인 삽입/탈리를 원활하게 한다. 하지만 공침 반응으로 인해 공공격자결함(Vacancy)와 결정수(Crystal water)가 생기기 쉬워 PBA의 전기화학적 성능을 저하한다. 따라서 이 두 요인을 완화하고 전기화학적 성능을 향상시키기 위한 연구들이 진행되고 있다. 우선 공공격자결함을 제어하기 위해 시트르산 나트륨과 같은 화학적 억제제를 이용해 반응속도를 제어한다. 공침 반응이 빠른 속도로 일어나면 공공격자결함이 형성되는 것이므로 화학적 억제제를 이용해 반응속도를 느리게 하여 공공격자결함 형성을 막는 방법이다. 또한, 전기화학반응 중 상변화를 일으키지 않는 비활성 전이금속을 도핑하여 구조적 안정성을 높이는 방법이 있다. 도핑함으로써 활성전이금속의 산화/환원 반응으로 인한 PBA가 겪는 구조 변화를 완화한다. 또한 진공 열처리 등 추가적인 공정을 통해 PBA 합성 후에도 결정수를 제거할 수 있다. 하지만 다양한 연구 중 결정수가 전기화학적 성능을 향상시키는 결과를 가져올 수 있다는 연구도 있기 때문에 공공격자결함과 결정수가 전지의 성능에 어떤 영향을 미치는지에 대한 추가적인 연구가 필요하다.",
                    "1. 탄소계 음극재\r\n" +
                            "1) 흑연성 탄소 <흑연>\r\n" +
                            "삽입될 때 쌍을 이루는 Na-삽입 GIC들의 열역학적 불안정성으로 인해 흑연은 적절하지 않은 상태이다. 이는 흑연의 구조와 Na+ 이온의 크기 사이의 부조화로 인한 결과이다. 즉, SIB에서의 Na-흑연 삽입 화합물(Na-GIC)의 형성의 첫 단계에서 열역학적으로 불안정한 NaC6와 NaC8이 원하지 않게 형성되기 때문에, 천연 흑연의 용량은 제한된다. \r\n" +
                            "2) 비흑연성 탄소 <하드카본>\r\n" +
                            "  Na+ 이온이 Li+ 이온보다 이온 크기가 크기 때문에 흑연을 SIB의 음극재로 사용하면 Na+ 이온의 삽입/탈리 반응이 원활히 진행되지 않는다. 따라서 넓은 층간 간격(>0.37nm)을 가지고 있는 하드 카본을 SIB의 음극재로 활용하고 있다. \r\n" +
                            "일반적으로 다량의 기공이 존재하는 하드 카본에 Na+ 이온이 저장되는 메카니즘은 이온 삽입과 기공 충전 두 가지로 볼 수 있다. 먼저 이온 삽입의 경우 사이클 안정성과 율속 능력을 높이지만 방전 용량이 낮다. 기공 충전은 방전용량이 높지만 나트륨이 환원되면서 나트륨 나노입자와 전해질 용액이 화학반응을 일으키기 때문에 초기 방전용량 손실이 크고 사이클 안정성이 좋지 않다. 일반적인 하드 카본은 이온 삽입과 기공 충전 메카니즘이 혼재되어 있고, 이온 삽입에는 결정성 물질이, 기공 충전에는 비결정성 물질이 기여하고 있다. 싸이클 안정성을 테스트한 결과, 약 200~300mAh/g의 방전용량을 갖고 약 100~200mA/g의 전류밀도에서 약 300싸이클 동안에 안정성을 보여주었다. \r\n" +
                            "  Bommier 등은 충-방전 곡선의 함수에서 경사진 영역에서의 새로운 저장 메카니즘을 논의했는데, 이는 결함 자리에 Na+ 이온을 저장함으로써 설명될 수 있다. 그들은 또한 Na+ 이온들은 비교적 낮은 전압 안정기에서 하드카본 속으로 삽입될 수 있음을 확인하였다. 이러한 발견들은 Na+의 저장은 card-house 모델에서 제안된 2단계 저장 메카니즘이 아닌 3단계 과정과 관련이 있음을 의미한다; (i) Na+이온들은 경사진 전압 영역에서의 결함 자리에 흡수되고, (ii) Na+ 이온들은 하드카본 격자에 삽입되고, (iii) Na+ 이온들은 전압 안정기에서 기공 표면에 흡수된다. \r\n" +
                            "2. 14족 합금 화합물\r\n" +
                            "1) 실리콘 (Si) \r\n" +
                            " 단원자 확산 모델에 기반하여, Morito 등은 벌크 Si은 Na 배터리의 음극재로는 유망하지 않다고 하였다. 왜냐하면, Si는 Si 원자 한 개당 오직 하나의 Na 원자를 흡수하며, Na 확산 동역학 면에서 부족하기 때문이다.\r\n" +
                            "2) 주석(Sn) \r\n" +
                            "인해 유망한 음극재로 고려되어 왔다. 이론적 계산을 바탕으로, Chevrier와 Ceder 등은 Sn 화합물로의 Na 삽입에 대한 전압 프로파일을 제안하였다. Na-Sn의 상태도는 Sn의 나트륨화는 다음과 같은 일련의 과정을 거침을 나타냈다 : Sn → NaSn5 → NaSn → Na9Sn4 → Na15Sn4. Komaaba 등은 Sn이 가역적으로 Sn-Na 금속간 상을 형성하기 위한 가역적인 전기화학적 산화-환원 반응을 겪는다는 것을 실험적으로 입증하였다. ",
            },
            {"",
                    "본문에서 설명한 SIB의 여러 가지 양극재 중 유망한 양극재 물질들을 제안하면 다음과 같다. 우선 [1] Na1-xFeO2에서 Na[Fe0.5Co0.5]O2는 용량 유지 및 속도 성능 면에서 우수하다. Fe 대신에 전이금속 자리를 Co가 차지함으로써 비가역적 용량을 극적으로 억제하고, Co로 인해 전기 전도성이 증가해 속도 성능 또한 우수하다. 실험된 용량은 160mAh g-1로 Na1-xFeO2 중 우수하다. 하지만 Co가 비싼 원재료이기에 비용이 많이 들 것으로 예상된다. 또한, Na[Li0.05(Ni0.25Fe0.5Mn0.25)0.95]O2은 가역성이 우수하고 180mAh g-1의 대용량을 가지며 Li-O 결합이 결정 구조를 안정화시키고 용량 유지율이 높다. [2] NaxMnO2 중에서는 P2-Na2/3[Ni1/3Mn2/3]O2가 습한 환경에서 안정하고 물 분자의 삽입을 통한 수화가 일어나지 않아 SIB의 우려점을 보완 가능한 양극재라 생각된다. 그러나 이론 용량이 높지 않고 상전이 시 부피 변화가 커 이를 해결하기 위한 연구가 진행 중이다. [3] 인산염 및 불소인산염 부분의 SIB에서의 NFP는 LIB에서의 LFP만큼의 전기화학적 성능을 나타내고 있지 못하므로 SIB의 음극재로의 적용은 어려울 것으로 보인다. 왜냐하면 LFP와 비교해서 NaFePO4의 전하 이동 저항은 높고 Na+ 이온의 확산 계수는 약 2배 정도 작아 느린 동역학을 보이기 때문이다. [4] 시안화물에서의 프러시안 블루 물질은 앞에서 언급한 물질들에 비해 에너지 밀도는 낮은 편이지만 방전 용량과 용량 유지율이 적당하며 확산 통로가 넓어 SIB에 유리하다는 점에서 주목받을 만한 물질이다.",
                    "SIB의 음극재로 연구된 여러 가지 물질들 중 흑연의 경우 Na-GIC의 에너지 불안정성으로 인해 SIB로 적절하지 않다. 이는 흑연의 구조와 Na+ 이온 크기 사이의 부조화로 인한 것이다. 이에 비해 하드 카본은 낮은 작동 전위에서 높은 비용량을 제공하고 흑연과 비교해 넓은 층간 간격을 가져 SIB 음극재로 유용하다. 또한 하드 카본에서의 공극 결함은 Na+ 이온들과 결함들 사이의 강한 이온 결합 에너지로 인해 Na+ 이온 삽입을 크게 향상시킨다. 나아가, 적절하게 낮은 기공 부피와 표면적은 더 높은 가역 용량을 달성할 수 있다. 하지만 여러 연구들 중 공극 결함이 장애물로 작용하는 연구 결과도 있으므로 심도 깊은 연구가 필요하다. 따라서 연구자들은 입자 크기, 첨가제, 전해질, 공극 결함, 다공성 측정을 포함한 여러 요인을 고려하여 연구해야 할 것이다. LIB의 음극재로 유용하게 사용되고 있는 실리콘(Si)의 경우 Si 원자 당 오직 1개의 Na을 흡수할 수 있고, Na 확산 동역학 면에서 부족하기에 SIB의 음극재로는 유망하지 않다. Ge(게르마늄) 또한 비슷한 이유로 적용하기 어렵다. 반면 Sn(주석)의 경우 높은 이론적 비용량을 가지므로 SIB의 음극재의 가장 유망한 후보이다. 부피 팽창-수축의 극도로 큰 차이는 장애물이지만, 탄소 매트릭스와 잘 정제된 Sn 나노 입자로 구성된 음극은 높은 비용량과 높은 용량 유지율을 제공한다. 따라서 이와 같은 양극재와 음극재의 연구 결과를 바탕으로 더 다양한 연구들을 진행함으로써 SIB의 용량, 용량 유지율 및 구조적 안정성을 높인다면, LIB보다 더 낮은 비용으로 비슷한 전기화학적 성능을 구현할 수 있을 것으로 보인다."
            }
    };
    String[][] references11 = new String[][] {
            {"강희주·김미진·전영시, 「소듐-이온 이차전지용 고성능 하드카본 음극재」, 『고분자 과학과 기술』제 30권 5호, 2019, 415-420쪽. ", ""},
            {"김양문·최승연·최장욱, 「프러시안블루 유사체를 활용한 이차전지 연구」, 『전기화학회지』제 22권 1호, 2019, 13-21쪽. ", ""},
            {"박정기, 『리튬이차전지의 원리 및 응용』, 도서출판 홍릉, 2010. ", ""},
            {"오승모, 『전기화학 제4판』, 자유아카데미, 2023. ", ""},
            {"Jang-Yeon Hwang·Seung-Taek Myung·Yang-Kook Sun, 「Sodium-ion batteries: present and future」, 『The Royal Society of Chemistry』, 2017, pp. 3529-3614. ",""}
    };


    /**
     * 논문12
     */
    String title12 = "폐배터리의 재사용과 재활용";
    String category12 = "Battery";
    String[] author12 = new String[]{"문채란"};
    String[][] contents12 = new String[][]{
            {"1. 서론 "},
            {"2. 폐배터리의 재사용 ",
                    "2-2. ESS 및 재사용 방안 ",
            },
            {"3. 폐배터리의 재활용 ",
                    "3-1. Pyrometallurgy(건식",
                    "3-2. Hydrometallurgy(습식) ",
                    "3-3. Direcy Recycle",
            },
            {"4. 결론 "}
    };
    String[][] text12 = new String[][]{
            {"지구온난화로 인한 환경 문제를 완화시키기 위해 사람들은 화석연료 사용을 줄이고 온실가스 배출을 줄일 수 있는 지속가능한 방안을 찾고 있다. 이 중 전기차 산업 분야에서도 폐배터리를 어떻게 활용할 것인가에 대해서 다양한 방법이 논의되고 있다. 그 중 폐배터리를 재사용하는 것과 재활용하는 방법에 대해서 그 특징과 장단점, 앞으로 나아가야 할 방향에 대해 설명하고자 한다.\r\n" +
                    "\r\n" +
                    "LIB셀을 구성하는 5가지 구성 요소인 양극, 음극, 전해질, 분리막, 집전체는 모두 재활용이 가능하고 재사용 가능성이 있다. 리튬이온배터리의 기본 구조는 거의 동일하며 음극에 사용되는 리튬화 금속 산화물의 유형에 따라 차별화된다. 대표적인 종류로는 NCM 배터리, NCA 배터리, LFP 배터리 등이 있고, 각 배터리를 구성하는 원소의 비율에 따라 세분화할 수 있다. 이러한 리튬이온배터리를 구성하는 원소인 리튬, 망간, 코발트, 니켈 등의 금속 원소를 폐배터리에서 회수하여 사용할 수 있다면, 경제성은 높이고 환경 영향은 줄일 수 있게 된다."},
            {"",
                    "재사용(Re-use)은 전기차에 사용한 후 수명이 남아있는 폐배터리를 모아서 일련의 과정을 거친 후에 다양한 용도로 다시 사용하는 것이다. 다 쓴 전기차 배터리를 그냥 버리면 배터리에 포함된 각종 중금속과 전해액이 토양오염을 유발한다. 또한 리튬과 코발트는 채굴과정에서 다량의 이산화탄소 발생하기 때문에 가능한 재사용이나 재활용을 하는 것이 좋다.\r\n" +
                            "\r\n" +
                            "재사용 과정은 일반적으로 다음과 같은 절차를 따라 이루어진다. \r\n" +
                            "\r\n" +
                            "배터리 입고 > 팩 세척/외관검사 > 팩 분석 > 팩에서 모듈 분해 > 모듈 분석 > 등급 분류 > 포장 및 출고 > 재사용\r\n" +
                            "\r\n" +
                            "폐배터리의 재사용은 팩이나 모듈 단위, 배터리 셀 단위까지 분해하여 각각의 단위에서 재목적화를 달성할 수 있지만, 셀 단위에서의 활용은 경제성이 낮아 주로 배터리팩이나 모듈 단위에서의 재목적화를 통한 이차 사용이 진행중이다.\r\n" +
                            "\r\n" +
                            "또한 지난 10월 환경부에서 전기차 폐배터리를 순환자원으로 지정하기로 선언하였다. 순환 자원이 되면 단순 폐기물이 아니기 때문에 폐기물관리법상 규제를 받지 않는다. 순환 자원이 되려면 ‘사람의 건강과 환경에 유해하지 않을 것’과 ‘경제성이 있어 유상거래가 가능하고 방치될 우려가 없을 것’이라는 기준을 충족해야 한다. 전기차 폐배터리의 경우 ‘침수, 화재, 변형, 파손 등이 없었고 셀이 훼손돼 유해 물질이 유출되거나 화재, 폭발 위험이 없는 배터리’를 분해하지 않고 ‘재사용’하거나 에너지저장장치(ESS)등으로 ‘재제조’할 때만 순환 자원으로 인정된다. 이렇게 순환 자원으로 인정되면, 폐기물 보관이나 보관 기관에 대한 제약이 완화되어 재활용이나 재사용이 더욱 용이해진다.",
                    "전기차 배터리의 사용주기는 보통 7~10년인데, 이 시간이 지나면 주행거리가 감소하고 충전속도가 저하되어 교체가 필요하다. 전기차 배터리는 다 쓴 후에도 초기 성능의 80% 정도 사용이 가능하다. 따라서 이렇게 전기차에는 사용할 수 없지만 여전히 사용 가능한 폐배터리 모듈을 여러 개 묶어 ESS를 만든 다음 재생에너지와 연계하여 잉여 전력을 저장하는 방법으로 재사용이 가능하다. 이때 저장된 전력은 전력 수요가 급증할 때 전기 공급을 안정화하는 일에 사용된다. \r\n" +
                            "\r\n" +
                            "폐배터리는 ESS로 25년까지 사용 가능하고, 뿐만 아니라 폐배터리를 이용한 전기차 충전 인프라 구축도 가능하다. 또한 재사용은 전기차 판매 가격과 제조 가격을 낮추는데도 도움이 된다. 배터리가 전기차 가격의 40%, 원가 비중의 25%를 차지하는 핵심 부품인데, 폐배터리를 활용한 ESS는 신제품 대비 40~70%의 가격을 갖는다. 또한 이렇게 형성된 저렴한 초기 비용은 곧 전기차 대중화로 이어질 수 있다."},
            {"",
                    "Pyrometallurgy는 폐배터리를 수거해 방전시킨 뒤, 고온의 고로에서 용융시켜 원소재들을 추출하는 방법이다. 배터리를 분쇄하거나 규격별로 나눌 필요없이 통째로 고로에 넣고 녹여서 코발트, 니켈을 뽑아내기 때문에 Hydrometallurgy 방식 대비 공정이 간단하다. \r\n" +
                            "\r\n" +
                            "하지만 고로 운용이 불가피한 만큼 초기투자비용이 높고, 고로 가열 과정에서 다량의 이산화탄소 배출된다는 문제점이 있다. 또한 결정적으로 코발트, 니켈을 제외한 금속 추출이 불가능하기 때문에 가장 비싼 리튬은 용융 과정에서 대부분 휘발되거나, 폐기물인 슬러그 속에 산포된다. 망간 또한 회수가 되지 않는다. 이로 인해 수익성 훼손되는 문제가 있다. \r\n" +
                            "\r\n" +
                            "이 방식은 현재 미국과 유럽에서 많이 사용하는 방식이다.",
                    "Hydrometallurgy는 폐배터리를 수거해 방전시킨 뒤 전처리 과정 중 분쇄를 거쳐 강산 용액으로 녹이는 방식이다. 이는 코발트, 니켈, 리튬, 망간이 모두 회수 가능하여 수익성을 확보할 수 있는 방식이다. 또한 기존 공정 대비 온실가스 배출량이 최대 30% 낮아 환경 영향이 작고, 고로가 불필요해 초기 투자 비용이 싸고 대규모 생산도 쉽다는 장점이 있다. \r\n" +
                            "\r\n" +
                            "하지만 Pyrometallurgy와 달리 전처리 과정에서 배터리를 분쇄해 ‘블랙매스(Black Mass)’로 만들어야 한다는 점에서 공정이 복잡하고, 강한 산성 용액을 쓰기 때문에 폐수 정화 시설이 필요하다는 문제점이 있다. \r\n" +
                            "\r\n" +
                            "이 방식은 현재 우리나라와 중국에서 많이 사용하는 방식이다.",
                    "Direct Recycle은 배터리 양극에 코팅된 활물질을 고열이나 산성 용액으로 녹이지 않고, 물리적인 힘으로 그대로 뜯어내는 방식이다. 활물질은 바인더라는 접착제와 반죽돼 알루미늄박 위에 코팅돼 있는데, 이를 활물질 그대로 분리한다. 앞선 두가지 방식이 원소별로 금속을 회수하는 것과 달리 이 방식은 MCN(망간,코발트,니켈), NCA(니켈,코발트,알루미늄) 등 양극재 상태로 회수되는게 특징이다. 기존 방식에 비해 저온에서 에너지를 적게 들여 금속을 회수하기 때문에 가장 친환경적인 방법이기도 하다. \r\n" +
                            "\r\n" +
                            "하지만 Direct Recycle은 양극재를 있는 그대로 뜯어내기 때문에 금속의 조성 비율을 그대로 유지된다는 특징이 있다. 예를 들어, NCM622에서 회수한 금속과 NCM811 에서 회수한 금속의 조성은 완전히 다르다. 최근의 배터리 산업은 NCM9□(1/2) □(1/2)처럼 하이니켈 방향으로 발전하고 있다. 최소 7-8년 전에 생산돼 폐기된 배터리는 상대적으로 니켈 함량이 적을 수 밖에 없는데, 이를 전구체 그대로 가져다가 최신 배터리용 셀을 만들 수 없다. 또한 폐기되는 배터리의 크기와 구조가 제각각이기 때문에 Direct Recycle 방식은 아직 양산 도입되기 힘들다는 문제가 있다. "},
            {"폐배터리를 어떻게 이용할 것인가에 대해서 연구 진행중이고 앞으로 해결해 나가야할 중요한 과업이다. 우선은 재사용을 통해 일차적으로 남은 배터리 잔량을 최대한 사용하고 이후 원소를 추출하는 재활용 방법을 채택해야 할 것이다. 또한 효율적이고 경제적이며 지속가능한 폐배터리 재사용, 재활용 방법을 찾고 이를 표준화해야 할 것이다."}};
    String[][] references12 = new String[][] {
            {"Baum, Zachary J., et al. \"Lithium-ion battery recycling─ overview of techniques and trends.\" (2022): 712-719.", ""},
            {"Makuza, Brian, et al. \"Pyrometallurgical options for recycling spent lithium-ion batteries: A comprehensive review.\" Journal of Power Sources 491 (2021): 229622.", ""},
            {"KIPOST, “폐배터리’다이렉트 리사이클’,오염 적지만 아직은 실험실 수준”", "https://www.kipost.net/news/articleView.html?idxno=311408, 2023.11.18"},
            {"이재영, 「전기차 폐배터리, 폐기물 벗어나 ‘순환자원’지정 」", "<<연합뉴스>>, 2023.10.30, https://www.yna.co.kr/view/AKR20231030054200530?input=1195m"},
            {"정진수, 「배터리, 전기차 다음으로 ‘ESS’ 뜬다」, <<데일리안>>", "2023.08.20, https://www.dailian.co.kr/news/view/1264607 "},
            {"LG이노텍, “지구를 지키는 LG이노텍 친환경 에너지 기술”, 네이버 포스트","2022.09.05, https://post.naver.com/viewer/postView.naver?volumeNo=34426599&memberNo=30454087&vType=VERTICAL, 2023.11.18"}
    };

    /**
     * 논문13
     */
    String title13 ="폐 리튬 이차전지의 재활용 기술";
    String author13[] ={"정수연"};
    String category13 = "Battery";
    String contents13[][] ={
            {"1. 서론"},
            {"2. 폐 리튬 이차전지의 재활용",
                    "2-1. 전처리 과정",
                    "2-2. 후처리 과정",
                    "2-3. 기타 기술"},
            {"3. 폐 리튬 이차전지 재활용의 향후 과제",
                    "3-1. 재활용 공정의 경제성 평가",
                    "3-2. 신기술 개발"},
            {"4. 결론"},
            {"5. 참고문헌"} }
            ;
    String text13[][] = {
            {"리튬 이차전지의 수요는 1990년대 이후로 휴대용 전자 기기 시장과 함께 지속적으로 증가되어 왔으며, 최근 전기차 시장의 급격한 확장에 따라 리튬 이차전지 또한 전 세계적으로 수요가 급증했다. 2025년 말에는 250억개의 리튬 배터리가 사용될 것을 예상되는 만큼 가까운 미래에 천연자원으로부터의 리튬 공급량을 앞설 것이며, 이는 리튬 자원 수급의 불안정을 초래할 수 있다. 지속적으로 축적되는 수명이 다한 폐 전지 또한 환경적으로 큰 문제를 야기할 수 있다.\n" +
                    "희소 원소로 간주되는 리튬은 가장 가벼운 금속으로써 높은 비용량(3.86Ahg-1)과 극도로 낮은 전극 전위(표준 수소 전극 대비 -3.04V)를 가지고 있어 고전압/고에너지 배터리에 이상적인 양극 소재이다. 리튬 이차전지의 양극재는 일반적으로 LCO(LiCoO2), LFP(LiFePO4), NCM(Li(Ni,Co,Mn)O), NCA(Li(Ni,Co,Al)O2) 등을 사용한다. LCO는 에너지 용량과 수명 특성이 우수해 배터리 상업화 초기부터 광범위하게 사용되어 왔으나, 2010년 이후 가격이 비산 코발트의 일부를 비교적 저렴한 니켈, 망간 및 알루미늄으로 대체한 NCM과 NCA 삼성분계의 소재 보급으로 원가 절감과 고용량화가 실현되었다. NCM과 NCA는 삼원계 양극소재로, NCM은 IT용뿐만 아니라 전기자동차용 리튬 이차전지에도 적용되고 있으며 적용 분야 확대 및 안정성이 개선되어 업계의 주력 양극 소재로 급부상하고 있다. LMO와 LFP는 경제성과 안정성이 우수해 전기자동차용 배터리에도 일부 적용되었으나, 에너지 용량이 낮아 NCM과 일정한 비율로 혼합되어 사용되며 주행거리가 비교적 짧은 전기자동차에 제한적으로 사용되고 있다. 이러한 리튬 이차전지의 리튬 농도는 약 5-7wt%로 천연자원보다 훨씬 높기 때문에 수명이 다한 리튬 이차전지에서 리튬을 회수하기 위한 공정을 개발하는 것이 중요하다."},
            {"","리튬 이차전지의 재활용 공정은 물리적인 파쇄 공정인 전처리 과정과 이를 통해 얻은 부산물을 화학적으로 처리하는 후처리 과정으로 나뉜다. 전처리 공정은 수거된 폐배터리를 파쇄해 분말 형태로 만드는 과정으로, 방전, 해체, 파쇄, 건조, 1차 분리, 2차 파쇄, 2차 분리, 소성, 분해의 9단계로 구성된다. 전처리 과정에서는 우선 폐배터리의 잔류 에너지를 방출하기 위해 물리적 전처리 단계 전에 저렴한 2wt%의 NaCl 용액을 이용한 방전 단계를 거치고, 해체 단계에서는 배터리 팩에서 셀을 분리하는 작업을 수행한다. 셀은 플라스틱 분리막, 전극, 전해질이 포함되어 있으며 셀을 파쇄하는 단계에서 일어나는 발열반응을 억제하기 위해 N2 분위기에서 작업을 진행한다. 건조 단계에서는 분쇄 후 남아있는 전해질을 100℃ 이상에서 고온 건조한다. 1차 분리 단계에서는 건조 후 파쇄 분말에 포함된 불순물을 제거하기 위해 Air seperator를 이용한다. 다음으로 2차 파쇄 단계 및 2차 분리 단계를 거쳐 활물질을 얻고, 열분해를 통해 PVDF 바인더와 블랙카본을 연소시킨다. 마지막으로 소성을 끝낸 분말의 크기를 줄이는 분해 단계를 거쳐 최종적으로 침출에 사용하는 Black powder를 얻는다.",
                    "후처리 과정은 전처리 과정을 통해 얻은 Black Powder를 화학적으로 처리하는 과정으로, 용해나 침출, 침전법 등을 통해 금속을 추출해낸다. 후처리 과정은 건식 제련, 습식 제련, 건식습식제련, 직접 재활용 등으로 나뉜다. 건식 제련은 고온 로스팅 기술을 사용하여 폐 리튬 이차전지에서 합금 형태로 니켈, 코발트 및 기타 원소와 같은 금속을 회수하고 리튬은 슬래그로 들어가는 것을 의미한다. 현재 유럽에서는 건식 제련 방법이 비교적 잘 활용되고 있다. 이 방법은 간단하지만 에너지 소비가 높고 금속 회수율과 순도가 좋지 않다. 따라서 슬래그에서 리튬을 추출하는 적절한 방법을 사용하면 건식 제련법이 더 큰 경제적인 이익을 얻을 수 있을 것이다.\n" +
                            "습식 제련은 일반적으로 산 또는 알칼리 조건을 사용해 이온 형태의 음극 물질의 금속 산화물을 용액으로 침출시킨 후 분리 및 정제하는 방법이다. 현재는 산 침출을 위주로 연구가 진행되고 있으며 이 방법은 낮은 에너지 소비, 자원의 고순도 회수, 낮은 회수 비용 등의 장점을 가지고 있으며 중국에서 가장 널리 사용되고 있다. 건식 제련법과 비교해 습식 제련법은 특히 금속 분리 및 정제에서 유가금속을 회수하는 데 걸리는 시간이 더 길다. 또한 습식 제련은 많은 추출제와 침전제가 필요하며 금속의 수가 많아질수록 더욱 복잡해지기도 한다는 단점도 있다. 건식 제련과 습식 제련 이외에도 건식 습식 제련이 점차 연구 관심을 끌고 있기도 하다. 예를 들어, LCO 및 NCM 양극재를 폐흑연과 혼합해 특정 용해도를 갖는 Li2CO3 및 MXOY로 분해하고, 리튬 및 기타 금속을 물 침출을 통해 선택적으로 분리하는 연구도 진행된 바 있다. 그러나 Li2CO3의 용해도는 낮으며 일반적으로 Li2CO3를 용해도가 더 높은 LiHCO3로 전환하려면 침출수를 통해 이산화탄소를 통과시켜야 한다. 여기에서 다른 금속은 기존의 습식 제련법으로 회수된다. 이 방법은 건식 제련, 리튬의 우선적인 재활용 및 기타 고가 금속의 환원에 필요한 온도를 감소시킨다. 하지만 반응 공정 중 일산화탄소 발생, Li2CO3의 낮은 용해도, 소성 공정 중 최종 생성물 제어의 어려움 등으로 인해 아직 미성숙한 공정이다.\n" +
                            "직접 재활용은 원래의 결정 구조나 전기 활성 물질을 파괴하지 않는 방법이다. 직접 재활용의 주요한 공정은 리튬 보충과 결정질 복원으로, 강산이나 강염기 같은 화학물질에 대한 의존도가 적다. 직접 재활용에서는 리튬 이온의 확산도가 감소하고 기계적 응력이 증가해 분극이 높아져 배터리에 비가역적인 구조적 전환이 이루어졌을 때, 사용한 음극 물질 내의 손상을 치유하고 전기화학적 성능을 복원하는 것을 목표로 한다. 이 때문에 직접 재활용은 지속 가능한 재활용 루프를 만들 수 있을 것으로 기대되며 건식 제련이나 습식 제련보다 경제적, 환경적 이점이 있다.\n" +
                            "일반적으로 사용되는 세가지 양극재를 살펴보면, 우선 LCO는 코발트가 Co3+에서 Co2+로 환원해 결정상에 변화가 일어나 붕괴가 발생한다. 따라서 LCO를 복구하는 과정에서 이 층상구조를 회복하기 위해서 산화가 필요하다. 다음으로 NCM에서는 리튬의 손실로 인해 비가역적인 상전이를 겪거나, 결정 표면에서 산소가 발생하는 부반응으로 인해 표면에 저하가 발생하는 등 여러가지 전이 요소가 포함되어 있어 상 변환 및 양이온 혼합을 포함해 더욱 복잡한 분해 원인이 존재한다. 또한 니켈 함량에 따라 적절한 직접재활용 방식의 선택이 필요하다. 마지막으로 LFP가 붕괴되는 주요 원인은 Fe2+가 Fe3+로 산화되어 리튬 이온의 수송 채널이 차단되기 때문이다. 따라서 LFP의 재활용에는 환원재를 첨가하는 것이 유리하다. 이처럼 직접재활용에 대한 연구는 물질이 어떻게 분해되는지의 관점에서 이루어져야 하므로 물질의 직접적 복구 방법의 매커니즘에 대한 추가 이해가 필수적이다. 또한 배터리의 사이클링 횟수가 임계값에 도달하면 배터리는 소모된 것으로 간주된다. 그럼에도 불구하고 배터리 구조의 상당 부분이 유지되기 때문에, 리튬 결과 구조적인 손상이 용량 저하의 주요 원인이자 직접 재활용의 궁극적인 목표로 받아들여짐에도 불구하고 높은 화학 물질 소비 빛 에너지 소비 전략을 어느 정도까지 신중하게 고려해야 하는지 유의해야 한다. 배터리의 성능 저하는 정교하고 그 원인이 서로 연관되어 있기 때문에 직접재활용 시 결정 구조 복구에만 국한되어서는 안 되며, 지속 가능한 폐쇄 루프 배터리 경제를 달성하기 위해서는 빠른 충전, 고전압 안정성 및 높은 에너지 밀도를 위한 유망한 에너지 저장 재료의 생산이 필요하다.\n" +
                            "폐 리튬이온 전지의 다른 후처리 방법으로는 값싸고 친환경적인 DES(공융용매)를 사용하는 방법도 있다. DES란 자연에 존재하는 고체 또는 액체상의 화합물을 실온에서 적당한 비율로 혼합하였을 때 각각의 화합물이 가지는 융점보다 낮은 온도인 실온에서 액상으로 되는 물질을 말한다. DES를 이용하는 방법은 습식 제련과 마찬가지로 보편적인 방법이며, 최근에 리튬 이온 배터리의 재활용 분야에서 사용되고 있다. 대부분의 DES는 환원성이므로 침출 시약과 환원재로 간주될 수 있다. 환원재는 양극재의 고가 금속 산화물의 환원을 촉진하고, 격자 에너지를 감소시키며, 금속 산화물 용해를 가속화할 수 있다. 현재 부식성이 강한 과산화수소는 침출 공정에서 가장 일반적으로 사용되는 환원제이다. 따라서 DES를 사용하면 추가 환원제 도입을 피할 수 있어 비용과 환경 오염을 줄일 수 있다. 어떤 경우에는 DES가 습식 제련법과 비슷하거나 더 나은 침출 효율을 나타내지만 회수 비용이 더 낮고 더 친환경적인 공정을 제공하기도 한다. 하지만 2차 재활용 DES가 여전히 양극재에 용해 효과를 가지며 침출 효율이 크게 감소하지는 않는 것으로 나타났고, 이러한 특성은 전통적인 재활용 방법에서는 사용할 수 없어 DES는 차세대 배터리 재료의 재활용 및 재사용에 더 적합하다고 여겨진다. 또한 DES는 니켈 및 코발트의 선택적 분리, 재활용성 및 낮은 침출 비용과 같은 일부 측면에서 상당한 이점을 갖는 것으로 생각된다. 하지만 실제로 적용되었을 때 고점도 DES로 인한 느린 침출 반응 및 여과 속도를 해결해야 할 것으로 보인다. 이를 위해 저점도 DES를 사용하거나 여과시 희석제를 사용하는 등의 방법이 적용될 수 있을 것이다. 또한 DES에 의한 NCA 및 LFP 재활용에 대한 연구도 부족하므로 리튬 이온 배터리에서 DES의 보편성이 입증되어야 할 필요가 있다.",
            "현재 리튬 이온 배터리는 재활용을 염두에 두지 않고 설계 및 제작되고 있다. 리튬 이온 배터리의 효율적인 재활용을 위해 분리를 쉽게 하기 위해서는 배터리 설계 과정에서 크게 두 가지 방법을 적용할 수 있다. 첫째로 쉽게 분리하고 개봉할 수 있는 셀이 포함된 모듈리스 팩을 활용하는 것이고, 두번째는 셀 분리 및 개방을 단순화하는 거시적인 분해와 집전체에서 활물질을 분리하는 미세한 전극 박리 모두에 중요한 접착제 및 바인더를 사용하는 것이다. 전극을 설계할 때 가역적 접착제를 개발하거나 잠재적으로 접착제가 없는 전극을 개발하면 활성 물질의 박리 및 복구가 단순화되고, 처리 전 다양한 화학 물질을 분리할 수 있어 교차 오염의 위험 또한 줄일 수 있다. "},
            //2
            {"","폐 리튬 이차전지의 재활용 공정이 실제로 사용되기 위해서는 개발된 기술을 사용한 공정의 경제성 평가가 우선적으로 이루어져야 한다. 전처리 과정을 거친 Black powder를 황산 3mol/L, 과산화수소 3vol%, 고액비 20g/L, 80℃의 공정 조건에서 탄소, 알루미늄, 구리, 철 등의 불순물을 제거하고 용매추출과 NaCO3를 사용한 리튬의 침전을 포함하는 공정의 경제성 평가를 예시로 살펴보면, 이러한 모델의 투자 비용과 운영 비용 등을 포함한 모든 비용을 고려해 경제성 분석을 시행한 결과 전체 투자비의 39.1%가 니켈 추출에 사용되며, 운전비의 43%는 리튬 침전 공정에 사용되는 것으로 분석되었다. 또한 금속 가격의 민감도 분석을 통해 금속 가격의 상황에 따라 10%/y 이상의 ROI(투자 수익률)를 얻을 수 있음을 확인했고 NPV(순 현재 가치. 사업의 가치를 나타내는 척도 중 하나로서, 0보다 작으면 가치가 없는 사업, 0보다 크면 가치가 있는 사업으로 판단할 수 있다.)가 양수 값을 보여 공정이 경제적으로 실현될 수 있다는 것을 확인하였다.\n" +
                    "또한 국내의 중대형 이차전지를 대상으로 재활용 산업의 수익성을 분석을 살펴보면, 유가금속 회수를 통한 경제적 편익만을 재활용 산업의 편익으로 산정했을 때 중대형 이차전지 재활용에 따른 희유금속 회수를 통한 매출액이 2029년 기준 420억으로 매년 크게 증가하는 것으로 분석되었다. 만약 폐 이차전지 재활용에 따른 환경 개선 또한 편익으로 산출할 경우에는 재활용 산업의 편익은 더욱 증가할 것으로 예측된다. 중대형 폐 이차전지의 재활용 관련 법제화 방안이 생긴다면 충분한 산업의 경제성을 기반으로 폐 이차전지의 재활용 산업이 더욱 활성화될 것으로 보인다."
                    ,"폐 리튬 이차전지의 더욱 효율적인 재활용을 위해서는 에너지 효율이 더 높고, 재활용이 용이한 리튬 이차전지 제조기술과 리튬 및 유가금속을 더욱 경제적으로 회수할 공정기술의 개발이 필수적이다. 현재 이차전지 산업에서는 배터리의 표준 구조나 폐배터리의 표준적인 평가 방법, 배터리 사용 후 폐기법에 대한 표준 방법 등이 정해져 있지 않아 총괄적 배터리 재활용 공정을 개발하는 데에 걸림돌이 되고 있다. 이에 따라 국가적 차원에서 이에 대한 정책을 마련해 더욱 적극적인 이차전지의 재활용 시장을 마련해야 할 것이다. 또한 자원의 고갈 속도가 점점 빨라지고 있는 만큼 재활용 산업의 빠른 발전을 위한 정책도 하루빨리 마련되어야 할 것이다."
            },
            {"전기차 산업의 발전과 함께 리튬 이차전지의 수요는 하루가 다르게 증가하고 있고, 이와 함께 자원의 고갈에 대한 문제도 급부상하는 중이다. 자원의 효율적인 활용을 통해 지속 가능한 배터리 산업의 발전을 위해서라도 폐 리튬 이차전지를 재활용하는 기술과 공정의 발전은 필수적이라고 할 수 있다. 그리고 이를 위해 많은 연구가 이루어지고 있기도 하다. 폐 리튬 이차전지의 전처리 과정과 후처리 공정을 더욱 경제적으로 개발하여 자원의 회수율을 높이는 것뿐만 아니라, 이를 뒷받침할 수 있는 제도적인 발전 또한 함께 이루어진다면 이미 상용되고 있는 이차전지 재활용 기술보다도 더욱 경제적이고 더욱 효율적인 공정이 개발되어 환경오염을 최소화하며 자원을 절약해 배터리의 지속적이 순환 과정이 만들어질 수 있을 것이라 기대된다.\n"}
            //4
    };//3
    String references13[][] = {
            {"김대원, 김희선, “저농도 황산 용액 및 2-스텝 침출 방법을 이용한 폐LiFePO4 양극재로부터 효율적인 리튬의 선택적 회수”, 한국청정기술학회, 청정기술 제29권 제2호, 2023, pp.87-94.",""},
            {"강동훈 외, “폐기되는 이차전지 내 열화된 LiCoO2 양극소재 성능 회복을 위한 재생공정 연구”, 한국전지학회, 한국전지학회지 제2권 제1호, 2022, pp.13-17.",""},
            {"박은미 외, “건식 공정을 통한 리튬이차전지의 재활용 연구 동향”, 자원리싸이클링학회, 자원리싸이클링학회지 vol.31, no.3, 2022, pp.27-39.",""},
            {"안다영 외, “효율적 수자원 활용을 위한 폐리튬이온배터리 재활용 습식 제련 기술 연구 동향”, 대한상하수도학회, 상하수도학회지 vol.37 no.2, 2023, pp.39-59.",""},
            {"박종선, “폐양극재 환원열처리를 통한 이차전지용 고순도 수산화리튬 제조 연구”, 전남대학교 박사학위논문, 2021.",""},
            {"C. -Y. Ku and J. -H. Chen, \"The Recovery of Lithium Iron Phosphate from Lithium Ion Battery,\" 2022 8th International Conference on Applied System Innovation (ICASI), ",""},
            {"Jiawei Wu 외, “Direct recovery: A sustainable recycling technology for spent lithium-ion battery”, Energy Storage Materials,Volume 54, 2023, pp.120-134,",""},
            {"Ahui Zhu 외, “The application of deep eutectic solvents in lithium-ion battery recycling: A comprehensive review”, Resources, Conservation and Recycling, Volume 188, 2023.",""},
            {"Roberto Sommerville 외, “A qualitative assessment of lithium ion battery recycling processes”, Resources, Conservation and Recycling, Volume 165, 2021.",""}
    };


    /**
     * 논문14
     */
    String title14 = "유기 이차 전지";
    String[] author14 = new String[]{"진수연"};
    String category14 = "Battery";
    String[][] contents14 = new String[][]{
            {"1. 유기 이차 전지의 필요성 및 구조"},
            {"2. 유기 이차 전지의 장점",
            "2-1. 친환경성",
            "2-2. 경제성"},
            {"3. 유기 이차 전지 한계점과 해결방안",
            "3-1. 에너지밀도",
            "3-2. 충전방전 속도",
            "3-3. 수명"},
            {"4. 유기 이차 전지 전망"}
    };

    String[][] text14 = new String[][]{
            {
                    "탄소 배출량을 줄이려는 세계적인 노력으로 인해 재생 가능 에너지로의 전환이 이루어지면서, 전기의 저장 및 이동 수단인 베터리의 필요성이 높아졌다. 현재 전기차 등에 쓰이는 리튬 이차전지 전극은 니켈, 코발트, 망간, 알루미늄 등 무기물이 주소재다. 이런 광물 자원은 매장량이 제한적이고 국제 정세에 따라 수급이 불안정해질 수 있다. 또한 이론적 성능인 250mAh/g에 도달하고 있어서 더 성능이 좋은 전지를 찾고 있다. 유기물 전극은 매장 자원인 무기물과 달리 합성을 통한 대량생산이 가능해 가격 경쟁력이 우수하다. 용량 대비 가볍고 유연한 특성도 있다. 재활용이 용이하다는 장점이 있어 지속 가능한 친환경 전지 시스템으로 각광받고 있다.\n" +
                            "이차 전지는 양극재, 전해질, 분리막, 음극재로 이루어져 있으며 양극의 양이온과 전자이 음극으로 이동하며 충전이 되고, 음극의 양이온과 이온이 양극으로 이동하며 방전이 된다. 양극과 음극을 이루는 물질을 양극재, 음극재라 한다. 양극재 음극재에서 화학적으로 반응하여 전기 에너지를 만들어 내는 활성 물질이 활물질이다. 리튬 이차 전지의 경우, 양극 활물질로 리튬 산화물, 음극 활물질로 탄소 물질을 많이 쓴다.\n" +
                            "   유기 이차 전지에서 활성물질인 산화환원 활성 유기 물질은 n 형, p 형, b 형으로 분류된다. 이는 산화나 환원하는 능력에 따른 유형으로 중성 상태에서 n형은 환원, p형은 산화, b형은 산화 환원 둘다 가능하다. 다른 분류로는 산소, 질소, 황 등의 원소 함유로 분류할 수 있다. 작용기마다 다른 특성을 가지고 있어 다양한 유기물에 따라 다양한 특성을 보인다. 예를 들어, 유기물 전극의 재료 중 하나인 디메틸페나진(DMPZ)과 페릴렌테트라카르복실 디언하이드라이드(PTCDA) 중 DMPZ는 초기 용량이 크고, PTCDA는 수명이 길다는 특징이 있다."
            },
            {
                    "",
                    "GWP는 지구 온난화 지수로 단위 시간 동안 특정 제품 1kg을 생산할 때마다 생산되는 이산화탄소 또는 일산화 탄소 양을 나타낸다. 100년 동안의 GWP를 비교해보면, 유기 이차 전지의 전극을 이루는 산화환원 활성 유기물질이 간단한 유기 물질에서 2-4단계의 합성 단계를 거치더라도 거의 1kg의 양극 활성물질 생성 당 약 20kg의 이산화탄소를 배출하는 전이금속 기반 활성물질에 비해 이산화탄소 생성이 약 1/3배 수준이다. 친환경적이다.",
                    "양극재는 일반적으로 셀 원가의 40%를 차지하는 가격 변동을 매우 크게 하는 요소이다. 또한 장기적으로는 급격히 증가하는 수요에 비해 공급이 따라가는 것이 힘들 것이다. 1kg당 75-20 달러의 가격을 보이는 전이금속 기반 활성물질의 가격에 비해 산화환원 활성 유기물질은 대량생산시1kg 당 15달러 선에서 가격이 형성되어 경제적이다.",
            },
            {
                    "",
                    "유기물의 낮은 전기전도도를 극복하기 위해 높은 함량의 탄소계 도전재 (활물질 사이에서 전자 이동 촉진시키는 물질)가 첨가되어 고에너지밀도 달성에는 한계가 있다. 고에너지밀도를 달성하는 방법으로는 여러 유기물을 써서, 전자 전도를 용이하게 하는 특정 분자 배열에서의 전하 이동 복합체 형성하게 하는 방법이 있다. 이는 고유 전도성을 크게 향상시킨다.",
                    "실제 전기차ㆍ휴대용 전자기기 등에 적용되기 어려운 느린 충전 속도도 지닌다. 충전방전 속도를 증가시키는 방법으로는 라디칼 고분자를 사용하는 방법이 있다. 이외에도 유기물이 π 전자계를 가지면 탄소 물질 사이 상호작용으로 속도가 빨라져, 그래핀, 탄소나노튜브 등의 첨단 탄소 소재를 사용하면 높은 전도성을 보인다. 이러한 물질을 사용 시, 전도성 물질과의 접촉 면적이 증가한다. 이렇게 강화된 접촉 영역은 전도제로부터 전자를 효율적으로 흡수할 뿐만 아니라, 이온 확산 경로를 감소시켜 속도 성능을 성공적으로 향상시킨다. 그렇지만 부피 및 전력 밀도의 감소로 인해 고성능 유기 충전 배터리에 최적의 전략이 아닐 수 있다.",
                    "전이 금속 기반 전극 재료와 달리 유기물은 분자 사이의 약한 반데르발스 힘에 의해 결합된다. 따라서, 산화환원 활성 유기 물질은 액체 전해질에 용해되기 쉬운 경우가 많으며, 전해질 내의 용매 분자에 의한 용매화를 통해 전극에서 떨어질 수 있다. 전극에서 산화환원 활성 유기 물질의 지속적인 손실은 충전 방전 반복 시 용량의 점진적인 감소로 이어지며, 이는 실제 사용을 제한하는 주요 장애물로 작용한다. 고농도 전해질을 쓰는 방법이 있다. 고농도 전해질에서는 용매화 구조의 변화에 따라 자유 용매 분자의 수가 크게 감소하므로 유기 전극의 용해가 방해를 받는다. 또는 선택적 투과 분리막을 쓰는 방법이 있다. 새로운 막 공학을 통해 기공 크기를 정밀하게 제어하여 전해질에서 이온을 운반하는 동안 산화환원 활성 유기 분자를 선택적으로 차단하는 것이다. 이온성 액체와 같은 무용매 전해질을 사용하는 것도 용해를 억제하는 유망한 방법이다.",
            },
            {
                    "지구 환경 오염에 대한 우려가 커지면서 지속 가능하고 친환경적인 배터리 화학 물질의 개발이 촉발되었다. 그런 점에서 유기 이차 전지는 이 시대의 요구를 충족시킬 수 있는 차세대 유망 시스템으로 평가받고 있다. 그렇지만, 아직 대량 생산이 불가한 상태이고 전극 소재로 연구 중이라, 완전한 베터리를 이룬 상태에서도 친환경적인지 조사가 필요하다. 또한 저에너지밀도, 느린 충전 방전 속도, 짧은 수명의 문제는 대량 생산을 하기에 큰 문제점으로, 해결된다면 경제적이고 재활용도 용이하고 성능 좋은 유기물 베터리가 개발될 것으로 전망한다.\n"
            }
    };
    String[][] references14 = new String[][]{
            {"Kim, J., Kim, Y., Yoo, J. et al. (2023). “Organic batteries for a greener \n" +
                    "rechargeable world.“ Nature Reviews Materials , 8, pp.54–70",""},
            {"Ham, Youngjin & Fritz, Nathan & Hyun, Gayea & Lee, Young & Nam,\n" +
                    " Jong & Kim, Il-Doo & Braun, Paul & Jeon, Seokwoo. (2021). \n" +
                    "“3D periodic polyimide nano-networks for ultrahigh-rate and sustainable \n" +
                    "energy storage.”, Energy & Environmental Science, 14(11), pp.5894 – 5902",""},
            {"Nicolas Goujon, Nerea Casado, Nagaraj Patil, Rebeca Marcilla, \n" +
                    "David Mecerreyes, (2021), “Organic batteries based on just redox polymers”, Progress in Polymer Science, 122 ",""},
            {"Jihye Park, Jun Hyeong Gu, Myeong Ju Lee, Sun Hwa Park, Junghoon Jahng,\n" +
                    " Donghwa Lee, Young-Gi Lee, Hosun Shin, Jung-Yong Lee, Jae Yong Song, (2023), “Spontaneous electrochemical stabilization of nanostructured organic electrodes by field-induced charge-transfer”, Energy Storage Materials, 61",""},
            {"","LG에너지솔루션, (2021), “리튬이온배터리의 구조와 작동 원리”, \n" +
                    "battery inside, https://inside.lgensol.com/2021/11/%EB%A6%AC%ED%8A%AC%EC%9D%B4%EC%98%A8%EB%B0%B0%ED%84%B0%EB%A6%AC%EC%9D%98-%EA%B5%AC%EC%A1%B0%EC%99%80-%EC%9E%91%EB%8F%99-%EC%9B%90%EB%A6%AC/, (2023-11-18 방문)"},
            {"LG에너지솔루션, (2022), “배터리 용어사전 – 활물질”, battery inside", "https://inside.lgensol.com/2022/10/%EB%B0%B0%ED%84%B0%EB%A6%AC-%EC%9A%A9%EC%96%B4%EC%82%AC%EC%A0%84-%ED%99%9C%EB%AC%BC%EC%A7%88/#:~:text='%ED%99%9C%EB%AC%BC%EC%A7%88'%EC%9D%B4%EB%9E%80%3F,%EC%9D%8C%EA%B7%B9%20%ED%99%9C%EB%AC%BC%EC%A7%88'%EC%9D%B4%EB%9D%BC%20%EC%9D%BC%EC%BB%AB%EC%8A%B5%EB%8B%88%EB%8B%A4., (2023-11-18 방문)"},
            {"LG에너지솔루션, (2022), “전지전능한 전지 이야기 – 양극, 음극 모두 커버 가능!\n" +
                    " CNT 도전재”, battery inside,","https://inside.lgensol.com/2022/08/%EC%A0%84%EC%A7%80%EC%A0%84%EB%8A%A5%ED%95%9C-%EC%A0%84%EC%A7%80-%EC%9D%B4%EC%95%BC%EA%B8%B0-%EC%96%91%EA%B7%B9-%EC%9D%8C%EA%B7%B9-%EB%AA%A8%EB%91%90-%EC%BB%A4%EB%B2%84-%EA%B0%80%EB%8A%A5-cnt/, (2023-11-18 방문)"},
    };

    /**
     * 논문15
     */
    String title15 = "수계 아연 이차전지의 연구 개발 동향";
    String[] author15 = new String[]{"신지연"};
    String category15 = "Battery";
    String[][] contents15 = new String[][]{
            {"1. 서론"},
            {"2. 장수명 수계 아연 이차전지를 위한 아연 금속 음극의 안정화 기술",
            "2-1. 아연 금속 음극의 문제점",
            "2-2. 아연 금속 음극의 문제를 해결하기 위한 안정화 기술"},
            {"3. 수계 아연 이차전지의 차세대 양극재 연구 개발 동향",
            "3-1. MOF(Metal-organic framework)를 이용한 양극",
            "3-2. COF(Covalent organic framework)를 이용한 양극",
            "3-2. COF(Covalent organic framework)를 이용한 양극",
            "3-3. Macrocycle을 이용한 양극"},
            {"4. 결론"}
    };

    String[][] text15 = new String[][]{
            {"화석연료 사용으로 인한 각종 환경문제가 심각해짐에 따라 친환경적/경제적이며 지속 가능한 에너지원에 관한 관심이 계속해서 커지고 있다. 이에 화석연료에 대한 의존성을 낮추고 지속 가능한 에너지원의 개발을 목표로, 수십 년간 연구가 진행된 리튬 이온 이차전지(Lithium ion battery, LIB)는 높은 에너지밀도와 우수한 수명특성으로 인해 소형 전자기기부터 전기자동차, 대용량 에너지 저장장치(Energy storage system, ESS) 등에 활발히 사용되고 있다. 하지만, 누액, 팽창, 부반응, 폭발의 위험성 등의 고질적인 안전성 문제가 여전히 해결되어야 할 과제이며 리튬, 전이금속 전구체 등의 원료에 대해서는 제한된 매장량, 높은 가격, 가격 불안정에 따른 자원의 무기화 등의 문제가 존재한다. 이에 리튬 이온 기반 에너지 저장장치를 대체하려는 시도가 활발히 진행되고 있다.\n" +
                    "소형화를 중요시하는 LIB와는 다르게 ESS는 부피/무게에 대한 제약이 덜해 낮은 생산단가와 보수/유지 비용이 중요한 요소로 여겨지며, 높은 에너지밀도, 빠른 충·방전 속도, 높은 안정성을 요구한다. 이를 만족하는 차세대 에너지 저장장치로서 수계 아연 이온 이차전지(aqueous zinc ion battery, AZIB)가 주목을 받고 있다. 특히, AZIB는 그리드 시스템에 적용하기 적합한 후보 에너지 저장장치로 많은 연구가 진행되었다. 가연성이 있어 충·방전 과정에서 발생한 산소 기체와 더불어 화재의 위험성을 초래하는 유기용매 전해질과 비교했을 때, AZIB는 다음과 같은 장점들이 있다.\n" +
                    "먼저, 물을 전해질 용매로 사용하기 때문에 전지의 장기간 사이클 이후, 단락(short circuit) 문제가 발생하더라도 발화 위험이 없어 안전한 구동이 보장된다. 게다가, 수계 전해질은 독성이 없고 유기용매에 비해 빠른 이온 전도 특성을 보이기도 한다. 또한, 아연 금속은 다전자 교환과 높은 밀도(25℃에서 7.13 g cm-3)로 리튬 금속 음극의 3배에 이르는 높은 부피당 용량(5851 mAh cm-3)을 가지며, 낮은 산화 환원 전위[-0.76 V vs 표준 수소 전극(standard hydrogen electrode, SHE)]로 인해 넓은 작동 전압 및 높은 에너지밀도 달성이 가능하다는 큰 장점도 지닌다. 이외에도, 아연은 지구상에 풍부한 물질로 친환경적이고 원가가 저렴하다는 장점이 있는데, 아연 금속의 매장량은 리튬 금속의 매장량보다 3000배 많은 것으로 알려져 있다.\n"},
            {"",
                    "1) 아연 음극 충•방전 메커니즘\n" +
                            "아연 음극은 사용하는 전해질의 pH에 따라 상이한 충•방전 메커니즘을 나타낸다. 알칼리성 전해질에서 Zn2+ 이온은 OH- 이온과 반응하여 Zn(OH)4 2-를 형성한다. 생성된 Zn(OH)4 2-의 농도가 전해질 내에서 용해 한계를 넘게 되면 ZnO가 생성되어 아연 음극 표면에 비가역적인 피막 형태로 형성된다. 결과적으로, 이러한 피막이 형성된 곳은 더 이상 전자 및 이온 전달이 이루어지지 않기 때문에 용량 저하와 함께 전지 성능이 퇴화된다. 약산성 전해질(pH~5)에서는 ZnO가 생성되지 않기 때문에 이러한 반응이 억제된다. 그러므로, ZnSO4나 Zn(CF3SO3)2 등의 염을 전해질로 사용하면, 알칼리성 전해액보다 가역적인 아연의 전착 및 탈착 반응이 가능하다.\n" +
                            "아연 음극에서 Zn2+ 이온의 전착과 탈착 거동은 전위구배(potential gradient)와 농도구배(concentration gradient) 및 대류 강도에 영향을 받는다. 또한, Zn2+ 이온의 확산 속도와 Zn2+ 이온의 전착 및 탈착에 관여하는 전기화학적 분극 정도에 따라서도 영향을 받는다. 즉, Zn2+ 이온의 확산 속도와 전기화학적 분극을 감소시킬수록 균일한 Zn2+ 이온의 전착 및 탈착 거동이 나타난다. 추가적으로 전해질의 조성에 따라 Zn2+ 이온을 둘러싸는 이온/분자가 달라지며 이 또한 Zn2+ 이온의 전착 및 탈착에 많은 영향을 미친다.\n" +
                            "2) 덴드라이트 형성\n" +
                            "수계아연이차전지의 낮은 수명 특성에 가장 큰 영향을 주는 덴드라이트는 충전 과정에서 Zn2+ 이온이 특정 음극 부분에 집중적으로 전착되어 형성되는 결정체로서 전해질의 pH에 따라서 다른 형태를 나타낸다. 초기 충전 과정에서 아연 음극 표면으로의 불균등한 Zn2+ 이온의 전착으로 인해 작은 돌출부(protrusion)가 생성되면 전기장이 집중되고 Zn2+ 이온의 전착이 가속화되는 “tip effect\" 현상이 발생하며, 덴드라이트가 형성된다. 알칼리성 전해질에서는 불안정한 Zn(OH)4 2- 생성 및 아연 음극의 급격한 부식으로 인해 잔가지가 있는 원뿔 모양의 덴드라이트가 생성되는데 반해 약산성 전해질에서는 Zn2+ 이온의 확산 거동이 알칼리성 전해질과 다르게 나타나기 때문에 잔가지 형상이 없는 2D 구조의 육각형 아연 덴드라이트가 관찰된다. 아연은 리튬에 비해 영률(Young's modulus)이 매우 높기(~ 108 GPa, vs. ~5 GPa for Li) 때문에 아연 덴드라이트는 분리막을 쉽게 뚫고 양극과 맞닿아 단락을 일으키기 쉽다. 덴드라이트가 깨져서 전해액에 부유하는 'dead zinc’가 형성될 수 있는데, 이 dead zinc도 분리막을 통과해서 양극과 연결되어 전지의 단락을 일으키는 원인이 될 수 있다.\n" +
                            "3) 수소 발생 반응 및 부식\n" +
                            "Zn2+/Zn의 평형전위는 H2O/H2 보다 항상 낮기 때문에 충전 시 열역학적으로 아연의 증착보다 수소 발생 반응이 선호되지만, 실제 전해액 내에서는 수소 발생에 대한 높은 과전압을 나타내기 때문에 수소 발생이 억제될 수 있다. 수계아연이차전지는 아연 음극의 부식과 높은 전류 밀도로 인해 충전과정에서 수소가 발생하며 수소는 배터리의 팽창과 이로 인한 패키징의 파괴 위험을 증가시킨다. 또한, 수소 발생과 함께 생성된 OH- 이온이 H+ 이온을 소모하면서 국부적으로 pH가 상승하게 되어 Zn4(OH)6SO4 /ZnO와 같은 표면 피막을 형성시킨다.",
                    "1) 전해질 최적화\n" +
                            "수계아연이차전지의 전해질은 아연음극과 직접 맞닿는 계면을 형성하는데, 이 계면 안정성이 전지의 부식 및 덴드라이트 발생의 결정적인 요인이 되어 전지의 쿨롱 효율 및 수명 특성에 큰 영향을 미친다. 전통적인 알칼리성 전해질에서 아연 음극은 ZnO 형성 등의 부식으로 낮은 수명 특성을 보였다. 최근 약산성 전해질을 도입한 전지는 알칼리성 전해질을 사용했을 때보다 아연 음극의 부식이 상당히 개선되어 전지의 수명 특성이 향상되었다. 특히 상대 음이온이 상당히 안정적이고 높은 이온 전도도(~4 S cm-1), 넓은 작동 전압 범위를 갖는 ZnSO4 및 Zn(CF3SO3)2가 약산성 전해질로 가장 널리 사용되고 있다. 그러나 ZnSO4 전해질은 충•방전 시 아연 음극 표면에 부산물이 생성되는 문제점을 나타낸다는 것이 보고되었다. Zn(CF3SO3)2는 이러한 부산물 생성을 다소 완화시킬 수 있으며 CF3SO3- 이 Zn2+ 이온을 둘러싼 H2O 분자들의 수화 효과(solvation effect)를 줄여주기 때문에 Zn2+ 이온 이동(migration) 및 전하이동(charge transfer)을 촉진시킬 수 있다. 특히, 충•방전 중에 Zn2+ 이온의 안정적인 전착 및 탈착을 유도하기 때문에 덴드라이트 형성을 저감시킬 수 있다.\n" +
                            "그러나 Zn(CF3SO3)2는 ZnSO4 대비 수십 배 정도에 달하는 높은 가격을 보이며, 양극의 전극 밀도를 높이게 되면 덴드라이트 및 아연 음극의 부식이 가속화된다. 이를 해결하기 위해 다양한 첨가제(triethyl phosphate, polyacrylamide, poly-ethyleneamine, acetamide 등)와 새로운 형태의 전해질(deep eutectic solvents 등) 등이 연구되고 있다.\n" +
                            "2) 음극의 구조화\n" +
                            "수계아연이차전지의 수명 특성에 가장 큰 영향을 주는 덴드라이트의 형성을 억제하기 위한 한 방법으로 아연 음극의 구조를 최적화하는 연구가 활발히 진행되고 있다. 일례로, 3D 아연 음극은 전극과 전해질 계면 사이의 접촉 면적이 증가하여 단위 면적당 전류 밀도가 낮아지게 되며, 이는 Zn2+ 이온의 전착 및 탈착 과정에서 나타나는 과전압(overpotential)을 감소시키기 때문에 덴드라이트의 형성을 완화할 수 있다. 최근에 도금을 통한 3차원 형상의 아연 음극을 제작하여 Zn2+ 이온의 전착 및 탈착 시 과전압이 상당히 감소하는 것이 보고되었다. 또한, 충전 시 002면 방향으로 아연이 전착될 수 있는 도전성의 지지체를 도입하여 덴드라이트를 억제하는 연구도 보고되었다. 하지만 아연 표면이 그대로 전해질에 노출되기 때문에 부반응 문제를 피할 수 없으며, 이로 인한 자기 방전 및 쿨롱 효율의 감소가 발생하게 된다.\n" +
                            "3) 표면 보호막 형성\n" +
                            "아연 음극 표면에 적절한 보호막을 형성하게 되면 아연 음극과 물 분자의 직접적인 접촉을 막을 수 있기 때문에 앞서 음극 구조화의 문제점으로 제시된 아연 음극의 부식 및 수소 발생을 완화할 수 있다. 특히 이온 전도성 보호막은 Zn2+ 이온을 아연 음극 표면으로 전도하는 통로 역할을 하여 균일한 Zn2+ 이온의 전착 및 탈착을 유도하고 결과적으로 덴드라이트 형성을 억제할 수 있다. 지금까지 보고된 코팅 물질은 크게 유기물과 무기물, 그리고 전도성의 유무로 분류된다. 대표적인 도전성 물질인 탄소로 이루어진 전도성 보호막은 전극 표면에 전류를 더욱 균일하게 분포하게 하여 덴드라이트 형성을 억제할 수 있으며, 기계적 물성이 우수한 비전도성 물질을 코팅할 경우에는 장기적인 사이클 안정성이 더욱 향상됨이 보고되었다.\n" +
                            "또한 아연 음극 표면에 친수성 실란 커플링제(3-Aminopropyltriethoxysilane, AP-TES)를 연속공정이 가능한 딥코팅(dip-coating)을 통해 500nm의 초박막을 형성하여 부식 및 수소 발생, 그리고 덴드라이트 형성을 효과적으로 억제한 연구가 보고되기도 했다. 음극 표면 보호막의 화학적 성질에 따라 Zn2+ 이온 전착 형태가 달라짐을 최초로 관찰하였으며 특히 친수성 보호막이 형성되었을 때 음극 표면으로의 Zn2+ 이온의 흐름(flux)이 더욱 균일해지므로 덴드라이트 가 형성되지 않고 안정적으로 Zn2+ 이온의 전착과 탈착이 일어남을 규명하였다. 최근에는 안정적인 Zn-F 결합을 유도할 수 있는 코팅층이 보고되었으며, 덴드라이트와 부식 반응을 억제하는 것과 동시에 간편하고 대면적 아연 음극에 균일하게 보호막을 형성할 수 있도록 하는 최적화에 대한 연구가 활발히 진행 중이다."},
            {"",
                    "MOF(Metalorganic framework)는 다공성 결정질 물질로 전이금속과 유기 링커로 구성된다. 전이금속과 유기 링커의 다양한 조합으로 화학적 성질, 표면적, 기공 크기를 다양하게 조절이 가능한 장점이 있다. 특히 전지의 충/방전 과정 중 발생하는 아연 이온의 탈/삽입 과정은 기존 양극재들의 상전이를 유발하고 구조를 붕괴시켜 적용에 제약이 존재한다. 반면, MOF는 충/방전과정에도 안정적으로 유지가 가능한 견고한 구조를 갖고 있다. 이러한 MOF의 고유한 성질은 에너지 저장 장치 분야에 널리 적용할 수 있는 역할을 수행한다.\n" +
                            "구리 이온과 퀴노이드 단위체를 갖는 Cu3(HHTP)2를 수계 아연이차전지 양극재로 적용된 연구에서, 2차원 전도성 MOF로 높은 전기전도도(0.2 S/cm) 및 큰 기공(~2 nm)을 가져 아연 이온의 이동을 용이하게 해 높은 확산 속도를 가진다. MOF 구조 내부의 큰 기공은 충/방전 과정 중 수화된 아연 이온과의 낮은 계면 저항을 제공한다. 또한 아연 이온이 삽입된 유기 링커의 퀴노이드 부분이 산화환원 활성을 가져 양극의 성능을 증대시킨다. 이로 인해 Cu3(HHTP)2 양극을 수계 아연이차전지에 적용하였을 때 높은 가역 용량과 수명특성을 기록했다.\n" +
                            "또한 다양한 MOF 중 아연 저장 능력이 가장 높은 Mn(BTC)를 양극으로 적용된 연구의 경우 전지 충전 과정에서 Mn(BTC) 전극은 나노플라워 및 막대 모양의 구조를 형성하는데, 방전 과정에서는 나노플라워 입자가 사라지고 막대 모양은 유지하는 거동이 관측되었다. 충전 과정에서 아연 이온이 망간 이온을 대체하여 카복실기와 배위해 Zn(BTC)로의 변환이 일어나고 유기 링커인 BTC는 산화환원 과정에 관여하지 않음이 밝혀지며, 기존 망간 및 바나듐계 양극재에 비해 구조적으로 안정한 MOF를 사용했을 때 우수한 수명 특성 실현이 가능함을 보였다.\n" +
                            "그럼에도 불구하고 MOF 합성 시 수율이 낮아 양극재의 대량 제작 수요를 충족시키지 못한다는 제한점이 존재한다. 또한, 기존 양극재들보다는 높은 구조적 안정성을 가지고 있지만 수명 특성을 더욱 증가시키기 위해서는 강한 배위결합력을 가지는 전이금속과 유기링커의 조합을 찾기 위한 연구가 수행되어야 한다.",
                    "무기 재료의 한계를 극복하기 위하여 유연한 구조와 산화환원 활성 부위를 제공하는 유기 양극 재료를 활용하여 고용량 고출력 AZB용 양극재를 개발하는 방면의 연구가 진행되어왔다. 그중에서도 구조를 다양하게 조절할 수 있으며 정렬된 다공성과 화학적 안정성을 지닌 COF(Covalent Organic Framework)는 적합한 양극재 후보로 손꼽히고 있다.\n" +
                            "COF는 유기 링커로 구성되어 여러 차원의 구조를 이룰 수 있으며, 2D 구조는 π-π 적층 메커니즘으로 인하여 높은 전기 전도성을 제공할 수 있는 것으로 알려져 왔다. 2D COF의 층상 구조는 아연 이온의 저장하는 풍부한 호스트 구조를 제공하며 전해질 이온의 침투를 촉진하여 전기화학적 반응을 가능하게 한다. 초기 사이클의 안정성을 높이고 에너지와 전력 밀도를 증가시킬 수 있는 새로운 COF 양극재를 정교하게 설계하는 것은 현행 연구들의 필수 사항이다.\n" +
                            "2D COF가 페러데이와 비페러데이로 아연 이온 저장 촉진을 활용한 연구에서는 하이드로 퀴논으로 연결된 8-ketoenamine COF (HqTp)를 아연 이온 고정 물질로 사용하였다. COF의 풍부한 친핵성 부위는 2가 아연 이온을 고정시키며, C=O와 N-H 작용기가 아연 이온의 배위 능력을 향상시키는 것을 이용한 기존 결과를 기반으로 아연 이온의 가역적인 탈부착을 구현하였다.\n" +
                            "대부분의 유기 전극 재료에서 공액 카르보닐 화합물이 사용됨을 바탕으로 하여 카르보닐기가 풍부한 PTO(pyrene-4,5,9,10-tetraone)을 양극재로 활용한 연구에서 카르보닐기는 표면에서 제어 가능한 pseudocapacitive behavior를 제공하여 고속 성능을 구현할 수 있다. 특히 인접한 카르보닐기는 다가 이온의 리간드로서 기능할 수 있으며 pyrene 고리 사이의 π-π 적층 상호작용은 전기 전도성을 향상시킨다. Benzene tricarboxaldehyde(BT)와 PTO로 연결된 COP를 합성하면서 아연 이온의 삽입을 가능케 하며 높은 가역 용량과 우수한 속도 특성을 나타내었다.\n" +
                            "따라서 COF는 유기 링커의 조합으로 아연 이온을 이동시킬 수 있는 다양한 차원의 구조를 구현할 수 있다. 하지만 COF는 안정성 문제로 가혹 조건에서 양극재의 심각한 부반응으로 인해 낮은 쿨롱 효율을 보이므로, 전기화학적 반응에서의 COF의 안정성을 개선하는 것이 필요하다.",
                    "최근 산화환원 활성이 있는 유기물질을 기반으로 한 전극은 합성 과정의 유용성과, 낮은 가격, 가벼운 무게로 인해 많은 관심을 받고 있다. 특히 퀴논 유도체들은 가역적인 산화환원 과정과 높은 비용량을 가진다. 그러나 퀴논 기반 활물질들은 용출이 쉽게 발생해 전지 수명을 열화시키는 원인이 된다. 따라서 용출 문제를 해결하기 위해 활성 모노머들을 중합하거나, 불용성 복합물에 혼합시키는 방법들이 사용된다. 그 중에서도 Macrocyclic 복합체는 낮은 용출성과 규칙적인 기공 구조로 인하여 높은 용량을 실현할 수 있다.\n" +
                            "삼각형 구조의 Macrocyclic phenanthrene-quinone(PQ-∆)을 수계 아연이차전지의 양극으로 사용한 연구에서 고유의 빈 공간은 수계 전해질 내에서 불용성을 나타내고 이온 이동을 용이하게 한다. 충/방전 과정 동안 아연 이온은 PQ-∆ 내로 삽입되고, 탈리되는 과정을 가역적으로 거치게 된다. 특히, 아연 이온이 삽입 시 물 분자의 공 삽입을 통해서 전해질/전극 계면저항의 감소 효과와 양극재 내에서의 물 분자에 의한 전하차단효과로 고용량, 고효율 특성을 보였다.\n" +
                            "그러나 Macrocycle의 낮은 작동 전압 범위라는 한계로 유기 양극재의 적용을 위해서는 작동 전압 범위를 넓히는 연구가 진행되어야 할 것이다. 또한 다가 이온 저장 메커니즘을 활성화하여 배터리 성능을 크게 향상시키는 유기 양극 재료의 설계 전략이 필요하다."},
            {" 최근 활발한 연구가 이루어지고 있는 수계 아연 이차전지의 작동 메커니즘과 문제점 및 이를 해결하기 위한 연구 동향에 대해서 소개하였다. 수계 아연 전지의 성능 저하의 원인이 되는 덴드라이트와 수소 발생 반응, 부식 등의 문제를 해결하기 위해서 전해질 최적화, 음극의 구조화, 표면 보호막 형성의 전략 등이 사용되고 있다. 그 중 아연 음극 표면의 보호막 형성 전략은 덴드라이트와 부반응을 동시에 억제할 수 있는 합리적인 방법으로, 이를 적용하여 수계 아연 이차전지의 수명 특성 및 성능을 크게 향상시킨 연구들이 여러 차례 보고되었다. 또한 수계 아연 이차전지의 상용화를 위한 차세대 양극재의 개발 연구 동향을 살펴보았다. 새로운 양극 소재는 전지 구동 중 발생하는 아연 이온의 탈/삽입을 안정적으로 작동시켜야 하며, 이를 만족하는 MOF, COF, Macrocycle 등의 유기 기반 양극재들에 대해 알아보았다. 그러나 수계 아연 이차전지 개발은 리튬이차전지 대비 여전히 낮은 작동 전압과 에너지 밀도 등으로 아직 초기 단계에 머무르고 있으며, 이는 수계 아연 이차전지가 안전한 ESS 전원으로서 상용화되기까지 여전히 많은 연구가 지속적으로 이루어져야 함을 의미한다. 따라서 리튬 이차 전지를 대체할 새로운 전지로서 수계 아연 이차전지의 성공적인 상용화를 위해서는 활발한 연구와 더 큰 노력을 기울일 필요가 있을 것으로 보인다."}
    };
    String[][] references15 = new String[][]{
            {"유승호, 김찬훈, 남관우, 박민준, 수계 아연 이차전지, News & Information of Chemical Engineers, 40권 40호, 2022, pp.412-126",""},
            {"강우석, 조창신, 수계 아연 이차전지 전해질 연구 개발 동향, Ceramist, 24권 1호, 2021, pp.35-53",""},
            {"조정근, 김재국, 차세대 이차전지용 아연 이온 이차전지 소재 연구 개발 동향, Ceramist, 21권 4호, 2018, pp.312-330",""},
            {"나성민, 박현규, 김선욱, 조혁희, 박광진, 리튬이온전지 양극 물질 연구동향, 공업화학 전망, 23권 1호, 2020, pp.3-17",""},
    };


    /**
     * 논문16
     */
    String title16 = "리튬 이온 배터리에 적용되는 코팅 공정과 그 응용";
    String[] author16 = new String[]{"황다인", "박민정"};
    String category16 = "Battery";
    String[][] contents16 = new String[][]{
            {"1. 서론",
                    "1-1. 베터리의 중요성",
                    "1-2. 베터리에 생기는 문제 및 원리"},
            {"2. 본론",
                    "2-1. 코팅 방법",
                    "2-2. 코팅 재료"
            },
            {
                    "3. 본론2",
                    "3-1. PDMS 소개",
                    "3-2. PDMS 실험",
                    "3-3. PDMS의 CVD를 이용한 나노 입자의 소수성 코팅",
                    "3-4. 소수성 PDMS 코팅의 안정성",
                    "3-5. 오일 및 비극성 유기용매 제거를 위한 PDMS 코팅 나노 입자의 적용"
            }
    };
    String[][] text16 = new String[][]{
            {
                    "",
                    "현대 사회에서 배터리는 우리의 일상 생활과 기술 혁신에 필수적인 역할을 하고 있다. 휴대용 전자기기, 전기 자동차, 신재생 에너지 저장 등 다양한 응용 분야에서 배터리는 에너지 저장 및 이동에 핵심적이다. 다양한 배터리 중 리튬이온 배터리(LIB)와 납축전지(LAB)는 전기자동차 시장에서 최고의 지위를 차지하고 있다. 나트륨/칼륨/마그네슘/알루미늄/아연계 배터리 등 신재생 에너지 발전 및 대규모 에너지 저장 물질의 개발이 가속화되고 있는 상황이다. 새로운 화학 물질의 탐사는 고성능 배터리의 개발을 목표로 하고 있다. 한편, 배터리의 성능과 수명을 결정하는 주요 요소 중 하나는 배터리 내부의 전극이다. 전극은 충전 및 방전 과정에서 화학 반응을 조절하고 전기 에너지를 저장하는 역할을 한다. 그러나 전극은 화학적 반응과 전기적 스트레스로 인해 부식될 수 있다. 이러한 부식은 배터리의 성능을 저하시키고, 수명을 단축시키며, 환경 문제를 야기할 수 있다. 따라서 배터리 전극 부식 현상에 대한 연구 및 이를 방지하기 위한 기술적인 개선이 중요하며 그 중요성을 더욱 부각시키는 시기에 와 있다.",
                    "일반적인 리튬이온 배터리는 리튬이온 배터리의 기본적인 구조는 양극, 음극, 전해질, 그리고 외부로 전기를 공급하거나 받는 회로로 구성된다. Anode(음극)는 배터리에서 전자를 방출하는 부분으로, 리튬이온 배터리의 경우에는 양극에는 리튬 금속 또는 리튬 화합물이 사용된다. 충전 상태에서는 양극에서 리튬 이온이 방출된다. Cathode(양극)은 배터리에서 전자를 수용하는 부분으로, 리튬이온 배터리의 경우에는 양극에는 리튬 이온을 수용할 수 있는 화합물이 사용된다. 전해질 (Electrolyte) 양극과 음극 사이에 위치한 전해질은 이온의 전도를 허용하면서 전자는 흐르지 않도록 하는 역할을 한다. 리튬이온 배터리에서는 전해질로 액체나 고체 전해질이 사용된다."
            },
            {
                    "",
                    "배터리의 전극의 표면 코팅은 배터리의 성능에 직접적인 영향을 준다. 먼저, 코팅층의 두께는 배터리의 성능에 큰 영향을 줄 수 있는 요소 중 하나이다. 코팅층의 두께가 너무 두꺼울 경우 전극의 보호의 정도는 강해지지만 그만큼 이온의 수송의 거리가 늘어남에 따라 전자의 수송이 제한이 된다. 반대로 코팅의 두께가 지나치게 얇게 형성할 경우, 해당 코팅층을 형성하는 것에 지나치게 많은 에너지가 투입되거나 원하는 보호 성능을 내기 힘들어진다. 이 외에도 공정의 과정 중에 표면의 코팅을 하는 것을 넘어 표면의 구조를 왜곡하거나 변형할 수 있는 가능성이 있기 때문에 적절한 공정의 선택이 필요하다. 따라서, 전극의 표면 코팅은 마이크로 또는 나노미터 규모의 정도를 요구하는 Thin film Deposition 공정을 사용해야 한다. ",
                    "1) 산화물 oxide: 대표적인 코팅 재료로는 금속 산화물을 사용하는 것이다. MgO, Al2O3 및 TiO2 가 표면 코팅에 가장 일반적으로 대표적인 예이다. 먼저, Al2O3 코팅은 또한 Li + 확산 경로를 제공하면서 표면의 화학적 안정성을 향상시킨다. 이는 Al2O3가 전해질(LiPF6) 사이의 반응을 억제하는 층을 생성하여 Al2O3 코팅층 위에 새로 생성된 AlF3층이 전해질의 추가 침식을 방지할 수 있어 양극재의 내부 구조를 안정화 시킬 수 있기 때문이다. ZnO 코팅은 산소 이온 의 빠른 흡착을 허용하는 ZnO 층의 댕글링 결합으로 인해 표면 에너지 양극 재료의 전도성이 향상된다.\r\n 이산화지르코늄(ZrO2) 코팅은 HF 제거제 역할을 할 수 있으며 Mn의 용해를 완화하는 데 도움을 줄 수 있으며, 이는 음극 입자와 ​​전해질 사이의 경계면에서 유해한 상 변환을 방해합니다.  또한, ZrO2 코팅과 LiMn2O4 캐소드 입자 사이에 형성된 강한 산소 결합은 높은 전위에서 Mn3+ /Mn4+ 산화환원 이동을 감소시킬 수 있다. 이는 높은 차단 전압에서 전위 사이클링에 대한 향상된 안정성과 높은 속도 성능을 나타내는 것으로 밝혀졌다.\r\n 2) 불화:  미세하게 코팅된 MgF2 층은 음극 물질의 HF로 인한 표면 침식을 효과적으로 억제하고 배터리의 수명을 향상시킬 수 있다. YF3 코팅이 전해질에 의한 Li 1.2 Mn 0.54 Ni 0.13 Co 0.13 O 2 의 부식을 효과적으로 억제하고 활성 산소에 의한 산화 반응을 완화할 수 있음을 보여주었다. 또한, AlF 3 코팅은 층 구조의 리튬이 풍부한 삼원산화물 기반 양극재에 대해 상전이를 유도하고 사이클 안정성을 향상시키는 효과도 있다.\r\n 3) 인산염: 3) 인산염\r\n PO43- 그룹과 인산염의 금속 이온 사이의 화학 결합은 강한 공유 결합 특성을 가지므로 양극재 코팅 후 전극과 전해질 사이의 반응을 방해하여 재료의 안정성을 향상시킬 수 있다. 현재 표면 코팅의 인산염 개발에는 주로 FePO4, AlPO4 및 Co3(PO4)2가 포함된다. AlPO4를 코팅 한 결과 양극재에서 전지의 속도 성능, 사이클 성능 및 열 안정성이 향상되었음을 발견했으며, 높은 용량 유지율로 우수한 사이클링 안정성을 나타냈다. 이는 양극재 입자 표면에 CEI(Cathode Electrolyte Interphase) 막이 형성되는 것은 표면 조성과 밀접한 관련이 있으며 형성 과정에서 전기화학적 환경의 영향을 받는다는 점은 주목할 만하다. 음극 재료 표면의 인산염 코팅은 전극/전해질 계면을 안정화할 수 있을 뿐만 아니라 강한 화학적 결합으로 인해 CEI 필름의 형성 및 두께에 영향을 줄 수 있다."
            },
            {
                    "",
                    "PDMS로 코팅된 나노 구조의 표면 구조와 폐수 처리에 대한 응용을 요약하고자 한다. 다양한 나노 입자 위에 얇은 PDMS 층을 형성하기 위해 화학적 증기 증착 방법(CVD)이 활용되어 왔다. 우리는 PDMS 층의 CVD가 높은 화학적 안정성과 이러한 소수성 코팅 방법이 서로 다른 화학적 조성을 가진 다양한 나노 물질에 적용될 수 있다는 사실로 인해 응용 분야에서 유리함을 지님을 알 수 있다.",
                    "나노 물질에 PDMS 층을 코팅하는 방법에는 두 가지가 있다. PDMS와 curing agent를 10:1 비율로 혼합하여 24시간동안 경화시킨 후 경화된 PDMS와 기판(분말)의 작은 조각을 비커에 넣고 바닥을 200-300˚C로 가열한다. PDMS의 일부는 기화되어 나노 물질 표면에 증착되어 소수성의 얇은 층을 형성한다.",
                    "다양한 화학 조성의 분산된 PDMS 코팅된 나노 입자의 표면은 물 접촉각이 160˚보다 높은 초소수성을 나타낸다. 원래 친수성인 SiO2가 물보다 밀도가 높은 나노 입자는 PDMS 코팅 시 완전히 소수성이 될 수 있으므로 PDMS로 코팅된 SiO2 나노 입자는 물 위에 완벽하게 부유할 수 있다.",
                    "다양한 나노 구조에 PDMS 층을 실제로 적용하려면 이러한 PDMS 층의 안정성이 중요한 문제이다. 산성 환경(pH 2.5)에서 Ni 입자에 대한 스테아르산과 PDMS 코팅의 안정성을 비교한 결과, 스테아르산 코팅은 안정적이지 않으므로 산성 매질에 노출되면 스테아르산이 포함된 Ni 입자로 구성된 표면의 초소수성이 사라졌다. 그러나 PDMS 코팅은 안정적이었고 PDMS 코팅 Ni의 초소수성은 산성 조건에서 유지되었다. 강산성 또는 염기성 용액에 노출되었을 때도 물 접촉각은 여전히 160˚보다 높았으며, 이는 PDMS 층이 이후에도 부식 없이 유지됨을 알 수 있다. UV에 노출되었을 때에도 PDMS 코팅으로 구성된 표면의 나노입자는 160˚ 이상의 물 접촉각을 보였지만, 스테아르산은 광촉매 분해에 의해 물 접촉각이 급격하게 감소했다. 또한 PDMS 층은 염소에 대한 내성도 있는 것으로 나타났다.",
                    "PDMS로 코팅된 SiO2 나노 입자는 오일과 물의 불균일 혼합물과 혼합되어 오일과 선택적으로 상호작용하여 오일을 겔화할 수 있다. PDMS로 코팅된 SiO2로 구성된 겔은 수면에서 매우 안정적이므로 PDMS로 코팅된 SiO2와 혼합한 후 오일을 쉽게 제거할 수 있다. PDMS로 코팅퇸 Ni 입자는 물 표면에 완벽하게 부유하며 선택적으로 비극성 유기 용매와 상호작용할 수 있다. 외부 자기장이 가해지면 PDMS로 코팅된 자성 입자와 상호 작용하는 오일이 선택적으로 물에서 제거될 수 있다. 따라서 PDMS 코팅 SiO 혼합물 Ni 입자는 외부 자기장에 의한 효율적인 제거로 물에서 비극성 오염 물질을 제거하는데 사용될 수 있다. 비극성 오염 물질은 용해도가 낮아 물에 잘 용해되지 않아 제거가 어려우므로 PDMS 코팅을 이용한다면 수질 오염에 영향을 끼치는 비극성 오염 물질과 다양한 오염 인자들을 효과적으로 제거할 수 있을 것이다."
            },
            {
                    "",
                    "본 포스터 내용에서는 최근 리튬 이온 배터리의 수요의 증가에 따라 그 중요성을 알아보며 배터리 전극 부식 문제가 배터리 성능에 부정적인 영향을 미치는 것에 대한 원리를 제시하였다. 이를 방지하기 위한 해결 방법으로 전극에 코팅을 하는 것을 제시하였으며 전극을 코팅함으로써 부식 방지뿐만 아니라 전극의 안정성을 향상시켜 배터리의 성능을 향상시킬 수 있다.  이에 대한 방법과 각 방법에 대하여 앞선 연구들에 제시된 여러 재료에 대하여 조사하였다. 이를 토대로  Polydimethylsiloxane(PDMS)을 화학적 증기 증착 방법(CVD)을 이용하여 나노 입자 표면에 코팅되어 소수성 층을 형성할 수 있음을 제시하였다. 이러한 소수성 층은 안정성이 높아 분해에 대한 저항력이 높아 다양한 환경 분야에서 응용 되어 적용될 수 있다. 따라서 이 PDMS 코팅 공정은 물과 오일의 불균일 혼합물에서 오일을 제거하는데 사용할 수 있으며 더 나아가 수질 오염에 영향을 끼치는 비극성 오염 물질과 다양한 오염 인자들을 효과적으로 제거하는데 이용될 수 있을 것이다."
            }
    };

    String[][] references16 = new String[][] {
            {"Pin Du a a , Dongxu Liu a , Xiang Chen a , Hongwei Xie a , Xin Qu,,Research progress towards the corrosion and protection of electrodes in energy-storage batteries volume 57, March 2023, Pages 371-399", ""},
            {"S. Yin, H. Chen, J. Chen, Chemical-mechanical effects in Ni-rich cathode materials, Chem. Mater. 34 (2022) 1509–1523,", ""},
            {"C.F. Lin, A.C. Kozen, M. Noked, ALD protection of Li-metal anode surfaces – quantifying and preventing chemical and electrochemical corrosion in organic solvent, Adv. Mater. 3 (2016), 1600426",""},
            {"S. Zhao, K. Yan, P. Munroe, Construction of hierarchical K 1.39 Mn 3 AlF 3 O 6 spheres via coating for high-performance potassium-ion batteries, Adv. Energy Mater. 9 (2019), 1803757",""},
            {"Y. Zhang, J. Zhang, X. Li, Construction of AlF 3 Na 3.12 Fe 2.44 (P 2 O 7 ) 2 layer to improve interfacial stability for high temperature stable cycling, Chem. Eng. J. 430 (2022), 132708",""}
    };


    /**
     * 논문17
     */
    String title17 = "전기화학법을 통한 폐배터리 내 리튬 폐수의 재활용";
    String[] author17 = new String[]{"송지은", "나현이"};
    String category17 = "Battery";
    String[][] contents17 = new String[][]{
            {"1. 리튬이온배터리 재활용의 중요성"},
            {"2. 전지 제조 과정 중 발생하는 폐액의 재활용",
                    "2-1. 전기투석 수처리 공정",
                    "2-2. 폐액에 작용하는 인가 전압에 따른 전기전도도",
                    "2-3. 희석실과 농축실의 부피비에 따른 전기전도도"},
            {"3. 전지 제조 이후 발생하는 침출수의 재활용",
                    "3-1. LMO 전극와 AC 전극을 이용한 전기화학법",
                    "3-2. 전류의 밀도와 시간에 따른 리튬의 순도",
                    "3-3. 리튬 분리 과정의 반복에 따른 리튬의 순도"},
            {"4. 결론"}
    };
    String[][] text17 = new String[][]{
            {"최근 전기 자동차 산업의 급격한 성장은 리튬이온배터리의 주요 원료인 리튬의 수요량 증가를 야기시켰고, 이에 따라 리튬을 공급하기 위해 해수 등에서 리튬을 추출하기 시작했다. 해수에 존재하는 리튬 이온은 미량이나 육상자원으로부터 회수할 수 있는 총 리튬 양에 비해 많은 매장량을 가지고 있다. 그러나 해수에는 리튬을 제외한 다양한 이온 및 불순물이 있기에 현재 사용되고 있는 습식공정은 유기상을 사용해 이온들을 분리하는 많은 단계를 거쳐야 하기에 환경 오염과 에너지 낭비를 유발한다는 단점이 있다. 해수 외 리튬을 얻을 수 있는 자원은 리튬이온배터리의 제조 및 폐기 공정에서 방출되는 폐수이다. 그렇기에 리튬이온배터리 폐기물에서 배출되는 침출수와 리튬이온배터리 제조 공정에서 발생하는 리튬 함유 공정 폐액은 리튬 추출을 위한 좋은 자원이 될 수 있다."},
            {"",
                    "전기투석 수처리 공정은 이온 교환막과 전기를 이용하여 목표 성분의 농축 및 불순물 분리에 주로 쓰이는 공정으로 폐수 발생을 줄여주고 재사용을 위한 화학적 처리를 하지 않아도 되는 환경친화적 공정이다. 전기투석 제조 공정 중 방출되는 폐수와 금속 이온의 완전한 재사용과 회수가 가능하다. 또한 전기에너지 외의 추가적인 에너지 변환이 요구되지 않아 에너지 효율 측면에서도 긍정적인 평가를 받고 있는 미래지향적 기술이다. ",
                    "리튬 이온 전지의 제조 과정 중 발생하는 폐액을 이용한 실험으로써, 약 500ppm 이하의 리튬이 내포되어 있는 폐액에 작용하는 인가 전압에 따른 전기전도도의 변화를 통해 농축 효율을 확인하였다. 그 결과, 12V까지는 인가 전압이 증가할 수록 더 빠른 시간에 수처리가 종료되었다. 이는 인가 전압이 증가할수록 전기적인 전위차가 크게 발생해 이온의 이동 속도가 빠르기 때문에 전체 수처리 시간이 비교적 빠른 시간에 수행되는 것이다. 그러나 15V에서는 한계 전류 밀도에 의한 분극 현상으로 다량의 물이 형성되어 공정 종료 시에 더 낮은 전기전도도 값이 나타나게 되면서 12V와 비슷한 시간에 종료되는 것을 확인할 수 있었다. 인가 전압에 따른 농축 결과 그래프를 보면 12V조건은 단위 시간당 가장 많은 리튬 및 나트륨의 농축율을 나타내었다. 따라서 본 연구의 전기 투석 수처리 최적 조건은 12V로 공정 소요시간 및 물 회수율과 평균 유량이 높아 수처리에 더 용이한 것으로 사료된다.",
                    "이후, 12V의 조건을 이용하여 희석실과 농축실의 부피비 조절에 따른 리튬 농축의 적정 조건을 확인하고자 부피비에 따른 전기전도도의 변화를 측정하였다. 그 결과, 1/4:1의 부피비가 가장 높은 전도도를 보여주며, 이는 상대적으로 많은 부피를 가진 희석실 이온이 적은 부피의 농축실로 농축되어 나타나게 되는 결과이다. 부피비에 따른 농축 결과 그래프를 보면 1/4:1 조건이 가장 많은 리튬 및 나트륨의 농축율을 나타내었다. 또한 이러한 조건하에서 수행할 시 초기 용액 대비 128% 용액의 농도가 증가한 리튬의 농축이 가능할 것으로 사료된다."
            },
            {"",
                    "리튬 이온 배터리 폐기 시 배출되는 침출수에서 리튬을 분리하기 위해 리튬망간산화물(LMO) 전극을 활성전극으로 사용하고 AC 전극을 상대전극으로 사용하여 전류를 흘렸다. 시간과 잔류 세기에 따른 침출수로부터 리튬 회수량과 선택도를 측정하였으며 이는 기존의 습식 제련 방식보다 우수함을 보였다.",
                    "리튬 이온 배터리 폐기시 방출되는 침출수로부터 리튬을 분리하는 연구를 진행하였다. 이때 LMO 전극을 활성전극으로, AC 전극을 상대전극으로 사용하여 전류를 흘려 전류의 밀도와 시간에 따른 리튬 분리 정도를 측정하였다. 전류 밀도 0.1, 0.15, 0.2 A/g가 사용되었을 때 각각 전류 밀도의 리튬 복구율은 2.76, 2.86, 3.51mmol/g이었고, 복구된 리튬의 순도는 각각 61.5, 66.1, 70.0%을 기록하였다. 또한 각 전류 밀도 별 에너지 사용량은 8.46, 10.3, 13.6 kJ/mol이라는 결과를 얻었다. 따라서, 리튬 복구율과 순도가 가장 높은 0.2 A/g의 에너지 사용량은 다른 값들과 비교했을 때 크지 않으므로 세 조건을 고려했을 때 0.2 A/g의 전류 밀도에서 가장 높은 리튬 복구율과 순도를 얻을 수 있을 것으로 예상된다.",
                    "리튬의 선택도와 순도를 높이기 위해서 리튬 분리 과정을 여러번 반복한 후, 리튬 추출 정도를 확인하였다. 리튬 폐액의 첫번째 리튬 흡착을 진행한 후 배출된 잔여 폐액으로 동일한 조건 하에서 두번째 리튬 흡착을 진행하였고, 첫번째 흡착과정과 비교했을 때 두번째에서 리튬 선택도가 10배, 순도가 90.4%로 눈에 띄게 증가하였음을 관찰하였다. 본 결과를 입증하기 위해 100배 희석한 리튬 폐액을 0.1A/g의 전류밀도에서 30분 동안 분리과정을 진행하였고, 희석하지 않은 폐액보다 리튬 선택도와 순도가 높아지는 것을 확인하였다. 따라서, 첫번째 과정에서 배출된 잔여 폐액으로 리튬을 분리한 두번째 리튬 분리 과정에서 더 높은 리튬 선택도와 순도를 나타내었다. 또한, 100배 희석한 리튬 폐액이 희석하지 않은 폐액보다 분리과정에서 더 높은 리튬 선택도와 순도를 나타내었기 때문에 리튬의 농도가 낮을수록 리튬의 회수율이 높을 것으로 사료된다."
            },
            {"리튬 폐수의 재활용과 관련된 두 연구의 실험 결과를 통해 리튬이온전지를 제조하는 과정에서 발생하는 폐액과 제조한 이후 발생하는 침출수 모두에서 리튬을 가장 높은 효율로 회수할 수 있는 최적의 조건을 각각 확인할 수 있었다. 이에 대한 연구가 더 다양한 조건에서 심화적으로 진행된다면 친환경적이고 에너지 효율 측면에서도 장점을 갖는 미래지향적인 폐배터리 재활용 기술을 발견할 수 있게 될 것이다."}
    };
    String[][] references17 = new String[][] {
            {"[국내] 한덕현, 장항철, 김보람, 김대원. (2020). “리튬이차전지 제조 공정으로부터 발생한 리튬 폐액의 재활용을 위한 전기 투석 수처리 장치의 리튬 농축 효율에 관한 연구”, 한국수처리학회, 28(3), pp.3-10.", ""},
            {"[국문 박사] 장윤재. (2022). “흡착법과 전기화학법을 이용한 폐수에서의 리튬 회수 연구”, 박사학위 논문, 서울대학교, 서울, 대한민국, pp.96-133.", ""},
    };





    /**
     * 논문18
     */
    String title18 = "하이니켈 양극재의 성능 향상을 위한 연구";
    String[] author18 = new String[]{"이현수", "오승연"};
    String category18 = "Battery";
    String[][] contents18 = new String[][]{
            {"1. 서론"},
            {"2. 금속 코팅을 통한 전기화학적 성능 향상", "2-1. Cation Mixing", "2-2. 금속 코팅"},
            {"3. 단결정 양극재 건식 합성법을 통한 전기화학적 성능 향상", "3-1. Intergranular Crack", "3-2. 단결정 양극재 건식 합성법"},
            {"4. 결론"}
    };
    String[][] text18 = new String[][]{
            {"전기자동차용 고에너지 이차전지의 개발 필요성이 대두되고 Co 원자재 가격이 상승함에 따라, 기존의 LCO(LCO2) 양극재에서 Co를 80% 이상의 Ni가 포함된 전이금속들로 치환한 하이니켈 양극재가 각광받고 있으며, 이를 하이니켈 양극재라고 한다. NCM(LiNiCoMnO2)이나 NCA(LiNiCoAlO2) 양극재의 Ni 함량을 높일 경우 해당 양극재를 사용한 리튬 이온 배터리의 가격 경쟁력과 에너지 밀도가 높다는 장점이 있다. 그러나 Ni의 함량을 높일수록 몇 가지 단점이 존재하는데, 본 보고서에서는 하이니켈 양극재의 단점과 이러한 문제 해결 및 리튬 이온 배터리(LIB)의 전기화학적 성능 향상을 위한 연구 동향에 대해 알아보고자 한다. "},
            {"",
                    "LiMO2(M=Ni, Co, Mn, Al)은 Li, M, O가 rock salt 구조의 [111] 면을 따라 리튬층과 금속산화물층을 교대로 이루며 배열된 층상 구조의 양극활물질이다. 여기서 Ni 함량을 증가시킴에 따라 Ni3+로부터 더 안정한 Ni2+로의 전환이 일어나는데, 이 Ni2+(0.69 Å)는 이온 반경이 Li+(0.76 Å)와 유사하여 LIB의 Li+ 탈리 과정에서 리튬층으로 이동하여 Li+ 자리에 위치하게 된다. 즉 비양론적인 Li1-xNi1+xO2가 합성되며, 이는 Li+의 이동을 방해하고 율속 특성 등의 전기화학적 성능의 저하를 야기한다. 또한 delithiation된 양극재의 구조 안정성을 높여 전지 내 리튬 사용량을 높이게 된다. 만약 양극재가 대기 중 수분 또는 이산화탄소에 노출될 경우에는 양극재 표면에 잔류 리튬 화합물이 생성된다. \r\n" +
                            "잔류 리튬 화합물의 OH-는 전극 슬러리 제조 시 바인더로 사용되는 PVDF(polyvinylidene fluoride)의 defluorination 및 C=C 이중 결합 형성을 일으키며, 이렇게 형성된 hydroxyl group과 carbonyl group은 슬러리 내에서 강력한 응고제로 작용하여 슬러리의 gelation을 야기한다. 이는 전극 제조 공정에서 표면을 고르지 않게 하여 실제 생산 설비에서 불량을 유발하는 주요 요인 중 하나이다. 한편 잔류 리튬 화합물은 충/방전 사이클에서 전기화학적으로 분해되어 가스를 발생시켜 전지 팽창, 화재, 폭발 위험으로 이어지게 한다. \r\n" +
                            "따라서 하이니켈 양극재의 문제에 대한 근본적인 해결책은 Ni2+의 생성을 억제하고 생성된 Ni2+를 Ni3+로 다시 전환하여 양극재 표면의 잔류 리튬 화합물을 제거하는 것이라고 할 수 있다. 다만 Ni2+가 형성되는 층은 표면으로부터 약 30 nm 이내로, 주로 사용되는 방법인 금속 양이온 도핑 방법은 소성 과정 중 표면의 양극재 2차 입자 내부까지 침투할 가능성이 있고, 잔류 리튬 화합물 제거는 가능하지만 Ni2+에는 영향을 미치기 어렵다. 또한 충/방전 사이클이 계속됨에 따라 전극과 전해질 간 계면의 부반응 증가로 인한 효율 저하의 문제도 있어 코팅을 통해 계면의 직접적인 접촉을 줄일 필요가 있다. 다음 내용에서는 공침법을 통해 양극활물질을 합성한 후 금속 양이온을 코팅하는 연구 동향에 대해 알아보고자 한다. ",
                    "금속 코팅은 양극재와 solid solution을 형성할 수 있는 적절한 금속을 코팅하고, 양극재와 코팅층 사이의 원소가 상호 확산하게 하여 표면 재구성에 의한 Ni2+에서 Ni3+로의 전환 효과와 잔류 리튬 저감을 모두 기대해 볼 수 있는 방법이다. 한 연구에서는 자기 모멘트 관점에서 superexchange coupling을 평가함으로써 최종 코팅 금속 원소를 선정하였는데, 이때 superexchange란 이웃하는 자성 양이온(Mn+) 사이의 비자성 음이온(O2-)이 전자를 교환함으로써 일어나는 간접적인 상호작용을 말한다. 이 상호작용은 주로 반강자성을 나타내며, 이때 결합한 자기 모멘트는 특정 온도 범위에서 반대로 정렬된다. 이때 강도는 세 이온의 결합 각도에 크게 의존하는데, 180° superexchange는 비공유 전자쌍이 있는 두 개의 자성 양이온으로 인해 반강자성 상호작용을 나타내는 반면 90° superexchange는 비공유 전자쌍이 없는 1~2개의 비자성 양이온을 포함하여 상대적으로 약한 강자성 상호작용을 나타낸다. \r\n" +
                            "하이니켈 양극재의 Ni2+-O2--Ni3+에서는 O2-가 cation mixing에 의해 리튬층에 존재하는 Ni2+, 금속층에 존재하는 Ni3+와 강한 σ결합을 형성하며 180°의 강한 superexchange를 보이는데, 이는 리튬층의 Ni2+에 큰 안정성을 제공한다. 따라서 금속을 코팅하는 데 있어 고려해야 할 중요한 점은 표면에서의 상호 확산을 통해 금속층의 Ni3+를 비자성의 금속 양이온으로 대체(Ni2+-O2--Mn+)함으로써 90° superexchange로 전환하고, 리튬층의 Ni2+의 안정성을 없애 금속층으로의 이동을 선호하게 하는 것이다. \r\n" +
                            "코팅에 주로 사용되는 금속 중 Al3+([Ne] 3s2 3p1)는 d 오비탈에 전자가 없어 90° superexchange를 형성하고, Ni2+를 리튬층에서 금속층으로 이동하게 한다. 반대로 Fe3+는 d 오비탈에 전자가 있으며, cation mixing energy 측정 결과(ΔEmix<0)를 볼 때 cation mixing이 더 선호되어 코팅 금속으로 적절하지 않을 것으로 예상되었다. Co3+([Ar] 3d7 4s2)의 경우 비공유 전자쌍이 없어 90° superexchange를 형성하고, 따라서 Ni2+를 리튬층에서 금속층으로 이동하게 한다. Ti4+의 경우 d 오비탈에 전자가 없어 90° superexchange를 형성하지만, 산화수 관점에서 봤을 때 전이금속층의 평균 산화수가 3+이기 때문에 Ti4+ 코팅 시 전하 중성을 유지하기 위해 Ni3+에서 Ni2+로의 전환이 발생할 우려가 있으며 코팅 금속으로는 적절하지 않을 것으로 예상되었다. \r\n" +
                            "30℃, C/10, 3.0-4.35 V에서 coin half cell의 전기화학적 성능을 평가한 결과, 아무 금속도 코팅하지 않은 NCM 양극재와 Al, Fe, Co, Ti를 코팅한 NCM 양극재의 초기 방전 용량은 각각 226, 215, 224, 225, 198 mAh/g로 나타났으며, Al, Ti 코팅 시 낮은 초기 방전 용량을 보이는 원인은 코팅 후 이동이 방해된 Li+에 의한 polarization으로 추측된다. 이후 C/2로 변경하여 사이클 성능을 측정한 결과, 100 사이클에서 Al, Co를 코팅한 NCM 양극재가 더 좋은 capacity retention을 보였다. 하지만 Fe, Ti 코팅 시에는 더 안 좋은 사이클 성능을 보였는데, 그 원인은 코팅층이 전해액-잔여 리튬 화합물의 부반응에 참여하게 된 것으로 추측된다. 위 결과를 종합해 보았을 떄 Co를 가장 좋은 코팅 금속으로 추론해 볼 수 있으며, coin full cell set-up으로 변경하여 아무 금속도 코팅하지 않은 NCM 양극재와 Co를 코팅한 NCM 양극재의 300 사이클까지의 전기화학적 성능을 평가한 결과 Co를 코팅한 NCM 양극재의 방전 용량과 사이클 성능이 훨씬 높게 나타났고, 효과적인 양극재 표면 재구성과 rock salt 상 및 잔여 리튬 화합물의 저감을 확인할 수 있었다. "
            },
            {"",
                    "NCM 양극재는 전이금속들의 균일한 분산을 위해 공침법을 통해 합성되며 입자의 성장을 위해서는 전구체와 리튬의 고온 열처리가 필수적으로 요구된다. 이때 nm 수준의 작은 일차 입자들이 모여 µm 수준의 이차입자를 이루는 형태가 된다. 이렇게 합성된 NCM 양극재에서는 충전 말단에 H2에서 H3 구조로의 상변화를 겪게 되는데, Ni 함량이 변하면 a축 lattice의 변화는 비슷하지만, Ni 함량이 증가할수록 c축 lattice는 크게 감소한다. 그 결과, 일차 입자의 grain boundary를 따라 발생하는 intergranular crack이 발생한다. 부피 변화로 인한 기계적인 요인 이외에도 입자 내부에서 발생하는 반응에 의해 crack이 발생하기도 한다. 입자 내부에 crack이 전파되면, 새로운 표면이 전해액에 노출되어 입자 간 전자 전달이 어려워진다. 이에 따라, 전이금속 중 Ni 함량이 증가할수록 용량 유지율이 감소하게 된다. \r\n" +
                            "또한 Ni의 함량이 높은 경우에는 층상구조 합성을 위해 낮은 온도가 요구되고, 고온 열처리 시 비가역상인 rock salt 상이 합성되는 문제가 발생한다. 그리고 다량의 폐용액을 발생시키는 환경 문제, 복잡한 공정 및 설치 비용 등의 문제가 있어 공침법을 활용하지 않고 단결정 소재를 합성하는 방법을 모색하였다. ",
                    "양이온 혼합과 이방성 부피 변화로 인한 crack 문제로 발생하는 용량 유지율 감소 문제를 해결하기 위한 방법으로 단결정 합성법에 대한 연구가 수행되고 있다. 단결정 양극재 합성법은 이차 입자의 형태를 하나의 단결정으로 변형시켜 단결정 양극재를 합성하는 방법이다. 다결정에서 단결정으로의 형태 변화는 전극 합성 시 높은 압연을 통해 내부 공극을 줄일 수 있고, 단위체적당 높은 에너지 밀도 구현이 가능하게 한다. \r\n" +
                            "해당 연구에서는 각 전구체로서 전이금속 산화물만을 이용하였으며, 이후 가압하여 열처리하는 방법으로 단결정 NCM 양극재를 합성하였다. 전이금속 산화물과 리튬 원료의 입자 간 상호 확산을 높이기 위해 미분화하였으며, 이 원료를 혼합 후 가압하여 펠릿을 얻었다. 기존 공침법을 통해 얻은 전구체로 단결정을 합성할 경우 1,000℃ 이상의 온도가 요구되지만, 위의 방식으로 진행하여 880℃의 낮은 온도에서 입자 성장을 진행할 수 있었다. NCM은 고온 열처리 시 rock salt 구조를 형성할 수 있으므로 880℃에서는 3 h 동안만 소결하였고, 이후 안정적인 층상구조를 위해 810℃에서 15 h 동안 열처리하였다. 또한, 리튬의 충분한 용융을 위해 수산화리튬과 탄산리튬의 사전 열처리를 진행하였으며, Ball-miling을 통해 단결정 소재를 확보하였다. 수산화리튬을 사용하여 합성된 단결정은 H-SNCM, 탄산리튬을 사용해 합성된 단결정은 C-SNCM으로 명명하였다.\r\n" +
                            "XRD 구조 분석 결과, 위 과정을 통해 단결정 소재는 잘 배열된 상으로 합성되었음을 확인할 수 있었다. 그런데 37~39°에서 H-SNCM과 C-SNCM는 비슷한 개형의 그래프를 나타내는 반면 64~65.5°에서 C-SNCM 이 H-SNCM보다 peak의 분리가 뚜렷하게 나타나는데, 이는 C-SNCM이 H-SNCM보다 결정성이 우수함을 나타낸다. 또한 단결정 소재의 리트벨트 해석 결과에서는 Li slab에 존재하는 Ni2+의 양은 C-SNCM이 H-SNCM보다 더 낮음을 확인할 수 있고, 이는 같은 온도 조건에서 열처리하였을 때 C-SNCM의 cation mixing이 더 억제되었음을 나타낸다. \r\n" +
                            "Half cell 조립 후 3.0-4.3 V에서 전기화학적 성능 평가를 진행한 결과, H-SNCM은 189.8 mAh/g의 방전 용량과 86.5%의 초기 효율을 나타냈다. 반면 C-SNCM은 191.1 mAh/g의 방전 용량과 85.7% 초기 효율을 나타냈다. 이는 H-SNCM과 C-SNCM이 동일 온도 조건에서 비슷한 결정 구조를 나타냈기 때문이다. 또한 1C 조건에서 H-SNCM과 C-SNCM의 capacity retention 및 coulomb efficiency 측정한 결과, H-SCNM 은 50 사이클 후 82.7%의 capacity retention을, C-SNCM은 93.6%의 capacity retention을 나타냈다. 이는 C-SNCM이 안정적으로 충/방전을 진행했음을 의미한다. "
            }
    };
    String[][] references18 = new String[][] {
            {"김민성, 고민성 (2022). “리튬 원료에 따른 리튬이온전지 Ni-rich 단결정 양극재 건식합성법 연구”, 한국전지학회지, 2(1), pp.32-37.", ""},
            {"김민정, 홍순현, 전형권, 구자훈, 이희상, 최규석, 김천중 (2022). “공침법을 통하여 합성된 코어-쉘 구조를 가지는 하이 니켈 양극 소재 안정화”, 한국재료학회지, 32(4), pp.216-221.",""},
            {"빈민욱, 나범탁, 홍태은, 김영진 (2022). “층상계 하이니켈 양극재의 잔류 리튬 생성 및 저감 메커니즘 연구”, 산업기술연구, 42(1), pp.7-12.",""},
            {"정성훈, 홍미화, 김혜준, 박유원, 문준영 (2023). “고성능 이차전지 양극 소재의 연구 동향 및 전망”, 공업화학 전망, 26(1), pp.3-14.",""},
            {"Chakraborty, A. et al. (2020). “Layered Cathode Materials for Lithium-Ion Batteries: Review of", ""},
            {"Computational Studies on LiNi1-x-yCoxMnyO2 and LiNi1-x-yCoxAlyO2”, Chemistry of Materials, 32(3), pp.915-952.",""}
    };


    /**
     * 논문19
     */
    String title19 = "배터리 산업 핵심 소재와 기술";
    String[] author19 = new String[]{"박소현", "홍연서"};
    String category19 = "Battery";
    String[][] contents19 = new String[][]{
            {"1. 서론"},
            {"2. 차세대 배터리 소재와 문제점",
                    "2-1. 차세대 양극재와 문제점",
                    "2-2. 차세대 음극재와 문제점",
                    "2-3. 차세대 전해질"},
            {"3. 하이니켈 양극재",
                    "3-1. 농도구배형(코어쉘 구조)",
                    "3-2. 도핑",
                    "3-3. 코팅"},
            {"4. 실리콘 음극재",
                    "4-1. 실리콘 소재의 나노화",
                    "4-2. 실리콘 산화물 및 실리콘-탄소 복합체"},
            {"5. 수계아연 이차전지",
                    "5-1. 전해질의 pH에 따른 충방전 메커니즘",
                    "5-2. 전해질의 pH에 따른 덴드라이트 형성",
                    "5-3 수계아연 이차전지에서 약산성 전해질을 쓰는 이유"},
            {"6. 결론"}
    };
    String[][] text19 = new String[][]{
            {"본 글에서는 전기차 및 에너지 저장 시스템(ESS)의 수요 증가에 따라 기존 보다 더 높은 용량과 긴 수명, 높은 안정성을 가진 배터리 소재 개발 연구에 대해 다룬다. 고용량 배터리 제작을 위한 양극재와 음극재에 대한 최근 연구 동향을 살펴보고, 이러한 연구에서 발생하는 안정성과 관련된 주요 문제점에 대한 해결방안을 탐구한다. 양극재와 음극재의 특성, 안정성 개선을 위한 현황, 그리고 미래 대응 전략에 대한 종합적인 분석을 통해 배터리 기술의 발전에 기여하고자 한다.\n"
                    + "\n" +
                    "또한 최근에 수계 아연이차전지에 대한 연구가 활발히 이루어지고 있음을 확인하고, 특히 약산성 전해질과 알칼리성 전해질의 사용에 따른 작동 메커니즘 및 덴드라이트 형성에 대한 차이를 알아보았다. 본 내용에서는 전해질 pH의 변화에 따른 안전성과 효율성에 주목하여 수계 아연이차전지에서 주로 약산성 전해질을 사용하는 이유를 확인하였다.이러한 연구를 통해 미래 수계 아연이차전지에서 덴드라이트 형성, 부반응, 부식과 같은 문제를 해결하기 위해 다양한 연구의 필요성을 제시하고 있으며 이는 리튬이온이차전지의 대체물로서 수소 이차전지 기술의 발전에 기여할 수 있는 가능성을 시사하고 있다."},
            {
                    "",
                    "리튬 이온 전지는 다양한 전자기기에서의 에너지 저장을 위해 사용되며, 전기차 상용화를 위한 핵심기술이 될 것으로 기대된다. 전기차 주행거리 향상을 위한 고에너지 밀도 리튬 이온 전지의 개발에서 양극 활물질은 매우 중요하다. 현재, 층상구조의 LiCoO2는 상용화된 리튬 이온 배터리에 가장 흔하게 사용되는 양극 물질이다. 하지만, LiCoO2의 우수한 성능에도 불구하고 대체 양극 물질 개발의 필요성이 대두되었다. 그 중에서 하이니켈계 층상 구조의 LiNixCoyMnzO2는 높은 방전 용량과 합리적인 가격으로 주목을 받고 있다. 그러나, 니켈 기반의 산화물계 양극 소재의 상업적 적용은 다음과 같은 문제점으로 인해 방해받고 있다. (i)일반적으로 코발트와 망간은 삼원계 전이금속 산화물 양극 소재에서 구조적 안정성과 관련이 있는데, 니켈 함량의 증가로 인한 코발트와 망간 함량의 감소는 구조적 안정성의 저하로 이어진다. (ii)탈리튬화 상태에서 형성된 Ni4+는 매우 반응성이 커서 유기물인 전해질과의 부반응을 일으키는데, 이는 전극 물질과 전해질을 모두 소비한다. 게다가 불안정한 Ni4+는 안정한 Ni2+로 전환되고자 하는 경향이 있는데, 이는 산화물계 양극 소재에서 방출된 산소를 통해 낮은 전도성의 Ni-O상을 생성한다. (iii)하이니켈계 양극 소재는 급격한 수분 및 CO2흡착으로 인해 입자 표면에 LiOH, Li2CO3와 같은 리튬 잔류물을 형성한다. 이러한 불순물 상은 전지에서 리튬이온의 확산을 발생한다. 하이니켈계 층상구조 산화물 양극 소재의 심각한 열화 문제를 해결하기 위해, 이온 치환법, 농도구배형 입자 설계 등의 다양한 전략이 보고되고 있다.",
                    "음극재는 양극에서 나온 리튬이온을 저장, 방출함으로써 전기를 발생시키는 역할을 한다. 음극재에는 오래전부터 흑연이 주로 쓰이고 있다. 흑연은 규칙적인 층상 구조를 가지고 있어 리튬 이온이 사이사이에 들어와 저장될 수 있기 때문이다. 하지만 배터리의 성능과 용량이 증가함에 따라 더 빠르게 충전이 가능한 차세대 음극재에 대한 니즈가 커지고 있다. 흑연의 뒤를 이을 소재로 꼽히는 것은 실리콘이다. 흑연은 탄소 6개당 리튬이온 1개를 저장하는 반면, 실리콘은 실리콘 원자 1개당 리튬이온 4.4개를 저장한다. 흑연 음극재에 비해 실리콘 음극재가 g당 용량이 4배 이상 높다. 에너지 밀도를 획기적으로 향상시켜 전기차의 주행거리를 늘리는 것은 물론 배터리의 급속 충전 설계에도 유리하다. 게다가 실리콘은 경제적이면서도 친환경적인 소재이기 때문에 더더욱 차세대 음극재로 주목받고 있다. 실리콘 음극재에도 아직 해결해야 할 문제들이 있다. 바로 리튬이온과 반응 중에 생기는 부피 팽창과 이로 인해 쉽게 깨지는 성질이다. 최근에는 이러한 실리콘의 단점을 해결하기 위해 리튬과 반응하는 실리콘 입자의 미세화, 전기전도성 향상 및 부피변화를 억제하기 위한 실리콘-금속 합금, 탄소-실리콘 복합재, 실리콘 산화물계, 실리콘 구조 변형과 더불어 안정한 SEI층의 형성 등 다양한 측면에서 실리콘 음극의 성능을 향상하기 위한 연구가 이루어지고 있다.",
                    "ESS장치는 지속가능한 에너지 시스템의 구축과 운영에 필수적인 역할을 한다. 화석에너지 고갈에 대한 이슈가 커진 만큼 재생에너지의 필요성이 증대되고 있다. 이에 따라 지속가능한 에너지 시스템의 구축과 운영에 있어 ESS(에너지 저장 시스템) 장치가 필수적인 역할을 하며 그 중요성이 부각되고 있다.\n"
            },
            {
                    "양극의 전기화학적 성능은 다공성, 형태 및 구체적으로 노출된 표면과 같은 구조적 특징과 밀접한 관련이 있으며, 이는 섬세한 디자인 조정이 필요하다. 이를 위해서 다양한 도펀트들이 활용되어 구조적 안정성을 높이기 위해 노력하고 있으며, 전해질과의 부반응으로 인한 성능 감소 혹은 표면의 구조적 변화를 해결하기 위해서 다양한 표면처리 방법과 세정 방법이 동원되고 있다. 이와 더불어 셀 설계 측면에서 기재의 양을 줄이고 활물질의 양을 최대화 시켜 리튬이온전지의 용량증대를 위한 다양한 연구가 진행되고 있다.",
                    "대표적으로, 입자 중심부에서 표면으로 갈수록 니켈 함량이 낮아지고, 망간 함량이 높아지는 농도구배형 양극재는 고용량을 발현하는 고니켈계 조성의 중심부를 안정적인 저니켈계 쉘부가 감싸고 있어 고용량과 안정성을 모두 잡을 수 있는 소재이다. 농도 구배형 양극재는 표면 부 니켈 함량이 낮기 때문에 전해액과의 반응성이 적을 뿐만 아니라, 입자 내부에 발생하는 응력을 효과적으로 분산시킬 수 있는 독특한 미세구조를 가지고 있기 때문에 균열 발생 또한 억제할 수 있다. 이러한 농도구배형 양극재는 최근 많은 전기차의 양극재로도 탑재되어 출시되는 등 그 우수성을 인정받고 있다.",
                    "도핑은 전자 및 이온 전도도를 증가시키고 리튬 중에 Ni2+이온의 이동을 제한시켜 cation mixing을 감소시키고 구조적 안정을 유지시킨다. 또한 전이금속 산화물 결합을 강화하여 산소 방출을 억제하고, cycling 중 상 변화에 영향을 준다. 현재 차세대 양극 물질로 각광받고 있는 Ni-rich cathode 물질에 가장 많이 쓰이는 도핑 물질로는 Al, Zr, Mg, Ti, B, F, W, Mo, Ga, Vb, Ca, 등이 있다. 도핑 원소는 전기화학적인 비활성, 높은 극성, 큰 이온반경을 가지며, 산소와 강한 결합력을 갖고 있다.",
                    "코팅은 high Ni NCM의 내부 구조 안정화보다 인터페이스 성능에 영향을 미친다. 표면 코팅/ 변형은 양극 활물질이 전해액과 직접 접촉하는 것을 방지하고 전해액의 분해나 산화를 방지할 수 있다. 코팅은 전극의 수명과 용량 유지율을 향상시키고, high Ni NCM의 열 방출을 줄일 수 있다. 특히, 코팅 재료, 크기, 두께, 균일성, 밀도 및 전도성 등과 같은 코팅의 물리적 매개변수는 양극 활물질의 전기화학적 반응에 상당한 영향을 미친다. High Ni NCM에 일반적으로 사용되는 코팅 재료는 금속 산화물 (Al2O3, ZrO2, TiO2, B2O3, MoO3, Wo3)이며, phosphates, fluoride 및 전도성 폴리머이다. 코팅 물질은 셀의 공정 능력, 저장 수명 및 전기화학적 성능을 향상시키는 고체상 소결 처리를 통해 잔류 리튬을 전도성 및 보호 나노 층으로 변환할 수 있다."
            },
            {
                    "",
                    "실리콘의 팽창 및 수축, 그로 인한 파괴 등의 기계적 열화가 발생하는 문제를 해결하기 위해 많은 시도가 진행됐으며, 현재는 실리콘 소재의 나노화를 통해 이러한 문제를 해결하고 있으나, 단순한 실리콘 나노 분말화는 바인더 및 도전재의 과량 필요, 전극 코팅양의 한계 및 제조 공정성 확보의 어려움의 문제가 있어, 현재는 다른 성분과 나노 규모의 복합화를 통해 실용적인 적용 단계에 진입하고 있다. 현재 적용되고 있는 대표적인 실리콘계 나노 복합화 소재는 크게, 실리콘 산화물(SiOx), 실리콘-카본 복합체(Si/C), 그리고 실리콘 합금(Si alloy)의 3가지로 분류할 수 있으며, 각각 장단점을 가지고 있으나, 현재는 실리콘 산화물계 소재가 비교적 안정적으로 적용되고 있고, 낮은 초기효율 단점 문제로 인해 다른 방향성으로 실리콘-카본 복합체 소재의 적용도 활발히 진행 중이다. ",
                    "현재 주로 적용되고 있는 실리콘 산화물은 실리콘(Si)과 실리콘 산화물(SiOx)상이 나노구조로 복합화되어 있는 미세구조를 갖고 있으며, 1,000~1,500mAh/g의 가역 용량 수준을 보여주고 있다. 하지만, 낮은 초기 효율(충전 시 Li-Si-O의 비갸역 상 형성)로 인해 에너지밀도 상승에 한계성을 보이며, 여전히 부피팽창 및 그로 인한 기계적, 전기적 열화 문제로 인해 극판 내 함량에 제한을 받고 있다. \n" +
                            "실리콘-탄소 복합체(Si/C)의 경우, 실리콘 산화물 대비 높은 초기 효율(>90%) 및 고용량 구현이 가능한 소재로 평가되어 실리콘 산화물과 동시에 많은 소재 업체에서 활발히 개발하고 있다. \n" +
                            "현재로선 실리콘 산화물 소재가 비교적 안정적인 전지 성능을 보여, 많은 양은 아니지만 소량 실제 상용 전지에 투입되고 있다. 하지만, 실리콘 산화물의 단점인 낮은 초기효율의 문제점을 해결하고자 하는 연구개발이 실리콘 소재개발의 한 부분으로 진행되고 있다. 이를 위해 소재 및 극판 차원에서 각각 개선 노력이 진행되고 있는데, 소재 차원에서는 molten lithium 또는 리튬 착화 환원제와 반응시켜 비가역상을 발생시키는 부분을 사전에 처리하는 방식을 예로 들 수 있으며, 극판 차원에서는 실리콘 극판 제조 시, 극판 내 리튬금속 등을 투입하는 방식, 극판을 리튬 착화 환원제를 포함하는 용액과 반응시키는 방식 등이 있다"
            },
            {
                    "",
                    "아연 음극은 사용하는 전해질의  pH에 따라 상이한 충방전 메커니즘을 나타낸다.  \n" +
                            "<알칼리성 전해질>\n" +
                            "알칼리성 전해질에서는 Zn+이온은 OH-이온과 반응하여 Zn(OH)4 2-를 형성한다. 생성된 Zn(OH)4 2-의 농도가 전해질 내에서 요해 한계를 넘게되면 ZnO가 생성되고 아연 음극 표면에 비가역적인 피막형태로 형성된다. 이러한 피막이 형성된 곳은 더 이상 전자 및 이온 전달이 이루어지지 않아 용량 저하와 함께 전지 성능이 퇴화한다.\n" +
                            "<약산성 전해질>\n" +
                            "약산성 전해질에서는 ZnO가 생성되지 않기 때문에 위의 반응이 억제되어 알칼리성 전해질보다 가역적인 아연의 전착 및 탈착이 가능해진다.\n" +
                            "그러므로 약산성 전해질인 ZnSO4 또는 Zn(CF3SO3)2등의 염을 전해질로 사용하면 알칼리성 전해질을 사용하는 것보다 더 가역적인 아연의 전착과 탈착이 가능해진다.",
                    "수계아연전지의 낮은 수명 특성에 가장 큰 영향을 주는 덴드라이트는 충전과정에서 Zn2+이온의 특정 음극부분에 집중적으로 전착되어 형성되는 결정체로서 전해질의 pH의 따라 다른 형태를 띤다.\n" +
                            "초기 충전과정에서 아연 음극 표면으로 불균등한 아연이온의 전착으로 인해 작은 돌출부가 생성되면 전기장이 집중되고 아연이온의 전착이 가속화 되는  “tip effect” 현상 발생하며 덴트라이트가 형성된다. 이어지는 내용은 전해질의 pH에 따른 다른 형태의 덴드라이트 형성을 보여주고 있다.\n" +
                            "<알칼리성 전해질>\n" +
                            "불안정한 Zn(OH)4 2- 생성 및 아연음극의 급격한 부식으로 인해 잔가지가 있는 원뿔 모양의 덴드라이트를 형성한다.\n" +
                            "<약산성 전해질>\n" +
                            "Zn2+이온의 확산 거동이 알칼리성 전해질과 다르게 나타나기 때문에 잔가지 형성이 없는 2D구조의 육각형 아연 덴드라이트가 관찰된다. \n" +
                            "이처럼 덴드라이트가 형성되는 것은 전극 간의 단락을 유발할 수 있다. 충전 및 방전 주기 동안 금속이온이 축적되어 나뭇가지 모양의 덴드라이트가 성장하면, 덴드라이트가 전지의 양극과 음극을 연결하여 전지 내부에서 단락이 발생할 수 있고 이것은 전지의 안정성을 저해할 수 있으며 전지의 내부구조의 손상을 줄 수 있다.",
                    "<약산성 전해질의 안정성>\n" +
                            "약산성 전해질에서 일반적으로 수계아연전지에서 덴드라이트 형성 및 부식 문제를 줄이는 데 도움이 된다. 또한 더 안전한 환경에서 사용될 수 있으며, 특히 전지가 물리적 충격이나 화학적 요인에 노출 될 때에도 안정성을 유지할 수 있다. 그 이유는 덴드라이트는 충방전 반복에 따라 전지 내부에 쌓이면서 안전문제를 일으킬 수 있는데 약산성 전해질은 충방전 과정에서 덴드라이트 형성을 억제하는 경향이 있다. 약산성 전해질에서 덴드라이트 형성이 억제되는 이유는 주로 양극의 아연 산화과정과 관련이 있다. 약산성 전해질에서는 양극에서 아연이 산화되는 반응에서 수소이온이 충분히 공급되어 안정한 화합물을 형성 할 수 있으며 이로써 축전된 아연이 덴드라이트로 성장하는 경향이 감소한다. 아연이 산화되는 반응에서 수소이온이 충분히 공급되면 안정한 화합물을 형성하는 이유는 산소와 결합하여 안정한 수산화물을 생성하기 때문이다. \n" +
                            "아연의 산화반응식: Zn(s)+2H2O(l)->Zn2+ + 4H2O(l) + 2e-\n" +
                            "아연의 산화는 주로 물과 반응하여 수산화물을 생성하게 된다. 이 반응에서 아연은 물과 반응하여 아연이온(Zn2+)과 수산화물(OH-)을 생성한다. 이때 충분한 양의 수소이온(H+)이온이 존재하면 더 안정한 형태의 수산화물이 안정적인 상태로 남아 있을 수 있다. 수산화물(OH-)은 약한 염기이며, 충분한 양의 수소이온이 존재하는 환경(산성환경)에서 안정적으로 봉쇄될 수 있다. 이러한 안정성은 덴드라이트 형성을 억제하고 전지의 안정성을 향상시킨다. 이와 반대로 수소 이온의 부족 또는 부족한 수산화물의 경우(알칼리성환경) 덴드라이트 형성이 더 쉽게 일어난다.\n" +
                            "결론적으로 충방전과정에서 약산성전해질에서 아연이 산화될 때 부식현상을 현상을 억제하고 덴드라이트 형성 가능성을 줄인다.\n" +
                            "<약산성 전해질 성능>\n" +
                            "보편적으로 알칼리성 전해질을 사용한 전지가 높은 용량을 제공할 수 있다고 알고 있다. 그러나 특정 응용분야에서는 약산성전해질이 더 높은 성능을 보일 수 있는데 그 경우가 수계아연전지이다. 수계아연전지에서는 약산성 전해질이 알칼리성전해질보다 높은 이온전도도를 나타내는데 이는 약산성조건에서 활성물질의 높은 용해도와 빠른 이온 운반성이 전지 내부에서 전기화학적 특성을 향상시키기 때문이다. 이러한 이유로 인해 약산성 전해질은 수계아연전지에서 성능 향상을 가져온다."
            },
            {
                    "세계적인 경쟁 과열 속에서 지속적인 이차전지 시장 장악력을 유지하고 현재의 이차전지의 기술적 한계를 극복하기 위해서는 기존의 리튬이온전지의 에너지밀도, 내구성, 가격 등의 성능을 뛰어넘을 수 있는 차세대 고성능 이차전지 기술개발이 필요하다. 현재 차세대 양극 물질로 확정된 물질이나 기술은 없다. 다양한 아이디어를 바탕으로 차세대 양극물질 연구를 시도하여 상용화 될 수 있는 기술이 개발되어야 한다. 양극재는 구조적 안정성, 전해질과의 부반응으로 인한 성능감소, 표면의 구조적 변화의 문제를 해결하기 위해 노력하고 있다. 실리콘 산화물 및 실리콘-탄소 복합체 등의 음극 소재가 상용화 전지에 적용되기 시작했으나, 적용 함량을 증가시켜 에너지밀도 및 급속 충전 특성을 극대화하기 위해서는 이들 소재의 고질적인 문제, 즉, 부피팽창에 의한 열화 문제를 소재 또는 극판 설계 관점에서 계속해서 개선해야 할 필요가 있다. 덴드라이트는 전해질의 pH에 따라 형성되는 형태가 다르며 수계아연전지의 낮은 수명에 가장 큰 영향을 주는 요인으로 덴드라이트 형성을 억제하는 것이 우리에게 주어진 과제이다 이러한 덴드라이트 형성 및 부반응, 부식의 문제를 해결하기 위해 전해질의 최적화, 음극의 구조화 , 표면 보호막 형성등은 많은 연구가 진행되고 있다. 특히 아연 음극 표면의 보호막 형성 전략은 덴드라이트 부반응을 동시에 억제할 수 있는 합리적인 방법으로 이를 적용해 수계아연전지의 수명 및 성능을 향상시키는 연구들이 많이 발표되었다. 그러나 여전히 리튬이온전지에 비해 낮은 작동전압, 에너지밀도 등의 측면에서 수계아연이차전지가 안전한 ESS 전원으로 사용되기 위해서는 추가적인 연구가 필요하다고 판단된다. 앞으로 더 활발한 연구와 그 성과들이 수계아연이차전지의 상용화를 선도하며, 신재생에너지 보급과 확대에 큰 기여를 할 것으로 기대한다. 이러한 양극, 음극, 전해질, 분리막의 기술이 함께 발전함으로써 배터리 시장을 선도할 것이라 생각된다."
            }
    };
    String[][] references19 = new String[][]{
            {"김찬훈. (2021). “수계아연전지의 덴드라이트 억제를 위한 아연음극의 안정화 방안”\n"
                    + " 한국태양에너지학회 2021년 추계학술발표대회, 광주, 한국태양에너지학회, pp.183", ""},
            {"강지수, 김찬훈, 이정은, 이현수 (2022) “장수명 수계아연이차전지를 위한 아연 금속 \n" +
                    "음극의 안정화 기술”, NICE, 40(4), pp. 412-417.", ""},

            {"김재국, 조정근.(2018) “차세대 이차전지용 아연 이온 이차전지 소재 연구 개발 동향”\n" +
                    " Ceramist, 21(4), pp.312~330", ""},
            {"송준호, 정구진, 박대운. (2022). “고성능 리튬이차전지의 실리콘계 음극소재 기술”, \n" +
                    "KEIR PD issue report, 22(3), pp41-50", ""},
            {"나성민, 박현규, 김선욱, 조혁희, 박광진. (2020). “리튬이온전지(Lithium Ion Battery)\n" +
                    " 양극 물질 연구동향” KIC News, 23(1), pp1-17", ""}
    };


    /**
     * 논문20
     */
    String title20 = "탄소나노섬유를 이용한 리튬 이차전지와 슈퍼커패시터의 성능 강화";
    String [] author20 = {"하현주"};
    String category20 = "Battery";
    String[][] contents20 = new String[][]{
            {"1. 서론"},
            {"2. 이론적 배경",
                    "2-1. 탄소나노섬유",
                    "2-2. 리튬 이차전지",
                    "2-3. 슈퍼커패시터"},
            {"3. 탄소나노섬유 복합소재를 이용한 리튬 이차전지와 슈퍼커패시터의 성능 강화",
                    "3-1. 리튬 이차전지의 성능 강화",
                    "3-2. 슈퍼커패시터의 성능 강화"}
    };

    String[][] text20 = new String[][]{
            {"현대사회에서는 전자기기의 급격한 발전에 따라 휴대형 전자기기, 스마트 기기 및 전기자동차가 빠르게 보급되고, 이와 더불어 경량화, 소형화, 고안정성, 고용량화 및 충전시간 단축 등의 성능 개선이 필요한 새로운 이차 전지의 출현이 요구되었다. 리튬 이차전지는 다른 이차전지에 비하여 환경적으로 안전하며 에너지 밀도가 높아 같은 무게 또는 체적을 기준으로 더 오래 사용할 수 있는 장점을 가지고 있기 때문이다."+"\n"+
            "따라서 리튬 이차전지는 현재 성능이 향상되고 시장이 급속도로 확대되어 시장 규모 면에서 다른 전지들을 제치고 소형전지의 주역이 되었다."+"\n"+
            "이와 더불어 에너지 사용의 증가에 따른 온실가스 배출 증가에 대한 문제로, 온실가스 감축 및 국제환경 규제 대응이 대두되고 있다."+"\n"+
            "화석에너지 고갈, 국제환경 규제 강화로 인해 향후 신재생에너지는 주요 에너지원으로 부상될 것으로 보인다."+"\n"+
            "슈퍼커패시터는 축전기의 역할을 하는 커패시터 중 전기 용량을 초고용량으로 강화한 것으로 신재생에너지 대응을 위한 차세대 고효율, 고용량 에너지 저장 장치이다."+"\n"+
            "Mordor Intelligence(2020년)에 따르면, 세계 슈퍼커패시터 시장은 2020년 887백만 달러에서 연평균 13.5% 성장하여 2026년에는 1,896백만 달러의 시장을 형성할 것으로 전망하였다."+"\n"+
            "전력 밀도가 높고, 충·방전 속도가 빠르며, 충·방전 사이클 수명이 매우 길다는 특성을 가지고 있어 신재생 에너지 발전 및 전기자동차, 스마트 그리드 분야에 가장 적합한 저장 장치로 주목받고 있다."+"\n"+
            " 또한, 4차 산업혁명과 IoT 전자기기의 발전이 눈앞에 다가오면서 보다 다양한 전자 회로와 전원 공급 제품들이 우리의 삶에 다양하게 적용될 수 있어 신재생 에너지 분야에 새로운 에너지 저장장치로 주목받고 있다."
            +
            "\n"+ "이러한 슈퍼커패시터에 탄소나노섬유가 응용될 경우의 성능 향상에 대해서도 살펴보려 한다."},
        {"","탄소 재료는 자연계에 다양한 형태로 존재하며, 분자 간의 결합방식과 구조에 따라 흑연, 다이아몬드, 탄소나노섬유, 탄소나노튜브, 그래핀 등의 탄소 동소체를 가진다."+ "\n"+
        " 그중 탄소나노섬유는 원통형의 그래핀을 이용해 만든 나노 구조물이다. 50-200 nm의 매우 작은 직경을 지녀 비표면적이 크고, 작은 세공을 이용한 흡착특성이 뛰어나 가까운 미래에 다양한 산업분야에서 응용될 것으로 기대된다."+
        "\n"+ "  특히 이차전지나 슈퍼캐패시터의 전극재료, 염료감응형 태양전지 촉매와 같은 에너지 저장 및 변환재료나 센서, 생체재료, 수 처리 필터, 분리막 등 보다 넒은 응용분야로 쓰임이 촉진되어 향후 수요 증가가 예상되고 있다." +
        "\n"+ " 성장된 탄소나노섬유는 sp, sp2, sp3 혼성결합을 하고 있어 화학적 안정성, 높은 전기전도도, 기계적 강도, 높은 비표면적과 함께 고강도, 고탄성, 유연성을 지니고 있다. 탄소나노섬유의 제조 방법에는 전기방전법, 플라즈마 화학기상증착법, 아크방전법, 화학기상증착법 등이 있다."
        + "\n"+ " 그중 화학기상증착법은 소스 가스인 탄화수소가스를 촉매 상에서 고온으로 열분해하여 탄소나노섬유를 제조하는 방식으로,"
        +"\n"+"비교적 빠른 시간 안에 탄소나노섬유를 제조할 수 있으며, 생산단가가 저렴하고 대량으로 합성이 가능하다는 장점이 있다. ",
        "(1) 특징과 작동 원리\n" +
        "리튬 이차전지는 음극, 양극, 전해질, 분리막으로 구성되어 있으며 음극과 양극은 전지 성능을 좌우하는 중요한 구성요소이다. 리튬 이차전지 음극재로 활발히 연구되고 있는 재료인 탄소는 흑연계 탄소 재료와 비 결정성계 탄소 재료로 구분된다. 흑연계 탄소 전극은 탄소의 층상구조가 잘 발달되어 있어 층간에 리튬이 잘 삽입된다. 그러나 충·방전이 진행됨에 따라 이론 용량인 372mAh/g만큼의 에너지를 활용하지 못해 이를 해결하기 위하여 탄소재료의 물성을 개선하려는 연구가 진행중이다. 탄소 재료는 낮은 가격과 긴 수명 등의 장점이 있지만 이론 용량의 한계가 있어 고용량 재료와 복합화하는 연구가 필요하다. 따라서 탄소나노섬유를 이용한 리튬 이차전지의 성능 보완에 대해 살펴보려 한다. 리튬 이차전지의 작동 원리는 충전과정에서 양극이 산화되어 탈리된 리튬이온이 전해질을 통해 음극으로 삽입되고, 이와 반대로 방전과정에서 음극이 산화되며 탈리된 리튬이온이 양극으로 환원되어 삽입된다. 즉, 리튬이온을 가역적으로 흡수‧방출하면서 외부회로를 통해 전자를 흐르게 하여 전기를 발생시킨다. \n" +
        "(2) 양극과 음극\n" +
        "양극재는 충전과정에서 산화되어 리튬이온이 탈리되고 외부 회로를 통해 전자가 방출되며, " +
        "방전과정에서는 외부 회로를 통해 받아드린 전자에 의해 환원되어 리튬 이온이 삽입된다." +
        " 따라서 양극재는 높은 에너지 밀도를 가지고 많은 양의 리튬이온이 삽입 탈리되어야 함과 동시에 리튬이온의 층간 삽 입·탈리 시 부피변화가 적어서 활물질의 구조가 파괴되지 않아야 하며 충· 방전 시 가역성을 가져야한다." +
        " 또한 양극재 자체의 전기전도도가 높아야 하며, 전해질인 유기용매에 대해 용해되지 않도록 화학적 안정성이 높아야 한다. 음극재는 방전 시 자발적으로 산화되는 전극으로 방전과정에서 리튬 이온을 방출하고 충전과정에서 리튬 이온을 저장하게 된다." +
        " 현재 탄소계 물질이 널리 사용되고 있으며, 이러한 탄소계 음극 활물질은 구조적으로 리튬 이온이 탄소 층 사이로 가역적으로 삽입·탈리되어 우수한 사이클 특성과 안 정성을 보인다. 또한 리튬이온과의 반응전위가 낮아 높은 전압을 낼 수 있으며, 전기화학적 특성이 우수하다는 장점을 가지고 있다. " +
        "그러나 탄소 6개 당 1개의 리튬이온이 삽입되는 구조를 가지고 있어 이론 용량이 372 mAh/g으로 용량적인 한계를 가지고 있어 고용량이 요구되는 중대형 전지로 적용하는데 한계가 있다. 따라서 고용량의 리튬이온 이차전지를 개발하기 위해서는 새로운 고용량 음극재료의 개발이 요구된다. 그 해결방법으로 실리콘이 있는데, 실리콘의 경우 높은 이론 용량과 낮은 반응전위를 갖기 때문에 차세대 고용량 음극재료로서 많은 연구가 진행되고 있다. 하지만 리튬이 삽입·탈리되는 과정에서 400% 이상의 부피팽창이 일어나 음극재의 분쇄와 집전체와 접촉저하, 활물 질과 전해질의 분해로 불안정한 계면층의 형성이 전극 수명을 저하시키는 원인이 된다. 이러한 부피팽창과 그에 따른 전극 수명 저하를 해결하기 위해 실리콘과 탄소계 물질을 복합체로 합성하는 연구가 활발하게 진행 중이다." +
        " 리튬이온 삽입 시 생기는 실리콘의 부피팽창을 탄소계 물질의 완충 작용으로 인해 전극 수명 특성 향상에 기인할 것으로 보이기 때문이다." ,
        "(1) 구조와 작동 원리\n" +
        "슈퍼커패시터는 양극과 음극으로 구성되는 다공성 전극, 전해질, 집전체, 분리막 또는 격리막으로 이루어져 있다. 슈퍼커패시터의 원리는 전해질의 이온이 전극 표면에 흡착하고 탈착되는 과정이나 표면화학반응을 통해서 충·방전이 진행된다. 순간적으로 많은 에너지를 저장한 후 높은 전류를 순간적 혹은 연속적으로 공급하는 고출력 동력원이다. 슈퍼커패시터는 전압을 걸면 전하가 빠른 속도로 전극에 달라붙어 충전 시간이 매우 빠르고, 순간적으로 빠르게 방출가능해 출력이 높다는 장점이 있다. 단위 무게당 비표면적을 증가시킨 활성탄소를 전극재료로 사용하여 매우 큰 용량 증가를 가져왔다. 리튬 이온전지의 출력이 1,000~3,000W/kg인 것에 비해 슈퍼커패시터는 10,000W/kg로 높은 출력을 가져 충전 시간을 단축할 수 있다. 내구성이 좋아 충·방전을 50만 회 이상 반복해도 안정되게 동작해 수명이 길다. 그러나 에너지 밀도는 배터리에 비해 낮기 때문에 고밀도화 연구가 필요하다. 고밀도를 달성하기 위해서는 전극 면에 최대한 많은 이온이 흡착해야 하고, 전도성이 높아야 한다. 따라서 고밀도화 연구는 전도성이 높으면서 비표면적, 입자의 단위 질량당 표면적을 의미하는 비표면적(Specific surface area)이 높은 전극 소재 개발에 초점을 두고 있다. 현재는 전극 소재로 주로 활성탄(비표면적 3,000m2/g)을 사용하지만 비표면적을 높이기 위해 탄소나노튜브나 그래핀을 새롭게 사용하고 있다. \n" +
        "(2) 슈퍼커패시터의 종류\n" +
        "슈퍼캐패시터는 작동 메커니즘, 사용되는 전극재료에 따라 세 가지로 나뉜다. 물리적인 전기 이중 층을 이용한 이온의 흡·탈착에 의한 전기 이중층 커패시터(Electric Double Layer Capacitors, EDLCs)와 표면의 화학적인 산화·환원 반응을 이용하는 유사 커패시터 (Pseudo capacitors), 그리고 이 두 가지 메커니즘을 비대칭 전극을 이용해 모두 이용하는 하이브리드 슈퍼커패시터(Hybrid Capacitors)로 구분된다. 전기 이중층 커패시터는 고출력, 반영구적 수명 특성과 같은 장점으로 현재 가장 널리 산업화되어 일상생활에서 이용되고 있다."},
        {"",
        "탄소나노섬유를 리튬이온전지 전극재료로 이용하는 방법 중 첫 번째는 탄소나노섬유 내부에 고용량 전극재료를 복합화하는 방법이다. 전기방사 용액에 금속 및 금속산화물을 형성하는 이온상태의 전구체를 첨가하거나, 고체상태의 금속 및 금속 산화물을 첨가하는 방법이 있다. 대표적인 고 용량 전극재료인 Si는 약 4,200mAh g−1 이라는 매우 높은 이론적 용량을 지니고 있지만, 충·방전시 과도한 부피 팽창 및 수축으로 재료의 열화와 전기적 단락이 발생하여 수명을 단축시킨다. 따라서 Si 나노 입자를 탄소나노섬유 내부에 복합화 시킴으로 인하여 부피 팽창 및 수축율 억제, 전기적 특성 향상, 생산된 전자의 효율적인 이동 등의 장점을 바탕으로 고용량(약 726mAhg−1), 긴 수명, 빠른 속도 에서의 우수한 충·방전 성능을 나타냈다. 최근에는 탄소나노섬유 내부에 Si와 소량의 탄소나노튜브를 동시에 복합화하여 전기적 특성을 향상시켜 리튬 이차전지의 성능을 개선하는 연구도 진행된 바 있다. 또한 탄소나노섬유의 표면에 고용량 전극재료를 복합화하는 방법도 있다. 탄소나노섬유의 높은 비표면적을 이용하여 적은 양의 고용량 전극재료를 효과적으로 이용할 수 있기 때문에 전극 무게에 비하여 고용량 특성을 확보할 수 있다. 게다가 리튬이온과 전극재료 간의 확산거리가 짧아 빠른 속도에서의 충·방전 성능에 강점이 있고, 표면에서 생성된 전자 가 내부에 존재하는 탄소나노섬유를 통해 효율적으로 이 동할 수 있는 이점도 있다. 위와 같이 탄소나노섬유 단독으로는 리튬 이온전지 전극재료가 요구하는 특성을 만족시키지 못하므로 이를 개선하려는 시도가 계속되고 있다."
        ,"슈퍼커패시터는 음극과 양극 모두 비표면적이 높은 탄소재료를 사용하는데, 이는 전극 표면에 많은 전기 이중층을 확보하기 위함이다. 하지만 기존의 탄소나노섬유를 슈퍼커패시터 전극재료로 사용할 경우 낮은 정전용량(약 30Fg−1)을 가지기 때문에 이를 개선하기 위한 기술이 필수적으로 필요하다. 첫 번째로는 탄소나노섬유의 비표면적을 향상시키는 방법이다. 전하를 저장하는 표면적이 극대화되고 세공의 크기가 최적화를 이루게 되면 슈퍼커패시터의 고용량 특성을 확보할 수 있다. 탄소나노섬유의 비표면적을 향상시키기 위해서는 PAN 전구체 용액에 기공형성용 고분자를 첨가하여 방사한 후 탄화하게 되면 첨가된 고분자들이 분해되면서 2 nm 이하의 마이크로 기공이 형성된다. 이렇게 얻어진 다공성 탄소나노섬유는 600~1300m2g−1의 높은 비표면적을 보유함에 따라 향상된 슈퍼커패시터 성능을 나타낸다. 나아가 빠른 속도에서의 충·방전 능력은 2 nm 이상의 메조기공의 분포가 높을수록 우수한 성능을 보이므로 메조기공 분포의 향상에도 많은 관심이 모이고 있다. 탄소나노섬유의 메조기공 분포를 향상시키기 위해서는 금속 또는 금속산화물이 내재된 탄소나노섬유 복합 체에서 열처리를 통한 응집법과 산 에칭공정 등을 이용해 금속 또는 금속산화물을 제거하여 메조기공의 분포를 향상시키는 연구들이 진행되었다. 이렇게 얻어진 메조 다공성 탄소나노섬유는 높은 비표면적(약 1082m2g−1)과 높은 메조기공 분포율(약 35%)을 동시에 나타냈으며, 이는 슈퍼커패시터에서 고용량(약 289.0 Fg−1) 특성 과 빠른 속도에서의 충·방전 능력을 동시에 확보할 수 있다.\n" +
        "두 번째 방법은 질소 혹은 보론 등을 도핑 하는 것이다. 질소를 많이 보유한 전구체를 이용하여 탄소원자와 도핑을 이루게 하여 전기 전도성을 향상시키고, 비표면적의 향상을 동시에 얻을 수 있다. 향상된 전기 전도성은 전기 이중 층에 의하여 생성된 전자를 쉽게 이동시킬 수 있도록 도와주어 고 용량(약 2Fg−1) 특성을 제공한다. 하지만 위와 같은 방법들로 개선된 탄소나노섬유 일지라도 부피에 비하여 낮은 에너지 밀도를 가지는 단점은 앞으로 연구를 통해 보완해야 할 과제이다."}
    };

    String[][] references20 = {
            {"이선미. 리튬이온전지용 Sb 금속간 화합물/탄소나노섬유 복합체 기반 음극제조 및 특성. 석사학위논문, 전남대학교, 광주, 2013. ",""},
            {"안건형, 이태근, 안효진(2015). 탄소나노섬유의 연구도양 및 응용. J. Korean Powder Metall. Inst., Vol. 22, No. 5, 367-375. ",""},
            {"황은정, 2018, 『전기증착법을 이용한 탄소나노복합소재의 합성 및 리튬 이차전지 음극재로서의 전기화학적 특성』, 계명대학교 대학원 석사학위논문",""}
    };






    private List<ThesisDto> thesisList = new ArrayList<>() {{
        add(new ThesisDto(1,category1,title1,author1,contents1,text1,references1));
        add(new ThesisDto(2,category2,title2,author2,contents2,text2,references2));
        add(new ThesisDto(3,category3,title3,author3,contents3,text3,references3));
        add(new ThesisDto(4,category4,title4,author4,contents4,text4,references4));
        add(new ThesisDto(5,category5,title5,author5,contents5,text5,references5));
        add(new ThesisDto(6,category6,title6,author6,contents6,text6,references6));
        add(new ThesisDto(7,category7,title7,author7,contents7,text7,references7));
        add(new ThesisDto(8,category8,title8,author8,contents8,text8,references8));
        add(new ThesisDto(9,category9,title9,author9,contents9,text9,references9));
        add(new ThesisDto(10,category10,title10,author10,contents10,text10,references10));
        add(new ThesisDto(11,category11,title11,author11,contents11,text11,references11));
        add(new ThesisDto(12,category12,title12,author12,contents12,text12,references12));
        add(new ThesisDto(13,category13,title13,author13,contents13,text13,references13));
        add(new ThesisDto(14,category14,title14,author14,contents14,text14,references14));
        add(new ThesisDto(15,category15,title15,author15,contents15,text15,references15));
        add(new ThesisDto(16,category16,title16,author16,contents16,text16,references16));
        add(new ThesisDto(17,category17,title17,author17,contents17,text17,references17));
        add(new ThesisDto(18,category18,title18,author18,contents18,text18,references18));
        add(new ThesisDto(19,category19,title19,author19,contents19,text19,references19));
        add(new ThesisDto(20,category20,title20,author20,contents20,text20,references20));

    }};

    @GetMapping({"/thesis"})
    public List<ThesisDto> showAllThesis() {
        return thesisList;
    }

    @GetMapping("/thesis/category/{category}")
    public List<ThesisDto> showThesisByCategory(@PathVariable("category") String category) throws Exception {

        log.info("cate : {}", category);
        log.info("size : {}", thesisList.size());
        List<ThesisDto> categorizedList = new ArrayList<>();

        for(int i = 0; i < thesisList.size(); i++){
            log.info("thesisList : "+thesisList.get(i));
            if(thesisList.get(i).category.equals(category)){
                log.info(i+"번째");
                categorizedList.add(thesisList.get(i));
            }
        }
        return categorizedList;
    }

    @GetMapping("/thesis/title/{title}")
    public List<ThesisDto> showThesisByTitle(@PathVariable("title") String title) throws Exception {
        List<ThesisDto> titledList = new ArrayList<>();
        for(int i = 0; i < thesisList.size(); i++){
            if(thesisList.get(i).title.contains(title)){
                titledList.add(thesisList.get(i));
            }
        }
        return titledList;
    }
}
