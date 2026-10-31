package rh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z60;
import vh.k9;
import vh.l9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                g3 g3Var = (g3) obj3;
                sf.b bVar = (sf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                gf.e eVar = g3Var.n;
                if (eVar != null && bVar == g3Var.q) {
                    eVar.c(false);
                }
                g3Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    g3Var.o.put(bVar, new d3(bVar, tL_payments_paymentFormStarGift));
                    g3Var.a(true);
                    break;
                }
                break;
            case 1:
                ((j20) obj3).a((sf.a) obj, new ph.x1((i0[]) obj2, 25));
                break;
            case 2:
                th.z2 z2Var = (th.z2) obj3;
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                z2Var.t3 = h3Var;
                kg.q0.w1(new kg.q1(z2Var, 10), (TL_stories.TL_premium_boostsStatus) obj2, h3Var, z2Var.k1, true);
                th.o7 o7Var = z2Var.s0;
                if (o7Var != null) {
                    o7Var.k1 = false;
                    o7Var.d0();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj3;
                k9 k9Var = (k9) obj;
                f5Var.getClass();
                vh.r1 r1Var = ((vh.r1[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k9Var == null ? "🌤" : k9Var.c);
                sb2.append(" ");
                sb2.append(k9Var == null ? l9.a() ? "24°C" : "72°F" : k9Var.a());
                CharSequence m10 = org.telegram.messenger.k6.m(sb2.toString(), ((TextPaint) f5Var.c).getFontMetricsInt(), false, null, 0);
                org.telegram.ui.ActionBar.f5 f5Var2 = r1Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) f5Var2.c, org.telegram.messenger.i0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) f5Var2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                r1Var.k = staticLayout;
                r1Var.l = staticLayout.getLineCount() > 0 ? r1Var.k.getLineWidth(0) : 0.0f;
                r1Var.m = r1Var.k.getLineCount() > 0 ? r1Var.k.getLineLeft(0) : 0.0f;
                r1Var.b = org.telegram.messenger.i0.N(17.6f) + r1Var.l;
                r1Var.c = org.telegram.messenger.i0.N(36.0f);
                f5Var.invalidate();
                f5Var.requestLayout();
                break;
            case 4:
                vh.s7 s7Var = (vh.s7) obj3;
                vh.n8 n8Var = (vh.n8) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - n8Var.getBottomPadding2(), s7Var.c2 - n8Var.getPaddingUnderContainer()));
                s7Var.R();
                if (max > 0) {
                    jg.j jVar = s7Var.s0;
                    if ((jVar instanceof jg.g3) && ((jg.g3) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = s7Var.w1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        s7Var.w1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        jg.d2 d2Var = s7Var.M0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<jg.d2, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.i0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(s7Var.C0, (Property<vh.y3, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.i0.L(40.0f) + (-max)) : 0));
                        jg.d0 d0Var = s7Var.F0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(d0Var, (Property<jg.d0, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(s7Var.k0, (Property<jg.o1, Float>) property2, (z10 || s7Var.k1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(s7Var.j0, (Property<jg.k1, Float>) property2, (z10 || s7Var.k1) ? 1.0f : 0.0f));
                        s7Var.Q0();
                        s7Var.w1.playTogether(arrayList);
                        if (z10) {
                            s7Var.w1.setDuration(350L);
                            s7Var.w1.setInterpolator(gr.h);
                        } else {
                            s7Var.w1.setDuration(250L);
                            s7Var.w1.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                        }
                        s7Var.w1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? gr.h : org.telegram.ui.ActionBar.m1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            s7Var.M0(false);
                        }
                        if (s7Var.Q1 != z10) {
                            s7Var.d0();
                        }
                        s7Var.Q1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = s7Var.w1;
                if (animatorSet != null) {
                }
                s7Var.w1 = new AnimatorSet();
                arrayList = new ArrayList();
                jg.d2 d2Var2 = s7Var.M0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(d2Var2, (Property<jg.d2, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.i0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var.C0, (Property<vh.y3, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.i0.L(40.0f) + (-max)) : 0));
                jg.d0 d0Var2 = s7Var.F0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d0Var2, (Property<jg.d0, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var.k0, (Property<jg.o1, Float>) property22, (z10 || s7Var.k1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var.j0, (Property<jg.k1, Float>) property22, (z10 || s7Var.k1) ? 1.0f : 0.0f));
                s7Var.Q0();
                s7Var.w1.playTogether(arrayList);
                if (z10) {
                }
                s7Var.w1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (s7Var.Q1 != z10) {
                }
                s7Var.Q1 = z10;
                break;
            case 5:
                vh.b4 b4Var = (vh.b4) obj3;
                vh.q3 q3Var = (vh.q3) obj2;
                k9 k9Var2 = (k9) obj;
                if (k9Var2 != null) {
                    q3Var.dismiss();
                    b4Var.w0(false);
                    b4Var.b0(b4Var.m0(k9Var2));
                    break;
                }
                break;
            case 6:
                vh.b4 b4Var2 = (vh.b4) obj3;
                jg.v0 v0Var = (jg.v0) obj2;
                jg.s0 s0Var = (jg.s0) obj;
                if (v0Var != null) {
                    int i15 = b4Var2.o1;
                    v0Var.u0 = s0Var;
                    v0Var.q0.b(i15, s0Var, false);
                    v0Var.m();
                    b4Var2.b0(v0Var);
                    break;
                } else {
                    b4Var2.b0(b4Var2.f0(s0Var));
                    break;
                }
            case 7:
                vh.r6 r6Var = (vh.r6) obj3;
                ((z60) obj2).u();
                r6Var.h(true);
                vh.w6 w6Var = r6Var.W;
                vh.z6 z6Var = w6Var.O1;
                if (z6Var != null) {
                    z6Var.a(new HashSet(w6Var.r1));
                    break;
                }
                break;
            case 8:
                vh.r6 r6Var2 = (vh.r6) obj3;
                r6Var2.W.x1 = true;
                ((cr[]) obj2)[0].dismiss();
                r6Var2.h(true);
                break;
            case 9:
                vh.o7 o7Var2 = (vh.o7) obj3;
                q20 q20Var = (q20) obj2;
                Integer num = (Integer) obj;
                vh.o8 o8Var = o7Var2.a;
                boolean p02 = o8Var.p0();
                int i16 = o8Var.c;
                if (p02) {
                    try {
                        o8Var.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                o8Var.P1 = false;
                vh.o4 o4Var = o8Var.C0;
                if (o4Var != null) {
                    o4Var.c(false);
                }
                if (o8Var.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(o8Var.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                        try {
                            i12 = options.outHeight;
                        } catch (Exception unused2) {
                            i12 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            vh.n5 m11 = vh.n5.m(o8Var.G1, r12);
                            m11.J0 = o8Var.v0;
                            m11.K0 = o8Var.w0;
                            if (o8Var.A0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i11 = -1;
                    }
                    int i17 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i17 = zs.t4;
                        }
                    } else if (i12 > i11 && i17 != 0) {
                        i17 = 0;
                    }
                    vh.n5 m112 = vh.n5.m(o8Var.G1, i17);
                    m112.J0 = o8Var.v0;
                    m112.K0 = o8Var.w0;
                    if (o8Var.A0.j()) {
                        o8Var.K1 = m112;
                        vh.x6.a(i16, m112);
                        o8Var.L1 = false;
                        if (q20Var != null) {
                            q20Var.a(new vh.m7(o7Var2, 2));
                            break;
                        } else {
                            o8Var.J(1, true);
                            break;
                        }
                    } else {
                        o8Var.G1 = null;
                        if (o8Var.A0.l(m112)) {
                            vh.n5 a2 = vh.n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
                            o8Var.K1 = a2;
                            vh.x6.a(i16, a2);
                            o8Var.L1 = false;
                            if (q20Var != null) {
                                q20Var.a(null);
                            }
                        } else if (q20Var != null) {
                            q20Var.a(null);
                        }
                        o8Var.l0(true);
                        break;
                    }
                }
                break;
            case 10:
                vh.u8 u8Var = (vh.u8) obj2;
                Float f7 = (Float) obj;
                u8Var.i = f7.floatValue();
                vh.t8 t8Var = ((vh.z8) obj3).a;
                if (t8Var != null) {
                    t8Var.u(f7.floatValue(), u8Var.a);
                    break;
                }
                break;
            case 11:
                xh.o0 o0Var = (xh.o0) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                int[] iArr = (int[]) obj;
                o0Var.getClass();
                boolean z11 = false;
                while (i14 < iArr.length) {
                    if (iArr[i14] == 0) {
                        z11 = true;
                    }
                    i14++;
                }
                o0Var.d = true;
                o0Var.e = true;
                o0Var.k();
                Iterator it = o0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                oVar.a(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 12:
                xh.o0 o0Var2 = (xh.o0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                o0Var2.getClass();
                boolean z12 = false;
                while (i14 < iArr2.length) {
                    if (iArr2[i14] == 0) {
                        z12 = true;
                    }
                    i14++;
                }
                o0Var2.d = z12;
                o0Var2.e = z12;
                o0Var2.k();
                Iterator it2 = o0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                ((File[]) obj3)[0] = (File) obj;
                ((d70) obj2).run();
                break;
            case 14:
                ((xh.h2) obj3).d.D.F((String) obj2, (String) obj, false);
                break;
            case 15:
                yh.e eVar2 = (yh.e) obj3;
                eVar2.getClass();
                eVar2.a0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 16:
                yh.e eVar3 = (yh.e) obj3;
                eVar3.getClass();
                eVar3.Z((String) obj2, ((Boolean) obj).booleanValue());
                break;
            default:
                yh.a0 a0Var = (yh.a0) obj3;
                a0Var.K0((TLRPC.Chat) obj2, a0Var.l1, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
