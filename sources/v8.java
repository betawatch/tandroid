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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v8 extends e {
    public w56 E;
    public final int[] F;
    public int G;
    public boolean H;
    public e29 a;
    public GradientDrawable b;
    public u8 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final byte w;
    public boolean x;
    public u34 y;

    /* JADX WARN: Multi-variable type inference failed */
    public v8(int i) {
        super(null);
        this.n = new TextView[6];
        this.F = new int[2];
        this.w = i;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        float f;
        float f2;
        float f3;
        a aVar = this.actionBar;
        int i = 3;
        final byte b = 1;
        final byte b2 = 0;
        if (aVar != null) {
            yob.h(aob.d6, null, aVar);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            yob.l(this.actionBar, 1, aob.v8, null);
            yob.l(this.actionBar, 3, aob.t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new s8(this, b2));
        }
        t8 t8Var = new t8(this, context, b2);
        this.fragmentView = t8Var;
        yob.h(aob.d6, null, t8Var);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new q8((byte) 0));
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            viewGroup.addView(aVar2);
        }
        e29 e29Var = new e29(context);
        this.a = e29Var;
        viewGroup.addView(e29Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i2 = aob.G6;
        yob.X(textView, i2, null);
        this.e.setGravity(1);
        this.e.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b3 = this.w;
        if (b3 == 3) {
            i2 = aob.Fi;
        }
        yob.X(textView2, i2, null);
        this.d.setGravity(1);
        float f4 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        yob.X(textView3, aob.D6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(hl.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b3 == 6 || b3 == 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i3 = 2;
        int i4 = 5;
        if (b3 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(hl.L(f2), 0, hl.L(f2), 0);
            this.h.setGravity(ob6.a0 ? 5 : 3);
            viewGroup.addView(this.h);
            int i5 = 0;
            while (i5 < i) {
                LinearLayout j = uh9.j(context, 0);
                this.h.addView(j, tre.k(0.0f, 0.0f, 0.0f, i5 != i3 ? 7.0f : 0.0f, -2, -2));
                int i6 = i5 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i6] = textView4;
                int i7 = aob.G6;
                yob.X(textView4, i7, null);
                textViewArr[i6].setGravity(ob6.a0 ? i4 : 3);
                textViewArr[i6].setTextSize(1, f4);
                int i8 = i5 + 1;
                textViewArr[i6].setText(String.format(ob6.a0 ? ".%d" : "%d.", Integer.valueOf(i8)));
                textViewArr[i6].setTypeface(hl.o());
                int i9 = i6 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i9] = textView5;
                yob.X(textView5, i7, null);
                textViewArr[i9].setGravity(ob6.a0 ? 5 : 3);
                textViewArr[i9].setTextSize(1, f4);
                if (i5 == 0) {
                    yob.G(textViewArr[i9], aob.J6, null);
                    yob.C(textViewArr[i9], aob.K6, null);
                    String M0 = ob6.M0(2131753885, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i9].setMovementMethod(new dl(b2));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new f8c(ob6.M0(2131753886, null), (rmb) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i9].setText(spannableStringBuilder);
                } else if (i5 == 1) {
                    textViewArr[i9].setText(ob6.M0(2131753884, null));
                } else {
                    textViewArr[i9].setText(ob6.M0(2131753883, null));
                }
                if (ob6.a0) {
                    j.setGravity(5);
                    j.addView(textViewArr[i9], tre.l(1.0f, 0, -2));
                    j.addView(textViewArr[i6], tre.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    j.addView(textViewArr[i6], tre.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    j.addView(textViewArr[i9], tre.o(-2, -2));
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
        yob.X(textView6, aob.D6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(hl.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(hl.L(f), 0, hl.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        u8 u8Var = new u8(this, context);
        this.c = u8Var;
        iye.b(u8Var, 0.02f, 1.2f);
        this.c.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        this.c.setGravity(17);
        yob.X(this.c, aob.Ji, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(hl.o());
        u8 u8Var2 = this.c;
        int L = hl.L(f2);
        int i10 = aob.Hi;
        int w0 = aob.w0(null, i10, false);
        yob.R(u8Var2, aob.i0(L, L, L, L, 0, w0, w0), null, yob.M(i10), null);
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: r8
            public final /* synthetic */ v8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                v8 v8Var = this.b;
                switch (b4) {
                    case 0:
                        if (v8Var.getParentActivity() != null) {
                            byte b5 = v8Var.w;
                            if (b5 == 0) {
                                v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                break;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                v8Var.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (b5 == 5) {
                                if (v8Var.getParentActivity() != null) {
                                    if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                        break;
                                    } else {
                                        v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (b5 == 6) {
                                v8Var.presentFragment(new PasscodeActivity(1), true);
                                w56 w56Var = v8Var.E;
                                if (w56Var != null) {
                                    hl.c3(w56Var);
                                    v8Var.E = null;
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (!v8Var.a.getAnimatedDrawable().l0) {
                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                            v8Var.a.d();
                            break;
                        }
                        break;
                    case 2:
                        if (!v8Var.a.getAnimatedDrawable().l0) {
                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                            v8Var.a.d();
                            break;
                        }
                        break;
                    default:
                        ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                        break;
                }
            }
        });
        if (b3 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, jn7.d3, jn7.d3, null);
            this.e.setText(ob6.M0(2131752443, null));
            this.f.setText(ob6.M0(2131752444, null));
            this.c.setText(ob6.M0(2131752445, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, jn7.d3, jn7.d3, null);
            final byte b4 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: r8
                public final /* synthetic */ v8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b4;
                    v8 v8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (v8Var.getParentActivity() != null) {
                                byte b5 = v8Var.w;
                                if (b5 == 0) {
                                    v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                    break;
                                } else if (b5 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                    alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    v8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b5 == 5) {
                                    if (v8Var.getParentActivity() != null) {
                                        if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                            break;
                                        } else {
                                            v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b5 == 6) {
                                    v8Var.presentFragment(new PasscodeActivity(1), true);
                                    w56 w56Var = v8Var.E;
                                    if (w56Var != null) {
                                        hl.c3(w56Var);
                                        v8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            yac userConfig = getUserConfig();
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(userConfig.n));
            if (X1 == null) {
                X1 = userConfig.f();
            }
            if (X1 != null) {
                this.d.setText(ob6.a0("PhoneNumberKeepButton", null, 2131747011, xnb.k(new StringBuilder("+"), X1.phone, f78.f())));
            }
            final byte b5 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: r8
                public final /* synthetic */ v8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b5;
                    v8 v8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (v8Var.getParentActivity() != null) {
                                byte b52 = v8Var.w;
                                if (b52 == 0) {
                                    v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                    alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    v8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (v8Var.getParentActivity() != null) {
                                        if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                            break;
                                        } else {
                                            v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    v8Var.presentFragment(new PasscodeActivity(1), true);
                                    w56 w56Var = v8Var.E;
                                    if (w56Var != null) {
                                        hl.c3(w56Var);
                                        v8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            this.e.setText(ob6.M0(2131747015, null));
            this.f.setText(hl.S2(ob6.M0(2131747012, null)));
            this.c.setText(ob6.M0(2131747015, null));
            this.a.d();
            this.x = true;
        } else if (b3 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, jn7.E5, jn7.E5, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(ob6.M0(2131753887, null));
            this.c.setText(ob6.M0(2131753878, null));
            this.a.d();
        } else if (b3 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, jn7.d3, jn7.d3, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: r8
                public final /* synthetic */ v8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b42 = b;
                    v8 v8Var = this.b;
                    switch (b42) {
                        case 0:
                            if (v8Var.getParentActivity() != null) {
                                byte b52 = v8Var.w;
                                if (b52 == 0) {
                                    v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                    break;
                                } else if (b52 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                    alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    v8Var.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (b52 == 5) {
                                    if (v8Var.getParentActivity() != null) {
                                        if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                            break;
                                        } else {
                                            v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (b52 == 6) {
                                    v8Var.presentFragment(new PasscodeActivity(1), true);
                                    w56 w56Var = v8Var.E;
                                    if (w56Var != null) {
                                        hl.c3(w56Var);
                                        v8Var.E = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        case 2:
                            if (!v8Var.a.getAnimatedDrawable().l0) {
                                v8Var.a.getAnimatedDrawable().I(0, false, false);
                                v8Var.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                            break;
                    }
                }
            });
            this.e.setText(ob6.M0(2131747384, null));
            this.f.setText(ob6.M0(2131752523, null));
            this.c.setText(ob6.M0(2131751120, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(hl.L(34.0f), hl.L(8.0f), hl.L(34.0f), hl.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i = aob.Fi;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(aob.Gi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(aob.w0(null, aob.Ji, false));
        int w0 = aob.w0(null, aob.Hi, false);
        if (this.c.getBackground() == null) {
            u8 u8Var = this.c;
            int L = hl.L(24.0f);
            u8Var.setBackground(aob.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            aob.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = aob.w0(null, aob.G6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i2 = aob.d6;
        iArr3[3] = aob.w0(null, i2, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = aob.w0(null, i, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = aob.w0(null, i2, false);
        e29 e29Var = this.a;
        int[] iArr6 = this.s;
        b29 b29Var = e29Var.b;
        if (b29Var != null) {
            b29Var.n = iArr6;
            b29Var.B();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = aob.G6;
        arrayList.add(new apb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.J6));
        arrayList.add(new apb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        byte b = 0;
        if (iArr.length > 0 && iArr[0] == 0) {
            la1.i0(getParentActivity(), 1, new z8d((Object) this, (byte) 3));
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
        alertDialog$Builder.j(ob6.M0(2131747027, null), new p8(this, b));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        int i2 = aob.L5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        d0();
    }
}
