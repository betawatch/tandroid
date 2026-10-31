package th;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ k1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0397  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder W2;
        boolean z10;
        d5 d5Var;
        int i10 = this.a;
        z2 z2Var = this.b;
        switch (i10) {
            case 0:
                o7 o7Var = z2Var.s0;
                o7Var.C();
                org.telegram.messenger.i0.h3(new i2(o7Var, 1), 30L);
                break;
            case 1:
                z2Var.u0.q(!r1.f0, true);
                break;
            case 2:
                g2 g2Var = z2Var.L0;
                TL_stories.StoryItem storyItem = z2Var.x1.a;
                if (storyItem != null) {
                    if (z2Var.l1) {
                        z2Var.D0(storyItem.privacy.isEmpty() ? new vh.u6(3, z2Var.l2, new ArrayList()) : new vh.u6(z2Var.l2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (z2Var.o0 == null) {
                            vh.p2 p2Var = new vh.p2(z2Var.getContext(), 1);
                            p2Var.p(true);
                            p2Var.K = Layout.Alignment.ALIGN_CENTER;
                            p2Var.l0 = new i1(z2Var, 9);
                            z2Var.o0 = p2Var;
                            p2Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            g2Var.addView(z2Var.o0, w7.b6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User Z1 = vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1));
                        if (Z1 != null) {
                            String str = Z1.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                z2Var.o0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                W2 = org.telegram.messenger.i0.W2(cd.a0("StoryCloseFriendsHint", null, 2131744724, str));
                            } else if (storyItem.contacts) {
                                z2Var.o0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                W2 = org.telegram.messenger.i0.W2(cd.a0("StoryContactsHint", null, 2131744720, str));
                                z10 = false;
                                CharSequence m10 = org.telegram.messenger.k6.m(W2, z2Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                vh.p2 p2Var2 = z2Var.o0;
                                p2Var2.h = !z10 ? vh.p2.a(m10, p2Var2.getTextPaint()) : g2Var.getMeasuredWidth();
                                z2Var.o0.s(m10);
                                z2Var.o0.l(1.0f, (-(g2Var.getWidth() - z2Var.l0.getCenterX())) / org.telegram.messenger.i0.p);
                                o7 o7Var2 = ((f7) z2Var.z1).d;
                                o7Var2.i1 = true;
                                o7Var2.d0();
                                if (z2Var.o0.V) {
                                    org.telegram.messenger.t2.e.a();
                                }
                                z2Var.o0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                z2Var.o0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                W2 = org.telegram.messenger.i0.W2(cd.a0("StorySelectedContactsHint", null, 2131744505, str));
                            }
                            z10 = true;
                            CharSequence m102 = org.telegram.messenger.k6.m(W2, z2Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            vh.p2 p2Var22 = z2Var.o0;
                            p2Var22.h = !z10 ? vh.p2.a(m102, p2Var22.getTextPaint()) : g2Var.getMeasuredWidth();
                            z2Var.o0.s(m102);
                            z2Var.o0.l(1.0f, (-(g2Var.getWidth() - z2Var.l0.getCenterX())) / org.telegram.messenger.i0.p);
                            o7 o7Var22 = ((f7) z2Var.z1).d;
                            o7Var22.i1 = true;
                            o7Var22.d0();
                            if (z2Var.o0.V) {
                            }
                            z2Var.o0.u();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.w0.u();
                boolean z11 = org.telegram.messenger.v2.a;
                org.telegram.messenger.w0.r();
                gf.f.r(z2Var.getContext(), org.telegram.messenger.v2.g);
                break;
            case 4:
                y2 y2Var = z2Var.x1;
                if (y2Var != null && (d5Var = y2Var.b) != null) {
                    d5Var.I = false;
                    d5Var.d = false;
                    d5Var.h = 0.0f;
                    d5Var.r = 0.0f;
                    d5Var.n = 0.0f;
                    if (d5Var.e != null) {
                        try {
                            new File(d5Var.e).delete();
                            d5Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    d5Var.d();
                    z2Var.d1(false);
                    break;
                }
                break;
            case 5:
                s0 s0Var = s0.W;
                if (s0Var != null) {
                    boolean o10 = s0Var.o();
                    s0 s0Var2 = s0.W;
                    boolean z12 = !o10;
                    if (s0Var2.n && s0Var2.r != z12) {
                        s0Var2.r = z12;
                        NativeInstance nativeInstance = s0Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                    z2Var.J1.b(z12, true);
                    break;
                }
                break;
            case 6:
                p1 p1Var = z2Var.u0;
                if (!z2Var.B0(false)) {
                    rh.e6 y3 = rh.e6.y(z2Var.l2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        p1Var.k(z2Var.B0(false));
                        break;
                    } else {
                        p1Var.p();
                        break;
                    }
                } else {
                    p1Var.k(z2Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = z2Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = z2Var.k0;
                org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(1, context, p6Var, false);
                z2Var2.P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
                LinearLayout linearLayout = new LinearLayout(z2Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                g9 g9Var = new g9(z2Var.getContext());
                g9Var.getImageReceiver().W(1);
                ui.b0(z2Var.l2).c2(g9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(g9Var, w7.b6.t(zs.g2, zs.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(z2Var.getContext());
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
                sc.e.u(textView, 1, 20.0f, null, 2131744532);
                linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(z2Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.r5, p6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744531, null)));
                linearLayout.addView(textView2, w7.b6.t(-1, -2, 1, 32, 9, 32, 19));
                vh.d dVar = new vh.d(z2Var.getContext(), p6Var, true);
                dVar.i(cd.L0(2131744535, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                dq dqVar = new dq(R.drawable.mini_switch_lock, 0);
                dqVar.n = 1;
                spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) cd.L0(2131747787, null)), false);
                linearLayout.addView(dVar, w7.b6.r(-1, 48, 1));
                dVar.setOnClickListener(new rh.u1(6, z2Var, z2Var2));
                z2Var2.N = linearLayout;
                ((f7) z2Var.z1).h(z2Var2);
                u2 u2Var = z2Var.c1;
                if (u2Var != null) {
                    u2Var.a();
                    break;
                }
                break;
            case 8:
                if (z2Var.T2) {
                    h4.I0();
                } else {
                    ((f7) z2Var.z1).h(new h4(z2Var.getContext(), z2Var.L0.getY() + z2Var.getY(), 0, z2Var.k0));
                }
                u2 u2Var2 = z2Var.c1;
                if (u2Var2 != null) {
                    u2Var2.a();
                    break;
                }
                break;
            case 9:
                ((f7) z2Var.z1).h(new h4(z2Var.getContext(), z2Var.L0.getY() + z2Var.getY(), 0, z2Var.k0));
                u2 u2Var3 = z2Var.c1;
                if (u2Var3 != null) {
                    u2Var3.a();
                    break;
                }
                break;
            case 10:
                k2 k2Var = z2Var.t0;
                boolean z13 = k2Var.v0;
                t9 t9Var = k2Var.W;
                if (!z13) {
                    z2Var.Q2 = true;
                    k2Var.E(false);
                    break;
                } else if (!t9Var.x()) {
                    k2Var.D();
                    break;
                } else if (t9Var.x() && Math.abs(k2Var.g0 - k2Var.i0) < org.telegram.messenger.i0.e && Math.abs(k2Var.h0 - k2Var.j0) < org.telegram.messenger.i0.e) {
                    w9 w9Var = t9Var.n(k2Var.getContext()).r;
                    w9Var.l();
                    if (!w9Var.i && w9Var.e) {
                        w9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                z2Var.W0(true);
                break;
            case 12:
                z2Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = z2Var.x1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    z2Var.l0(new i1(z2Var, 10));
                    break;
                } else {
                    z2Var.J0(null);
                    break;
                }
                break;
        }
    }
}
