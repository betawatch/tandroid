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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u8 extends d {
    public t56 E;
    public final int[] F;
    public int G;
    public boolean H;
    public s09 a;
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
    public nv4 y;

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
            anb.h(cmb.c6, null, aVar);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            anb.l(this.actionBar, 1, cmb.u8, null);
            anb.l(this.actionBar, 3, cmb.s8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new r8(this, b2));
        }
        s8 s8Var = new s8(b2, context, this);
        this.fragmentView = s8Var;
        anb.h(cmb.c6, null, s8Var);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new p8((byte) 0));
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            viewGroup.addView(aVar2);
        }
        s09 s09Var = new s09(context);
        this.a = s09Var;
        viewGroup.addView(s09Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i2 = cmb.F6;
        anb.X(textView, i2, null);
        this.e.setGravity(1);
        this.e.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b3 = this.w;
        if (b3 == 3) {
            i2 = cmb.Ei;
        }
        anb.X(textView2, i2, null);
        this.d.setGravity(1);
        float f4 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        anb.X(textView3, cmb.C6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(gm.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b3 == 6 || b3 == 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gm.L(48.0f), 0, gm.L(48.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i3 = 2;
        int i4 = 5;
        if (b3 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(gm.L(f2), 0, gm.L(f2), 0);
            this.h.setGravity(jb6.a0 ? 5 : 3);
            viewGroup.addView(this.h);
            int i5 = 0;
            while (i5 < i) {
                LinearLayout i6 = hg9.i(context, 0);
                this.h.addView(i6, qoe.k(0.0f, 0.0f, 0.0f, i5 != i3 ? 7.0f : 0.0f, -2, -2));
                int i7 = i5 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i7] = textView4;
                int i8 = cmb.F6;
                anb.X(textView4, i8, null);
                textViewArr[i7].setGravity(jb6.a0 ? i4 : 3);
                textViewArr[i7].setTextSize(1, f4);
                int i9 = i5 + 1;
                textViewArr[i7].setText(String.format(jb6.a0 ? ".%d" : "%d.", Integer.valueOf(i9)));
                textViewArr[i7].setTypeface(gm.o());
                int i10 = i7 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i10] = textView5;
                anb.X(textView5, i8, null);
                textViewArr[i10].setGravity(jb6.a0 ? 5 : 3);
                textViewArr[i10].setTextSize(1, f4);
                if (i5 == 0) {
                    anb.G(textViewArr[i10], cmb.I6, null);
                    anb.C(textViewArr[i10], cmb.J6, null);
                    String M0 = jb6.M0(2131753857, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i10].setMovementMethod(new cm(b2));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new g6c(jb6.M0(2131753858, null), (wkb) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i10].setText(spannableStringBuilder);
                } else if (i5 == 1) {
                    textViewArr[i10].setText(jb6.M0(2131753856, null));
                } else {
                    textViewArr[i10].setText(jb6.M0(2131753855, null));
                }
                if (jb6.a0) {
                    i6.setGravity(5);
                    i6.addView(textViewArr[i10], qoe.l(1.0f, 0, -2));
                    i6.addView(textViewArr[i7], qoe.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    i6.addView(textViewArr[i7], qoe.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    i6.addView(textViewArr[i10], qoe.o(-2, -2));
                }
                i5 = i9;
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
        anb.X(textView6, cmb.C6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(gm.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(gm.L(f), 0, gm.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.c = t8Var;
        rve.b(t8Var, 0.02f, 1.2f);
        this.c.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        this.c.setGravity(17);
        anb.X(this.c, cmb.Ii, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gm.o());
        t8 t8Var2 = this.c;
        int L = gm.L(f2);
        int i11 = cmb.Gi;
        int w0 = cmb.w0(null, i11, false);
        anb.R(t8Var2, cmb.i0(L, L, L, L, 0, w0, w0), null, anb.M(i11), null);
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
                                u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                break;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                u8Var.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (b5 == 5) {
                                if (u8Var.getParentActivity() != null) {
                                    if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                        break;
                                    } else {
                                        u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (b5 == 6) {
                                u8Var.presentFragment(new PasscodeActivity(1), true);
                                t56 t56Var = u8Var.E;
                                if (t56Var != null) {
                                    gm.c3(t56Var);
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
            this.a.f(R.raw.channel_create, nm7.d3, nm7.d3, null);
            this.e.setText(jb6.M0(2131752415, null));
            this.f.setText(jb6.M0(2131752416, null));
            this.c.setText(jb6.M0(2131752417, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, nm7.d3, nm7.d3, null);
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
                                    u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                    break;
                                } else if (b5 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                    alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b5 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b5 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t56 t56Var = u8Var.E;
                                    if (t56Var != null) {
                                        gm.c3(t56Var);
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
            z8c userConfig = getUserConfig();
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(userConfig.n));
            if (W1 == null) {
                W1 = userConfig.f();
            }
            if (W1 != null) {
                this.d.setText(jb6.a0("PhoneNumberKeepButton", null, 2131747017, mlb.l(new StringBuilder("+"), W1.phone, r58.f())));
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
                                    u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                    alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t56 t56Var = u8Var.E;
                                    if (t56Var != null) {
                                        gm.c3(t56Var);
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
            this.e.setText(jb6.M0(2131747021, null));
            this.f.setText(gm.S2(jb6.M0(2131747018, null)));
            this.c.setText(jb6.M0(2131747021, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, nm7.E5, nm7.E5, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(jb6.M0(2131753859, null));
            this.c.setText(jb6.M0(2131753850, null));
            this.a.d();
        } else if (b3 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, nm7.d3, nm7.d3, null);
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
                                    u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                    alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                    alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    u8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                            break;
                                        } else {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                    t56 t56Var = u8Var.E;
                                    if (t56Var != null) {
                                        gm.c3(t56Var);
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
            this.e.setText(jb6.M0(2131747390, null));
            this.f.setText(jb6.M0(2131752495, null));
            this.c.setText(jb6.M0(2131751092, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(gm.L(34.0f), gm.L(8.0f), gm.L(34.0f), gm.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        e0();
        return this.fragmentView;
    }

    public final void e0() {
        int i = cmb.Ei;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(cmb.Fi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(cmb.w0(null, cmb.Ii, false));
        int w0 = cmb.w0(null, cmb.Gi, false);
        if (this.c.getBackground() == null) {
            t8 t8Var = this.c;
            int L = gm.L(24.0f);
            t8Var.setBackground(cmb.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            cmb.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = cmb.w0(null, cmb.F6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i2 = cmb.c6;
        iArr3[3] = cmb.w0(null, i2, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = cmb.w0(null, i, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = cmb.w0(null, i2, false);
        s09 s09Var = this.a;
        int[] iArr6 = this.s;
        p09 p09Var = s09Var.b;
        if (p09Var != null) {
            p09Var.n = iArr6;
            p09Var.B();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = cmb.F6;
        arrayList.add(new cnb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.I6));
        arrayList.add(new cnb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        byte b = 0;
        if (iArr.length > 0 && iArr[0] == 0) {
            lb1.j0(getParentActivity(), 1, new k6d((Object) this, (byte) 3));
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
        alertDialog$Builder.j(jb6.M0(2131747033, null), new o8(this, b));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        int i2 = cmb.K5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, cmb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        e0();
    }
}
