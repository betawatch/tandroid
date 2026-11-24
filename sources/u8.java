// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u8 extends d {
    public t36 E;
    public final int[] F;
    public int G;
    public boolean H;
    public ry8 a;
    public GradientDrawable b;
    public t8 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final byte w;
    public boolean x;
    public h45 y;

    /* JADX WARN: Multi-variable type inference failed */
    public u8(int i) {
        super(null);
        this.n = new TextView[6];
        this.F = new int[2];
        this.w = i;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        float f;
        float f2;
        float f3;
        a aVar = this.actionBar;
        int i = 3;
        final byte b = 1;
        final byte b2 = 0;
        if (aVar != null) {
            zkb.h(bkb.c6, null, aVar);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            zkb.l(this.actionBar, 1, bkb.u8, null);
            zkb.l(this.actionBar, 3, bkb.s8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new r8(this, b2));
        }
        s8 s8Var = new s8(b2, context, this);
        this.fragmentView = s8Var;
        zkb.h(bkb.c6, null, s8Var);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new p8((byte) 0));
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            viewGroup.addView(aVar2);
        }
        ry8 ry8Var = new ry8(context);
        this.a = ry8Var;
        viewGroup.addView(ry8Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i2 = bkb.F6;
        zkb.X(textView, i2, null);
        this.e.setGravity(1);
        this.e.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b3 = this.w;
        if (b3 == 3) {
            i2 = bkb.Ei;
        }
        zkb.X(textView2, i2, null);
        this.d.setGravity(1);
        float f4 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        zkb.X(textView3, bkb.C6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(gl.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b3 == 6 || b3 == 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gl.L(48.0f), 0, gl.L(48.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i3 = 2;
        int i4 = 5;
        if (b3 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(gl.L(f2), 0, gl.L(f2), 0);
            this.h.setGravity(k96.a0 ? 5 : 3);
            viewGroup.addView(this.h);
            int i5 = 0;
            while (i5 < i) {
                LinearLayout j = de9.j(context, 0);
                this.h.addView(j, nme.k(0.0f, 0.0f, 0.0f, i5 != i3 ? 7.0f : 0.0f, -2, -2));
                int i6 = i5 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i6] = textView4;
                int i7 = bkb.F6;
                zkb.X(textView4, i7, null);
                textViewArr[i6].setGravity(k96.a0 ? i4 : 3);
                textViewArr[i6].setTextSize(1, f4);
                int i8 = i5 + 1;
                textViewArr[i6].setText(String.format(k96.a0 ? ".%d" : "%d.", Integer.valueOf(i8)));
                textViewArr[i6].setTypeface(gl.o());
                int i9 = i6 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i9] = textView5;
                zkb.X(textView5, i7, null);
                textViewArr[i9].setGravity(k96.a0 ? 5 : 3);
                textViewArr[i9].setTextSize(1, f4);
                if (i5 == 0) {
                    zkb.G(textViewArr[i9], bkb.I6, null);
                    zkb.C(textViewArr[i9], bkb.J6, null);
                    String M0 = k96.M0(2131753889, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i9].setMovementMethod(new cl(b2));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new g4c(k96.M0(2131753890, null), (vib) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i9].setText(spannableStringBuilder);
                } else if (i5 == 1) {
                    textViewArr[i9].setText(k96.M0(2131753888, null));
                } else {
                    textViewArr[i9].setText(k96.M0(2131753887, null));
                }
                if (k96.a0) {
                    j.setGravity(5);
                    j.addView(textViewArr[i9], nme.l(1.0f, 0, -2));
                    j.addView(textViewArr[i6], nme.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    j.addView(textViewArr[i6], nme.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    j.addView(textViewArr[i9], nme.o(-2, -2));
                }
                i5 = i8;
                i = 3;
                f4 = 15.0f;
                i3 = 2;
                i4 = 5;
            }
            this.f.setVisibility(8);
        } else {
            f3 = 2.0f;
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        zkb.X(textView6, bkb.C6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(gl.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(gl.L(f), 0, gl.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.c = t8Var;
        ote.b(t8Var, 0.02f, 1.2f);
        this.c.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.c.setGravity(17);
        zkb.X(this.c, bkb.Ii, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gl.o());
        t8 t8Var2 = this.c;
        int L = gl.L(f2);
        int i10 = bkb.Gi;
        int w0 = bkb.w0(null, i10, false);
        zkb.R(t8Var2, bkb.i0(L, L, L, L, 0, w0, w0), null, zkb.M(i10), null);
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: q8
            public final /* synthetic */ u8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                u8 u8Var = this.b;
                switch (b4) {
                    case 0:
                        if (u8Var.getParentActivity() != null) {
                            byte b5 = u8Var.w;
                            if (b5 == 0) {
                                u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
                                break;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                u8Var.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (b5 == 5) {
                                if (u8Var.getParentActivity() != null) {
                                    if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                        break;
                                    } else {
                                        u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (b5 == 6) {
                                u8Var.presentFragment(new PasscodeActivity(1), true);
                                t36 t36Var = u8Var.E;
                                if (t36Var != null) {
                                    gl.c3(t36Var);
                                    u8Var.E = null;
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (!u8Var.a.getAnimatedDrawable().l0) {
                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                            u8Var.a.d();
                            break;
                        }
                        break;
                    case 2:
                        if (!u8Var.a.getAnimatedDrawable().l0) {
                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                            u8Var.a.d();
                            break;
                        }
                        break;
                    default:
                        ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                        break;
                }
            }
        });
        if (b3 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, kk7.d3, kk7.d3, null);
            this.e.setText(k96.M0(2131752456, null));
            this.f.setText(k96.M0(2131752457, null));
            this.c.setText(k96.M0(2131752458, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, kk7.d3, kk7.d3, null);
            final byte b4 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: q8
                public final /* synthetic */ u8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b4;
                    u8 u8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (u8Var.getParentActivity() != null) {
                                byte b5 = u8Var.w;
                                if (b5 == 0) {
                                    u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
                                    break;
                                } else if (b5 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                    alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                    alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b5 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b5 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t36 t36Var = u8Var.E;
                                    if (t36Var != null) {
                                        gl.c3(t36Var);
                                        u8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            y6c userConfig = getUserConfig();
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(userConfig.n));
            if (V1 == null) {
                V1 = userConfig.f();
            }
            if (V1 != null) {
                this.d.setText(k96.a0("PhoneNumberKeepButton", null, 2131747091, yjb.k(new StringBuilder("+"), V1.phone, p38.f())));
            }
            final byte b5 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: q8
                public final /* synthetic */ u8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b5;
                    u8 u8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (u8Var.getParentActivity() != null) {
                                byte b52 = u8Var.w;
                                if (b52 == 0) {
                                    u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                    alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                    alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t36 t36Var = u8Var.E;
                                    if (t36Var != null) {
                                        gl.c3(t36Var);
                                        u8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            this.e.setText(k96.M0(2131747095, null));
            this.f.setText(gl.S2(k96.M0(2131747092, null)));
            this.c.setText(k96.M0(2131747095, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, kk7.E5, kk7.E5, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(k96.M0(2131753891, null));
            this.c.setText(k96.M0(2131753882, null));
            this.a.d();
        } else if (b3 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, kk7.d3, kk7.d3, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: q8
                public final /* synthetic */ u8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b;
                    u8 u8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (u8Var.getParentActivity() != null) {
                                byte b52 = u8Var.w;
                                if (b52 == 0) {
                                    u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                    alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                    alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t36 t36Var = u8Var.E;
                                    if (t36Var != null) {
                                        gl.c3(t36Var);
                                        u8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!u8Var.a.getAnimatedDrawable().l0) {
                                u8Var.a.getAnimatedDrawable().I(0, false, false);
                                u8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            this.e.setText(k96.M0(2131747464, null));
            this.f.setText(k96.M0(2131752530, null));
            this.c.setText(k96.M0(2131751143, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(gl.L(34.0f), gl.L(8.0f), gl.L(34.0f), gl.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i = bkb.Ei;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(bkb.Fi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(bkb.w0(null, bkb.Ii, false));
        int w0 = bkb.w0(null, bkb.Gi, false);
        if (this.c.getBackground() == null) {
            t8 t8Var = this.c;
            int L = gl.L(24.0f);
            t8Var.setBackground(bkb.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            bkb.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = bkb.w0(null, bkb.F6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i2 = bkb.c6;
        iArr3[3] = bkb.w0(null, i2, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = bkb.w0(null, i, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = bkb.w0(null, i2, false);
        ry8 ry8Var = this.a;
        int[] iArr6 = this.s;
        oy8 oy8Var = ry8Var.b;
        if (oy8Var != null) {
            oy8Var.n = iArr6;
            oy8Var.B();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = bkb.F6;
        arrayList.add(new blb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.I6));
        arrayList.add(new blb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        byte b = 0;
        if (iArr.length > 0 && iArr[0] == 0) {
            da1.i0(getParentActivity(), 1, new i4d(this));
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = gl.S2(k96.M0(2131746310, null));
        alertDialog$Builder.j(k96.M0(2131747107, null), new o8(this, b));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        int i2 = bkb.K5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        d0();
    }
}
