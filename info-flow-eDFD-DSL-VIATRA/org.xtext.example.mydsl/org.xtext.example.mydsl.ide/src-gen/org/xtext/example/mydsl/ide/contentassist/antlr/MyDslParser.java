/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getPriorityAccess().getAlternatives(), "rule__Priority__Alternatives");
					put(grammarAccess.getObjectiveAccess().getAlternatives(), "rule__Objective__Alternatives");
					put(grammarAccess.getLayerAccess().getAlternatives(), "rule__Layer__Alternatives");
					put(grammarAccess.getResponsibilityTypeAccess().getAlternatives(), "rule__ResponsibilityType__Alternatives");
					put(grammarAccess.getChannelAccess().getAlternatives(), "rule__Channel__Alternatives");
					put(grammarAccess.getEDFDAccess().getGroup(), "rule__EDFD__Group__0");
					put(grammarAccess.getEDFDAccess().getGroup_4(), "rule__EDFD__Group_4__0");
					put(grammarAccess.getEDFDAccess().getGroup_4_2(), "rule__EDFD__Group_4_2__0");
					put(grammarAccess.getEDFDAccess().getGroup_5(), "rule__EDFD__Group_5__0");
					put(grammarAccess.getEDFDAccess().getGroup_5_2(), "rule__EDFD__Group_5_2__0");
					put(grammarAccess.getEDFDAccess().getGroup_6(), "rule__EDFD__Group_6__0");
					put(grammarAccess.getEDFDAccess().getGroup_6_3(), "rule__EDFD__Group_6_3__0");
					put(grammarAccess.getTrustZoneAccess().getGroup(), "rule__TrustZone__Group__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_3(), "rule__TrustZone__Group_3__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_3_3(), "rule__TrustZone__Group_3_3__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_4(), "rule__TrustZone__Group_4__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_4_2(), "rule__TrustZone__Group_4_2__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_5(), "rule__TrustZone__Group_5__0");
					put(grammarAccess.getTrustZoneAccess().getGroup_5_2(), "rule__TrustZone__Group_5_2__0");
					put(grammarAccess.getAttackerProfileAccess().getGroup(), "rule__AttackerProfile__Group__0");
					put(grammarAccess.getAttackerProfileAccess().getGroup_3(), "rule__AttackerProfile__Group_3__0");
					put(grammarAccess.getAssetAccess().getGroup(), "rule__Asset__Group__0");
					put(grammarAccess.getAssetAccess().getGroup_3(), "rule__Asset__Group_3__0");
					put(grammarAccess.getAssetAccess().getGroup_3_2(), "rule__Asset__Group_3_2__0");
					put(grammarAccess.getAssetAccess().getGroup_8(), "rule__Asset__Group_8__0");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getProcessAccess().getGroup_4(), "rule__Process__Group_4__0");
					put(grammarAccess.getProcessAccess().getGroup_4_2(), "rule__Process__Group_4_2__0");
					put(grammarAccess.getProcessAccess().getGroup_5(), "rule__Process__Group_5__0");
					put(grammarAccess.getProcessAccess().getGroup_5_2(), "rule__Process__Group_5_2__0");
					put(grammarAccess.getProcessAccess().getGroup_6(), "rule__Process__Group_6__0");
					put(grammarAccess.getProcessAccess().getGroup_6_2(), "rule__Process__Group_6_2__0");
					put(grammarAccess.getProcessAccess().getGroup_7(), "rule__Process__Group_7__0");
					put(grammarAccess.getProcessAccess().getGroup_7_3(), "rule__Process__Group_7_3__0");
					put(grammarAccess.getProcessAccess().getGroup_8(), "rule__Process__Group_8__0");
					put(grammarAccess.getProcessAccess().getGroup_8_3(), "rule__Process__Group_8_3__0");
					put(grammarAccess.getProcessAccess().getGroup_9(), "rule__Process__Group_9__0");
					put(grammarAccess.getResponsibilityAccess().getGroup(), "rule__Responsibility__Group__0");
					put(grammarAccess.getResponsibilityAccess().getGroup_2(), "rule__Responsibility__Group_2__0");
					put(grammarAccess.getResponsibilityAccess().getGroup_2_1(), "rule__Responsibility__Group_2_1__0");
					put(grammarAccess.getResponsibilityAccess().getGroup_2_5(), "rule__Responsibility__Group_2_5__0");
					put(grammarAccess.getExternalEntityAccess().getGroup(), "rule__ExternalEntity__Group__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_4(), "rule__ExternalEntity__Group_4__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_4_2(), "rule__ExternalEntity__Group_4_2__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_5(), "rule__ExternalEntity__Group_5__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_5_2(), "rule__ExternalEntity__Group_5_2__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_6(), "rule__ExternalEntity__Group_6__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_6_3(), "rule__ExternalEntity__Group_6_3__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_7(), "rule__ExternalEntity__Group_7__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_7_3(), "rule__ExternalEntity__Group_7_3__0");
					put(grammarAccess.getExternalEntityAccess().getGroup_8(), "rule__ExternalEntity__Group_8__0");
					put(grammarAccess.getFlowAccess().getGroup(), "rule__Flow__Group__0");
					put(grammarAccess.getFlowAccess().getGroup_3(), "rule__Flow__Group_3__0");
					put(grammarAccess.getFlowAccess().getGroup_4(), "rule__Flow__Group_4__0");
					put(grammarAccess.getFlowAccess().getGroup_4_2(), "rule__Flow__Group_4_2__0");
					put(grammarAccess.getFlowAccess().getGroup_5(), "rule__Flow__Group_5__0");
					put(grammarAccess.getFlowAccess().getGroup_6(), "rule__Flow__Group_6__0");
					put(grammarAccess.getFlowAccess().getGroup_6_2(), "rule__Flow__Group_6_2__0");
					put(grammarAccess.getFlowAccess().getGroup_7(), "rule__Flow__Group_7__0");
					put(grammarAccess.getFlowAccess().getGroup_8(), "rule__Flow__Group_8__0");
					put(grammarAccess.getFlowAccess().getGroup_8_2(), "rule__Flow__Group_8_2__0");
					put(grammarAccess.getDataStoreAccess().getGroup(), "rule__DataStore__Group__0");
					put(grammarAccess.getDataStoreAccess().getGroup_4(), "rule__DataStore__Group_4__0");
					put(grammarAccess.getDataStoreAccess().getGroup_4_2(), "rule__DataStore__Group_4_2__0");
					put(grammarAccess.getDataStoreAccess().getGroup_5(), "rule__DataStore__Group_5__0");
					put(grammarAccess.getDataStoreAccess().getGroup_5_2(), "rule__DataStore__Group_5_2__0");
					put(grammarAccess.getDataStoreAccess().getGroup_6(), "rule__DataStore__Group_6__0");
					put(grammarAccess.getDataStoreAccess().getGroup_6_3(), "rule__DataStore__Group_6_3__0");
					put(grammarAccess.getDataStoreAccess().getGroup_7(), "rule__DataStore__Group_7__0");
					put(grammarAccess.getDataStoreAccess().getGroup_7_3(), "rule__DataStore__Group_7_3__0");
					put(grammarAccess.getDataStoreAccess().getGroup_8(), "rule__DataStore__Group_8__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getAssumptionAccess().getGroup(), "rule__Assumption__Group__0");
					put(grammarAccess.getAssumptionAccess().getGroup_2(), "rule__Assumption__Group_2__0");
					put(grammarAccess.getAssumptionAccess().getGroup_2_1(), "rule__Assumption__Group_2_1__0");
					put(grammarAccess.getAssumptionAccess().getGroup_3(), "rule__Assumption__Group_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEDFDAccess().getNameAssignment_2(), "rule__EDFD__NameAssignment_2");
					put(grammarAccess.getEDFDAccess().getAssetAssignment_4_1(), "rule__EDFD__AssetAssignment_4_1");
					put(grammarAccess.getEDFDAccess().getAssetAssignment_4_2_1(), "rule__EDFD__AssetAssignment_4_2_1");
					put(grammarAccess.getEDFDAccess().getElementsAssignment_5_1(), "rule__EDFD__ElementsAssignment_5_1");
					put(grammarAccess.getEDFDAccess().getElementsAssignment_5_2_1(), "rule__EDFD__ElementsAssignment_5_2_1");
					put(grammarAccess.getEDFDAccess().getTrustzonesAssignment_6_2(), "rule__EDFD__TrustzonesAssignment_6_2");
					put(grammarAccess.getEDFDAccess().getTrustzonesAssignment_6_3_1(), "rule__EDFD__TrustzonesAssignment_6_3_1");
					put(grammarAccess.getTrustZoneAccess().getNameAssignment_1(), "rule__TrustZone__NameAssignment_1");
					put(grammarAccess.getTrustZoneAccess().getAttackerprofileAssignment_3_2(), "rule__TrustZone__AttackerprofileAssignment_3_2");
					put(grammarAccess.getTrustZoneAccess().getAttackerprofileAssignment_3_3_1(), "rule__TrustZone__AttackerprofileAssignment_3_3_1");
					put(grammarAccess.getTrustZoneAccess().getElementsAssignment_4_1(), "rule__TrustZone__ElementsAssignment_4_1");
					put(grammarAccess.getTrustZoneAccess().getElementsAssignment_4_2_1(), "rule__TrustZone__ElementsAssignment_4_2_1");
					put(grammarAccess.getTrustZoneAccess().getSubzonesAssignment_5_1(), "rule__TrustZone__SubzonesAssignment_5_1");
					put(grammarAccess.getTrustZoneAccess().getSubzonesAssignment_5_2_1(), "rule__TrustZone__SubzonesAssignment_5_2_1");
					put(grammarAccess.getAttackerProfileAccess().getNameAssignment_1(), "rule__AttackerProfile__NameAssignment_1");
					put(grammarAccess.getAttackerProfileAccess().getObservationAssignment_3_1(), "rule__AttackerProfile__ObservationAssignment_3_1");
					put(grammarAccess.getAssetAccess().getNameAssignment_2(), "rule__Asset__NameAssignment_2");
					put(grammarAccess.getAssetAccess().getValueAssignment_3_1(), "rule__Asset__ValueAssignment_3_1");
					put(grammarAccess.getAssetAccess().getValueAssignment_3_2_1(), "rule__Asset__ValueAssignment_3_2_1");
					put(grammarAccess.getAssetAccess().getSourceAssignment_5(), "rule__Asset__SourceAssignment_5");
					put(grammarAccess.getAssetAccess().getTargetsAssignment_7(), "rule__Asset__TargetsAssignment_7");
					put(grammarAccess.getAssetAccess().getTargetsAssignment_8_1(), "rule__Asset__TargetsAssignment_8_1");
					put(grammarAccess.getProcessAccess().getNameAssignment_2(), "rule__Process__NameAssignment_2");
					put(grammarAccess.getProcessAccess().getResponsibilityAssignment_4_1(), "rule__Process__ResponsibilityAssignment_4_1");
					put(grammarAccess.getProcessAccess().getResponsibilityAssignment_4_2_1(), "rule__Process__ResponsibilityAssignment_4_2_1");
					put(grammarAccess.getProcessAccess().getAssetsAssignment_5_1(), "rule__Process__AssetsAssignment_5_1");
					put(grammarAccess.getProcessAccess().getAssetsAssignment_5_2_1(), "rule__Process__AssetsAssignment_5_2_1");
					put(grammarAccess.getProcessAccess().getAssumptionAssignment_6_1(), "rule__Process__AssumptionAssignment_6_1");
					put(grammarAccess.getProcessAccess().getAssumptionAssignment_6_2_1(), "rule__Process__AssumptionAssignment_6_2_1");
					put(grammarAccess.getProcessAccess().getInflowsAssignment_7_2(), "rule__Process__InflowsAssignment_7_2");
					put(grammarAccess.getProcessAccess().getInflowsAssignment_7_3_1(), "rule__Process__InflowsAssignment_7_3_1");
					put(grammarAccess.getProcessAccess().getOutflowsAssignment_8_2(), "rule__Process__OutflowsAssignment_8_2");
					put(grammarAccess.getProcessAccess().getOutflowsAssignment_8_3_1(), "rule__Process__OutflowsAssignment_8_3_1");
					put(grammarAccess.getProcessAccess().getAttackerAssignment_9_1(), "rule__Process__AttackerAssignment_9_1");
					put(grammarAccess.getResponsibilityAccess().getIncomeassetsAssignment_2_0(), "rule__Responsibility__IncomeassetsAssignment_2_0");
					put(grammarAccess.getResponsibilityAccess().getIncomeassetsAssignment_2_1_1(), "rule__Responsibility__IncomeassetsAssignment_2_1_1");
					put(grammarAccess.getResponsibilityAccess().getActionAssignment_2_2(), "rule__Responsibility__ActionAssignment_2_2");
					put(grammarAccess.getResponsibilityAccess().getOutcomeassetsAssignment_2_4(), "rule__Responsibility__OutcomeassetsAssignment_2_4");
					put(grammarAccess.getResponsibilityAccess().getOutcomeassetsAssignment_2_5_1(), "rule__Responsibility__OutcomeassetsAssignment_2_5_1");
					put(grammarAccess.getExternalEntityAccess().getNameAssignment_2(), "rule__ExternalEntity__NameAssignment_2");
					put(grammarAccess.getExternalEntityAccess().getAssetsAssignment_4_1(), "rule__ExternalEntity__AssetsAssignment_4_1");
					put(grammarAccess.getExternalEntityAccess().getAssetsAssignment_4_2_1(), "rule__ExternalEntity__AssetsAssignment_4_2_1");
					put(grammarAccess.getExternalEntityAccess().getAssumptionAssignment_5_1(), "rule__ExternalEntity__AssumptionAssignment_5_1");
					put(grammarAccess.getExternalEntityAccess().getAssumptionAssignment_5_2_1(), "rule__ExternalEntity__AssumptionAssignment_5_2_1");
					put(grammarAccess.getExternalEntityAccess().getInflowsAssignment_6_2(), "rule__ExternalEntity__InflowsAssignment_6_2");
					put(grammarAccess.getExternalEntityAccess().getInflowsAssignment_6_3_1(), "rule__ExternalEntity__InflowsAssignment_6_3_1");
					put(grammarAccess.getExternalEntityAccess().getOutflowsAssignment_7_2(), "rule__ExternalEntity__OutflowsAssignment_7_2");
					put(grammarAccess.getExternalEntityAccess().getOutflowsAssignment_7_3_1(), "rule__ExternalEntity__OutflowsAssignment_7_3_1");
					put(grammarAccess.getExternalEntityAccess().getAttackerAssignment_8_1(), "rule__ExternalEntity__AttackerAssignment_8_1");
					put(grammarAccess.getFlowAccess().getNameAssignment_1(), "rule__Flow__NameAssignment_1");
					put(grammarAccess.getFlowAccess().getNumberAssignment_3_1(), "rule__Flow__NumberAssignment_3_1");
					put(grammarAccess.getFlowAccess().getAssetsAssignment_4_1(), "rule__Flow__AssetsAssignment_4_1");
					put(grammarAccess.getFlowAccess().getAssetsAssignment_4_2_1(), "rule__Flow__AssetsAssignment_4_2_1");
					put(grammarAccess.getFlowAccess().getSourceAssignment_5_1(), "rule__Flow__SourceAssignment_5_1");
					put(grammarAccess.getFlowAccess().getTargetAssignment_6_1(), "rule__Flow__TargetAssignment_6_1");
					put(grammarAccess.getFlowAccess().getTargetAssignment_6_2_1(), "rule__Flow__TargetAssignment_6_2_1");
					put(grammarAccess.getFlowAccess().getChannelAssignment_7_1(), "rule__Flow__ChannelAssignment_7_1");
					put(grammarAccess.getFlowAccess().getAssumptionAssignment_8_1(), "rule__Flow__AssumptionAssignment_8_1");
					put(grammarAccess.getFlowAccess().getAssumptionAssignment_8_2_1(), "rule__Flow__AssumptionAssignment_8_2_1");
					put(grammarAccess.getDataStoreAccess().getNameAssignment_2(), "rule__DataStore__NameAssignment_2");
					put(grammarAccess.getDataStoreAccess().getAssetsAssignment_4_1(), "rule__DataStore__AssetsAssignment_4_1");
					put(grammarAccess.getDataStoreAccess().getAssetsAssignment_4_2_1(), "rule__DataStore__AssetsAssignment_4_2_1");
					put(grammarAccess.getDataStoreAccess().getAssumptionAssignment_5_1(), "rule__DataStore__AssumptionAssignment_5_1");
					put(grammarAccess.getDataStoreAccess().getAssumptionAssignment_5_2_1(), "rule__DataStore__AssumptionAssignment_5_2_1");
					put(grammarAccess.getDataStoreAccess().getInflowsAssignment_6_2(), "rule__DataStore__InflowsAssignment_6_2");
					put(grammarAccess.getDataStoreAccess().getInflowsAssignment_6_3_1(), "rule__DataStore__InflowsAssignment_6_3_1");
					put(grammarAccess.getDataStoreAccess().getOutflowsAssignment_7_2(), "rule__DataStore__OutflowsAssignment_7_2");
					put(grammarAccess.getDataStoreAccess().getOutflowsAssignment_7_3_1(), "rule__DataStore__OutflowsAssignment_7_3_1");
					put(grammarAccess.getDataStoreAccess().getAttackerAssignment_8_1(), "rule__DataStore__AttackerAssignment_8_1");
					put(grammarAccess.getValueAccess().getPriorityAssignment_2(), "rule__Value__PriorityAssignment_2");
					put(grammarAccess.getValueAccess().getObjectiveAssignment_3(), "rule__Value__ObjectiveAssignment_3");
					put(grammarAccess.getAssumptionAccess().getObjectiveAssignment_2_0(), "rule__Assumption__ObjectiveAssignment_2_0");
					put(grammarAccess.getAssumptionAccess().getObjectiveAssignment_2_1_1(), "rule__Assumption__ObjectiveAssignment_2_1_1");
					put(grammarAccess.getAssumptionAccess().getLayerAssignment_3_1(), "rule__Assumption__LayerAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
