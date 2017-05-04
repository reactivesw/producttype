package io.reactivesw.producttype.application.model.action;

import io.reactivesw.producttype.application.model.LocalizedEnumValue;
import io.reactivesw.producttype.infrastructure.update.ProductTypeActionUtils;
import io.reactivesw.producttype.infrastructure.update.UpdateAction;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Be used to set localizedEnumValueLabel when update productType.
 */
@Getter
@Setter
public class SetLocalizedEnumValueLabel implements UpdateAction {

  /**
   * The Attribute name.
   */
  @NotNull
  @Size(min = 1)
  private String attributeName;

  /**
   * The New value.
   */
  @NotNull
  private LocalizedEnumValue newValue;

  /**
   * Get update service name.
   * @return set_localized_enum_value_label
   */
  @Override
  public String getActionName() {
    return ProductTypeActionUtils.SET_LOCALIZED_ENUM_VALUE_LABEL;
  }
}
