// Generated by view binder compiler. Do not edit!
package com.example.curso.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.curso.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btLoginStart;

  @NonNull
  public final ConstraintLayout r;

  @NonNull
  public final TextView txtAviso;

  @NonNull
  public final EditText txtEmailLogin;

  @NonNull
  public final TextView txtInicio;

  @NonNull
  public final TextView txtOlvidarContraseA;

  @NonNull
  public final EditText txtPasswordLogin;

  @NonNull
  public final TextView txtRegistrarseButton;

  @NonNull
  public final TextView txtRegistrarseInicioSesion;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btLoginStart,
      @NonNull ConstraintLayout r, @NonNull TextView txtAviso, @NonNull EditText txtEmailLogin,
      @NonNull TextView txtInicio, @NonNull TextView txtOlvidarContraseA,
      @NonNull EditText txtPasswordLogin, @NonNull TextView txtRegistrarseButton,
      @NonNull TextView txtRegistrarseInicioSesion) {
    this.rootView = rootView;
    this.btLoginStart = btLoginStart;
    this.r = r;
    this.txtAviso = txtAviso;
    this.txtEmailLogin = txtEmailLogin;
    this.txtInicio = txtInicio;
    this.txtOlvidarContraseA = txtOlvidarContraseA;
    this.txtPasswordLogin = txtPasswordLogin;
    this.txtRegistrarseButton = txtRegistrarseButton;
    this.txtRegistrarseInicioSesion = txtRegistrarseInicioSesion;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_login_start;
      Button btLoginStart = ViewBindings.findChildViewById(rootView, id);
      if (btLoginStart == null) {
        break missingId;
      }

      ConstraintLayout r = (ConstraintLayout) rootView;

      id = R.id.txt_aviso;
      TextView txtAviso = ViewBindings.findChildViewById(rootView, id);
      if (txtAviso == null) {
        break missingId;
      }

      id = R.id.txt_email_login;
      EditText txtEmailLogin = ViewBindings.findChildViewById(rootView, id);
      if (txtEmailLogin == null) {
        break missingId;
      }

      id = R.id.txt_inicio;
      TextView txtInicio = ViewBindings.findChildViewById(rootView, id);
      if (txtInicio == null) {
        break missingId;
      }

      id = R.id.txt_olvidar_contraseña;
      TextView txtOlvidarContraseA = ViewBindings.findChildViewById(rootView, id);
      if (txtOlvidarContraseA == null) {
        break missingId;
      }

      id = R.id.txt_password_login;
      EditText txtPasswordLogin = ViewBindings.findChildViewById(rootView, id);
      if (txtPasswordLogin == null) {
        break missingId;
      }

      id = R.id.txt_registrarse_button;
      TextView txtRegistrarseButton = ViewBindings.findChildViewById(rootView, id);
      if (txtRegistrarseButton == null) {
        break missingId;
      }

      id = R.id.txt_registrarse_inicio_sesion;
      TextView txtRegistrarseInicioSesion = ViewBindings.findChildViewById(rootView, id);
      if (txtRegistrarseInicioSesion == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btLoginStart, r, txtAviso,
          txtEmailLogin, txtInicio, txtOlvidarContraseA, txtPasswordLogin, txtRegistrarseButton,
          txtRegistrarseInicioSesion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}