// default package

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v48 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ v48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder S2;
        boolean z;
        b6b b6bVar;
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                t58 t58Var = o68Var.M0;
                TL_stories.StoryItem storyItem = o68Var.y1.a;
                if (storyItem != null) {
                    if (o68Var.m1) {
                        boolean isEmpty = storyItem.privacy.isEmpty();
                        int i = o68Var.m2;
                        o68Var.x0(isEmpty ? new u9b(3, i, new ArrayList()) : new u9b(i, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (o68Var.p0 == null) {
                            kg5 kg5Var = new kg5(o68Var.getContext(), 1);
                            kg5Var.p(true);
                            kg5Var.L = Layout.Alignment.ALIGN_CENTER;
                            kg5Var.r0 = new u48(o68Var, (byte) 9);
                            o68Var.p0 = kg5Var;
                            kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            t58Var.addView(o68Var.p0, tre.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User X1 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
                        if (X1 != null) {
                            String str = X1.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                o68Var.p0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                S2 = hl.S2(ob6.a0("StoryCloseFriendsHint", null, 2131744360, str));
                            } else if (storyItem.contacts) {
                                o68Var.p0.m(11.0f, 6.0f, 11.0f, 7.0f);
                                S2 = hl.S2(ob6.a0("StoryContactsHint", null, 2131744356, str));
                                z = false;
                                CharSequence m = pv3.m(S2, o68Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                kg5 kg5Var2 = o68Var.p0;
                                kg5Var2.h = !z ? kg5.a(m, kg5Var2.getTextPaint()) : t58Var.getMeasuredWidth();
                                o68Var.p0.t(m);
                                o68Var.p0.n(1.0f, (-(t58Var.getWidth() - o68Var.m0.getCenterX())) / hl.p);
                                lcb lcbVar = ((ccb) o68Var.A1).d;
                                lcbVar.i1 = true;
                                lcbVar.U();
                                if (o68Var.p0.W) {
                                    yw0.e.a();
                                }
                                o68Var.p0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                o68Var.p0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                S2 = hl.S2(ob6.a0("StorySelectedContactsHint", null, 2131744133, str));
                            }
                            z = true;
                            CharSequence m2 = pv3.m(S2, o68Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            kg5 kg5Var22 = o68Var.p0;
                            kg5Var22.h = !z ? kg5.a(m2, kg5Var22.getTextPaint()) : t58Var.getMeasuredWidth();
                            o68Var.p0.t(m2);
                            o68Var.p0.n(1.0f, (-(t58Var.getWidth() - o68Var.m0.getCenterX())) / hl.p);
                            lcb lcbVar2 = ((ccb) o68Var.A1).d;
                            lcbVar2.i1 = true;
                            lcbVar2.U();
                            if (o68Var.p0.W) {
                            }
                            o68Var.p0.v();
                        }
                    }
                }
                break;
            case 1:
                y58 y58Var = o68Var.u0;
                boolean z2 = y58Var.v0;
                jmb jmbVar = y58Var.W;
                if (!z2) {
                    o68Var.R2 = true;
                    y58Var.E(false);
                    break;
                } else if (!jmbVar.w()) {
                    y58Var.D();
                    break;
                } else if (jmbVar.w() && Math.abs(y58Var.g0 - y58Var.i0) < hl.e && Math.abs(y58Var.h0 - y58Var.j0) < hl.e) {
                    mmb mmbVar = jmbVar.m(y58Var.getContext()).r;
                    mmbVar.k();
                    if (!mmbVar.i && mmbVar.e) {
                        mmbVar.e(false);
                        break;
                    }
                }
                break;
            case 2:
                o68Var.T0(true);
                break;
            case 3:
                o68Var.b1();
                break;
            case 4:
                TL_stories.StoryItem storyItem2 = o68Var.y1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    o68Var.d0(new u48(o68Var, (byte) 10));
                    break;
                } else {
                    o68Var.E0(null);
                    break;
                }
                break;
            case 5:
                o68Var.v0.p(!r0.g0, true);
                break;
            case 6:
                a.t();
                boolean z3 = f11.a;
                a.q();
                m01.u(o68Var.getContext(), f11.g);
                break;
            case 7:
                n68 n68Var = o68Var.y1;
                if (n68Var != null && (b6bVar = n68Var.b) != null) {
                    b6bVar.J = false;
                    b6bVar.d = false;
                    b6bVar.h = 0.0f;
                    b6bVar.r = 0.0f;
                    b6bVar.n = 0.0f;
                    if (b6bVar.e != null) {
                        try {
                            new File(b6bVar.e).delete();
                            b6bVar.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    b6bVar.d();
                    o68Var.c1(false);
                    break;
                }
                break;
            case 8:
                lcb lcbVar3 = o68Var.t0;
                lcbVar3.m();
                hl.d3(new x58(lcbVar3, (byte) 1), 30L);
                break;
            case 9:
                w96 w96Var = w96.N;
                if (w96Var != null) {
                    boolean z4 = !w96Var.r();
                    w96.N.D(z4);
                    o68Var.K1.b(z4, true);
                    break;
                }
                break;
            case 10:
                b58 b58Var = o68Var.v0;
                if (!o68Var.v0(false)) {
                    jxa v = jxa.v(o68Var.m2, false);
                    if (v.e && v.f.amount <= 0) {
                        b58Var.j(o68Var.v0(false));
                        break;
                    } else {
                        b58Var.o();
                        break;
                    }
                } else {
                    b58Var.j(o68Var.v0(false));
                    break;
                }
                break;
            case 11:
                Context context = o68Var.getContext();
                x53 x53Var = o68Var.l0;
                nx0 nx0Var = new nx0(1, (vnb) x53Var, context, false);
                nx0Var.K(aob.v0(aob.h5, x53Var));
                LinearLayout linearLayout = new LinearLayout(o68Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                de0 de0Var = new de0(o68Var.getContext());
                de0Var.getImageReceiver().M(1);
                ls6.d0(o68Var.m2).e2(de0Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(de0Var, tre.t(jn7.f2, jn7.f2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(o68Var.getContext());
                textView.setTypeface(hl.o());
                textView.setGravity(17);
                yob.X(textView, aob.j5, x53Var);
                bs2.r(20.0f, 1, 2131744160, textView, null);
                linearLayout.addView(textView, tre.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(o68Var.getContext());
                textView2.setGravity(17);
                yob.X(textView2, aob.r5, x53Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(hl.S2(ob6.M0(2131744159, null)));
                linearLayout.addView(textView2, tre.t(-1, -2, 1, 32, 9, 32, 19));
                c51 c51Var = new c51(x53Var, o68Var.getContext(), true);
                c51Var.i(ob6.M0(2131744163, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                wm2 wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
                wm2Var.n = 1;
                spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                c51Var.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) ob6.M0(2131747498, null)), false);
                linearLayout.addView(c51Var, tre.r(-1, 48, 1));
                c51Var.setOnClickListener(new uv5(o68Var, nx0Var, (byte) 16));
                nx0Var.O = linearLayout;
                ((ccb) o68Var.A1).h(nx0Var);
                j68 j68Var = o68Var.d1;
                if (j68Var != null) {
                    j68Var.a();
                    break;
                }
                break;
            case 12:
                if (o68Var.U2) {
                    g2b.E0();
                } else {
                    ((ccb) o68Var.A1).h(new g2b(o68Var.getContext(), o68Var.M0.getY() + o68Var.getY(), 0, o68Var.l0));
                }
                j68 j68Var2 = o68Var.d1;
                if (j68Var2 != null) {
                    j68Var2.a();
                    break;
                }
                break;
            default:
                o68Var.getClass();
                ((ccb) o68Var.A1).h(new g2b(o68Var.getContext(), o68Var.M0.getY() + o68Var.getY(), 0, o68Var.l0));
                j68 j68Var3 = o68Var.d1;
                if (j68Var3 != null) {
                    j68Var3.a();
                    break;
                }
                break;
        }
    }
}
