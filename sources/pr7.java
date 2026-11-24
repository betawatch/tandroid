// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pr7 extends py0 {
    public static final /* synthetic */ int w2 = 0;
    public final c V1;
    public final TextView W1;
    public final l66 X1;
    public final mhb Y1;
    public final l66 Z1;
    public final TextView a2;
    public final b61 b2;
    public final b61 c2;
    public w25 d2;
    public Runnable e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public final lr7 l2;
    public int m2;
    public bo6 n2;
    public final lr7 o2;
    public int p2;
    public Runnable q2;
    public qac r2;
    public h65 s2;
    public qac t2;
    public final ImageView u2;
    public final FrameLayout v2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String, ylb] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public pr7(Context context, int i, TL_stars.StarGift starGift, ylb ylbVar) {
        super(context, ylbVar);
        int i2;
        final ?? r12;
        ?? r13;
        Object obj;
        boolean z;
        final byte b = 0;
        this.l2 = new lr7(this, (byte) 0);
        this.o2 = new lr7(this, (byte) 2);
        this.p2 = 2131749564;
        this.a = i;
        this.V1 = c.C(i);
        J();
        this.S1.setLayoutParams(new g69(-1, -2));
        this.u1 = 0.1f;
        float f = this.u0 / gm.p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1.addView(frameLayout, qoe.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_close);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 1, -1));
        imageView.setContentDescription(jb6.M0(2131751978, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: nr7
            public final /* synthetic */ pr7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                pr7 pr7Var = this.b;
                switch (b2) {
                    case 0:
                        pr7Var.dismiss();
                        break;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 == null) {
                                pr7Var.a1();
                                break;
                            } else {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, qoe.d(40, 40.0f, 51, f + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            or7 or7Var = new or7(i, ylbVar, context);
            if (jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z = true;
            } else {
                obj = null;
                z = false;
            }
            r12 = 1;
            r13 = obj;
            i2 = 8;
            or7Var.h(starGift, false, false, false, z, false);
            or7Var.setImageSize(gm.L(90.0f));
            or7Var.K.setVisibility(8);
            frameLayout.addView(or7Var, qoe.d(nm7.E1, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i2 = 8;
            r12 = 1;
            r13 = 0;
        }
        int i3 = cmb.F6;
        TextView b2 = jxe.b(context, 20.0f, i3, r12, r13);
        this.W1 = b2;
        b2.setGravity(17);
        this.S1.addView(b2, qoe.t(-1, -2, 17, 32, starGift == null ? 20 : 0, 32, 0));
        l66 l66Var = new l66(context, ylbVar);
        this.X1 = l66Var;
        l66Var.setTextSize(r12, 15.0f);
        l66Var.setGravity(17);
        anb.X(l66Var, i3, ylbVar);
        anb.G(l66Var, cmb.I6, ylbVar);
        this.S1.addView(l66Var, qoe.t(-1, -2, 17, 32, 8, 32, 0));
        mhb mhbVar = new mhb(context, ylbVar);
        this.Y1 = mhbVar;
        float f2 = f + 14.0f;
        this.S1.addView(mhbVar, qoe.s(-1, -2, 7, f2, 18.0f, f2, 0.0f));
        l66 l66Var2 = new l66(context, ylbVar);
        this.Z1 = l66Var2;
        l66Var2.setTextSize(r12, 15.0f);
        l66Var2.setGravity(17);
        anb.X(l66Var2, i3, ylbVar);
        l66Var2.setVisibility(i2);
        this.S1.addView(l66Var2, qoe.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b3 = jxe.b(context, 14.0f, cmb.x6, false, r13);
        this.a2 = b3;
        b3.setGravity(17);
        this.S1.addView(b3, qoe.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        anb.h(cmb.g5, ylbVar, frameLayout2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        b61 b61Var = new b61(ylbVar, context, false);
        this.b2 = b61Var;
        b61Var.f();
        b61Var.setBackground(cmb.b0(gm.L(24.0f), cmb.p1(0.07f, cmb.v0(i3, ylbVar))));
        b61Var.setTextColorKey(i3);
        b61Var.i(jb6.M0(2131752542, r13), false, r12);
        b61Var.setOnClickListener(new View.OnClickListener(this) { // from class: nr7
            public final /* synthetic */ pr7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = r12;
                pr7 pr7Var = this.b;
                switch (b22) {
                    case 0:
                        pr7Var.dismiss();
                        break;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 == null) {
                                pr7Var.a1();
                                break;
                            } else {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(b61Var, qoe.m(1.0f, 0, 48, 0, 6, 0));
        b61 b61Var2 = new b61(ylbVar, context, r12);
        this.c2 = b61Var2;
        b61Var2.f();
        b61Var2.i(jb6.M0(2131751754, r13), false, r12);
        final byte b4 = 2;
        b61Var2.setOnClickListener(new View.OnClickListener(this) { // from class: nr7
            public final /* synthetic */ pr7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b4;
                pr7 pr7Var = this.b;
                switch (b22) {
                    case 0:
                        pr7Var.dismiss();
                        break;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 == null) {
                                pr7Var.a1();
                                break;
                            } else {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(b61Var2, qoe.m(1.0f, 0, 48, 6, 0, 0));
        float f3 = f + 16.0f;
        frameLayout2.addView(linearLayout, qoe.d(-1, 48.0f, nm7.D1, f3, 8.0f, f3, 16.0f));
        this.b.addView(frameLayout2, qoe.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v2 = frameLayout3;
        frameLayout3.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, qoe.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        r59 r59Var = this.n1;
        r59Var.setPadding(r59Var.getPaddingLeft(), this.n1.getPaddingTop(), this.n1.getPaddingRight(), gm.L(72.0f) + this.n1.getPaddingBottom());
    }

    public static boolean Y0(Context context, int i, ylb ylbVar, long j, int i2) {
        if (c.C(i).z() >= j) {
            return true;
        }
        String a0 = jb6.a0(null, null, i2, c.r(j, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131742748, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = a0;
        alertDialog$Builder.g(jb6.M0(2131742746, null), null);
        alertDialog$Builder.j(jb6.M0(2131742653, null), new yg(context, i, ylbVar, (byte) 10));
        alertDialog$Builder.o();
        return false;
    }

    public final void Z0() {
        if (this.g2 || this.i2) {
            return;
        }
        if (this.m2 <= 0 || ConnectionsManager.getInstance(this.a).getCurrentTime() < this.m2) {
            b1();
            return;
        }
        dismiss();
        bo6 bo6Var = this.n2;
        if (bo6Var != null) {
            bo6Var.run();
        }
    }

    public final void a1() {
        if (this.g2 || this.d2 == null) {
            return;
        }
        if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
            Z0();
            return;
        }
        w25 w25Var = this.d2.f;
        c cVar = this.V1;
        long j = (w25Var == null || !cVar.L()) ? this.d2.b + this.f2 : this.d2.f.b;
        final byte b = 1;
        final byte b2 = 0;
        if (cVar.z() >= j) {
            this.g2 = true;
            this.c2.setLoading(true);
            cVar.n0(this.d2, new qac(this) { // from class: mr7
                public final /* synthetic */ pr7 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b3 = b;
                    pr7 pr7Var = this.b;
                    switch (b3) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (pr7Var.h2) {
                                if (!bool.booleanValue()) {
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.c2.setLoading(false);
                                    qac qacVar = pr7Var.t2;
                                    if (qacVar != null) {
                                        qacVar.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!pr7Var.i2) {
                                        pr7Var.i2 = true;
                                        pr7Var.h2 = false;
                                        pr7Var.g2 = false;
                                        pr7Var.dismiss();
                                        Runnable runnable = pr7Var.q2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!pr7Var.j2) {
                                        pr7Var.j2 = true;
                                        h65 h65Var = pr7Var.s2;
                                        if (h65Var != null) {
                                            h65Var.run();
                                        }
                                    }
                                }
                            }
                            qac qacVar2 = pr7Var.r2;
                            if (qacVar2 != null) {
                                qacVar2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            if (str == null) {
                                pr7Var.h2 = true;
                                break;
                            } else {
                                pr7Var.g2 = false;
                                pr7Var.c2.setLoading(false);
                                if (pr7Var.t2 != null && !c.K(str)) {
                                    pr7Var.t2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new qac(this) { // from class: mr7
                public final /* synthetic */ pr7 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b3 = b2;
                    pr7 pr7Var = this.b;
                    switch (b3) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (pr7Var.h2) {
                                if (!bool.booleanValue()) {
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.c2.setLoading(false);
                                    qac qacVar = pr7Var.t2;
                                    if (qacVar != null) {
                                        qacVar.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!pr7Var.i2) {
                                        pr7Var.i2 = true;
                                        pr7Var.h2 = false;
                                        pr7Var.g2 = false;
                                        pr7Var.dismiss();
                                        Runnable runnable = pr7Var.q2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!pr7Var.j2) {
                                        pr7Var.j2 = true;
                                        h65 h65Var = pr7Var.s2;
                                        if (h65Var != null) {
                                            h65Var.run();
                                        }
                                    }
                                }
                            }
                            qac qacVar2 = pr7Var.r2;
                            if (qacVar2 != null) {
                                qacVar2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            if (str == null) {
                                pr7Var.h2 = true;
                                break;
                            } else {
                                pr7Var.g2 = false;
                                pr7Var.c2.setLoading(false);
                                if (pr7Var.t2 != null && !c.K(str)) {
                                    pr7Var.t2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new lr7(this, (byte) 1));
            return;
        }
        Context context = getContext();
        int i = this.a;
        ylb ylbVar = this.J0;
        String a0 = jb6.a0(null, null, this.p2, c.r(j, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131742748, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = a0;
        alertDialog$Builder.g(jb6.M0(2131742746, null), null);
        alertDialog$Builder.j(jb6.M0(2131742653, null), new yg(context, i, ylbVar, (byte) 10));
        alertDialog$Builder.o();
    }

    public final void b1() {
        lr7 lr7Var = this.o2;
        gm.r(lr7Var);
        int i = this.m2;
        if (i <= 0) {
            return;
        }
        gm.d3(lr7Var, Math.max(0L, (i - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
    }

    public final void c1(Runnable runnable, qac qacVar, qac qacVar2) {
        this.q2 = runnable;
        this.r2 = qacVar;
        this.t2 = qacVar2;
    }

    public final void d1(w25 w25Var) {
        this.d2 = w25Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = gm.L(140.0f);
        TextView textView = this.a2;
        spannableStringBuilder.setSpan(new ta6(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f2 = 0L;
        this.e2 = this.V1.k(w25Var, new vt4((Object) this, (byte) 22));
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        if (this.h2 && !this.i2) {
            this.i2 = true;
            this.h2 = false;
            Runnable runnable = this.q2;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.k2 = false;
        gm.r(this.l2);
        gm.r(this.o2);
        Runnable runnable2 = this.e2;
        if (runnable2 != null) {
            runnable2.run();
            this.e2 = null;
        }
        super.dismiss();
    }

    public final void e1(CharSequence charSequence, String str) {
        this.W1.setText(str);
        setTitle(str);
        l66 l66Var = this.X1;
        l66Var.setText(charSequence);
        l66Var.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // my0, ah0
    public final c41 j() {
        return new c41(this.v2, this.J0);
    }
}
