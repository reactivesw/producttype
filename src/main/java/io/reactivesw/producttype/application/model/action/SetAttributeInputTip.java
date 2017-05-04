package io.reactivesw.producttype.application.model.action;

import io.reactivesw.model.LocalizedString;
import io.reactivesw.producttype.infrastructure.update.ProductTypeActionUtils;
import io.reactivesw.producttype.infrastructure.update.UpdateAction;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Be used to set attributeInputTip when update productType.
 */
@Getter
@Setter
public class SetAttributeInputTip implements UpdateAction {
  /**
   * The Attribute name.
   */
  @NotNull
  @Size(min = 1)
  private String attributeName;

  /**
   * The Input tip.
   */
  private LocalizedString inputTip;

  /**
   * Get update service name.
   * @return set_attribute_definition_inputtip
   */
  @Override
  public String getActionName() {
    return ProductTypeActionUtils.SET_ATTRIBUTE_DEFINITION_INPUTTIP;
  }
}
