#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.ui.admin.text;

import java.security.BasicPermission;

public class ReadTranslationPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  public ReadTranslationPermission() {
    super(ReadTranslationPermission.class.getSimpleName());
  }
}
