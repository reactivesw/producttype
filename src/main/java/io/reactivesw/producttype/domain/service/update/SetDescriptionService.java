package io.reactivesw.producttype.domain.service.update;

import io.reactivesw.producttype.application.model.action.SetDescription;
import io.reactivesw.producttype.domain.model.ProductType;
import io.reactivesw.producttype.infrastructure.update.ProductTypeActionUtils;
import io.reactivesw.producttype.infrastructure.update.UpdateAction;
import io.reactivesw.producttype.infrastructure.update.Updater;
import org.springframework.stereotype.Service;

/**
 * Created by Davis on 17/1/2.
 */
@Service(value = ProductTypeActionUtils.SET_DESCRIPTION)
public class SetDescriptionService extends Updater {
  /**
   * set product type description.
   * @param entity E
   * @param action UpdateAction
   */
  @Override
  public void handle(ProductType entity, UpdateAction action) {
    SetDescription setDescription = (SetDescription) action;
    entity.setDescription(setDescription.getDescription());
  }
}
