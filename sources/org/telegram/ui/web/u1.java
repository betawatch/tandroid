package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import dg.b4;
import dg.t2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.wx0;
import ph.a9;
import ph.ab;
import ph.c5;
import ph.ca;
import ph.da;
import ph.f8;
import ph.g8;
import ph.h9;
import ph.i8;
import ph.ia;
import ph.ja;
import ph.l4;
import ph.oa;
import ph.p5;
import ph.u6;
import ph.y4;
import ph.y8;
import ph.z7;
import ph.za;
import vh.r3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d8  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z4;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        BitmapFactory.Options options;
        vh.r a2;
        int i13 = this.a;
        int i14 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                x1 x1Var = (x1) obj3;
                b1 b1Var = (b1) obj;
                x1Var.getClass();
                ((e1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = x1Var.e;
                if (callback != null) {
                    x1Var.finishFragment();
                    callback.run(b1Var);
                    break;
                } else {
                    af.g.s(x1Var.getParentActivity(), b1Var.c);
                    break;
                }
            case 1:
                g2 g2Var = (g2) obj3;
                g2Var.getClass();
                AndroidUtilities.runOnUIThread(new m71(g2Var, (f2) obj2, (Bitmap) obj, 8));
                break;
            case 2:
                ph.w1 w1Var = (ph.w1) obj3;
                za zaVar = (za) obj;
                w1Var.getClass();
                ph.u1 u1Var = ((ph.u1[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(zaVar == null ? "🌤" : zaVar.c);
                sb.append(" ");
                sb.append(zaVar == null ? ab.b() ? "24°C" : "72°F" : zaVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString(), w1Var.b.getFontMetricsInt(), false);
                ph.w1 w1Var2 = u1Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, w1Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), w1Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                u1Var.k = staticLayout;
                u1Var.l = staticLayout.getLineCount() > 0 ? u1Var.k.getLineWidth(0) : 0.0f;
                u1Var.m = u1Var.k.getLineCount() > 0 ? u1Var.k.getLineLeft(0) : 0.0f;
                u1Var.b = AndroidUtilities.dpf2(17.6f) + u1Var.l;
                u1Var.c = AndroidUtilities.dpf2(36.0f);
                w1Var.invalidate();
                w1Var.requestLayout();
                break;
            case 3:
                h9 h9Var = (h9) obj3;
                ca caVar = (ca) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - caVar.getBottomPadding2(), h9Var.q2 - caVar.getPaddingUnderContainer()));
                h9Var.S();
                if (max > 0) {
                    dg.j jVar = h9Var.G0;
                    if ((jVar instanceof b4) && ((b4) jVar).getEditText().isFocused()) {
                        z4 = true;
                        animatorSet = h9Var.K1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        h9Var.K1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        t2 t2Var = h9Var.a1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(t2Var, (Property<t2, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(h9Var.Q0, (Property<y4, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        dg.k0 k0Var = h9Var.T0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<dg.k0, Float>) property2, !z4 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(h9Var.y0, (Property<dg.f2, Float>) property2, (z4 || h9Var.y1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(h9Var.x0, (Property<dg.b2, Float>) property2, (z4 || h9Var.y1) ? 1.0f : 0.0f));
                        h9Var.T0();
                        h9Var.K1.playTogether(arrayList);
                        if (z4) {
                            h9Var.K1.setDuration(350L);
                            h9Var.K1.setInterpolator(nr.h);
                        } else {
                            h9Var.K1.setDuration(250L);
                            h9Var.K1.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        }
                        h9Var.K1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z4 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z4 ? nr.h : org.telegram.ui.ActionBar.r1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z4) {
                            h9Var.P0(false);
                        }
                        if (h9Var.e2 != z4) {
                            h9Var.g0();
                        }
                        h9Var.e2 = z4;
                        break;
                    }
                }
                z4 = false;
                animatorSet = h9Var.K1;
                if (animatorSet != null) {
                }
                h9Var.K1 = new AnimatorSet();
                arrayList = new ArrayList();
                t2 t2Var2 = h9Var.a1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(t2Var2, (Property<t2, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(h9Var.Q0, (Property<y4, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                dg.k0 k0Var2 = h9Var.T0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<dg.k0, Float>) property22, !z4 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h9Var.y0, (Property<dg.f2, Float>) property22, (z4 || h9Var.y1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(h9Var.x0, (Property<dg.b2, Float>) property22, (z4 || h9Var.y1) ? 1.0f : 0.0f));
                h9Var.T0();
                h9Var.K1.playTogether(arrayList);
                if (z4) {
                }
                h9Var.K1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z4) {
                }
                if (h9Var.e2 != z4) {
                }
                h9Var.e2 = z4;
                break;
            case 4:
                c5 c5Var = (c5) obj3;
                l4 l4Var = (l4) obj2;
                za zaVar2 = (za) obj;
                if (zaVar2 != null) {
                    l4Var.dismiss();
                    c5Var.z0(false);
                    c5Var.d0(c5Var.p0(zaVar2));
                    break;
                }
                break;
            case 5:
                c5 c5Var2 = (c5) obj3;
                dg.i1 i1Var = (dg.i1) obj2;
                dg.f1 f1Var = (dg.f1) obj;
                if (i1Var != null) {
                    int i15 = c5Var2.C1;
                    i1Var.r0 = f1Var;
                    i1Var.n0.b(i15, f1Var, false);
                    i1Var.m();
                    c5Var2.d0(i1Var);
                    break;
                } else {
                    c5Var2.d0(c5Var2.i0(f1Var));
                    break;
                }
            case 6:
                z7 z7Var = (z7) obj3;
                ((o70) obj2).u();
                z7Var.g(true);
                f8 f8Var = z7Var.T;
                i8 i8Var = f8Var.U;
                if (i8Var != null) {
                    i8Var.run(new HashSet(f8Var.v));
                    break;
                }
                break;
            case 7:
                z7 z7Var2 = (z7) obj3;
                z7Var2.T.D = true;
                ((jr[]) obj2)[0].dismiss();
                z7Var2.g(true);
                break;
            case 8:
                a9 a9Var = (a9) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                da daVar = a9Var.a;
                boolean q02 = daVar.q0();
                int i16 = daVar.c;
                if (q02) {
                    try {
                        daVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                daVar.M1 = false;
                p5 p5Var = daVar.z0;
                if (p5Var != null) {
                    p5Var.c(false);
                }
                if (daVar.D1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(daVar.D1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                    } catch (Exception unused2) {
                        i11 = -1;
                    }
                    try {
                        i12 = options.outHeight;
                    } catch (Exception unused3) {
                        i12 = -1;
                        if (num.intValue() != -1) {
                        }
                        if (num.intValue() != -1) {
                        }
                        u6 m9 = u6.m(r11, daVar.D1);
                        m9.J0 = daVar.s0;
                        m9.K0 = daVar.t0;
                        if (daVar.x0.j()) {
                        }
                    }
                    int i17 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i17 = 270;
                        }
                    } else if (i12 > i11 && i17 != 0) {
                        i17 = 0;
                    }
                    u6 m92 = u6.m(i17, daVar.D1);
                    m92.J0 = daVar.s0;
                    m92.K0 = daVar.t0;
                    if (daVar.x0.j()) {
                        daVar.H1 = m92;
                        g8.a(i16, m92);
                        daVar.I1 = false;
                        if (callback2 != null) {
                            callback2.run(new y8(a9Var, 2));
                            break;
                        } else {
                            daVar.K(1, true);
                            break;
                        }
                    } else {
                        daVar.D1 = null;
                        if (daVar.x0.l(m92)) {
                            u6 a10 = u6.a(daVar.x0.getLayout(), daVar.x0.getContent());
                            daVar.H1 = a10;
                            g8.a(i16, a10);
                            daVar.I1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        daVar.m0(true);
                        break;
                    }
                }
                break;
            case 9:
                ja jaVar = (ja) obj2;
                Float f10 = (Float) obj;
                jaVar.i = f10.floatValue();
                ia iaVar = ((oa) obj3).a;
                if (iaVar != null) {
                    iaVar.V(f10.floatValue(), jaVar.a);
                    break;
                }
                break;
            case 10:
                rh.r0 r0Var = (rh.r0) obj3;
                s sVar = (s) obj2;
                int[] iArr = (int[]) obj;
                r0Var.getClass();
                boolean z10 = false;
                while (i14 < iArr.length) {
                    if (iArr[i14] == 0) {
                        z10 = true;
                    }
                    i14++;
                }
                r0Var.d = true;
                r0Var.e = true;
                r0Var.l();
                Iterator it = r0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z10));
                break;
            case 11:
                rh.r0 r0Var2 = (rh.r0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                r0Var2.getClass();
                boolean z11 = false;
                while (i14 < iArr2.length) {
                    if (iArr2[i14] == 0) {
                        z11 = true;
                    }
                    i14++;
                }
                r0Var2.d = z11;
                r0Var2.e = z11;
                r0Var2.l();
                Iterator it2 = r0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 12:
                ((File[]) obj3)[0] = (File) obj;
                ((r70) obj2).run();
                break;
            case 13:
                ((rh.l2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 14:
                sh.g gVar = (sh.g) obj3;
                gVar.getClass();
                gVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 15:
                sh.g gVar2 = (sh.g) obj3;
                gVar2.getClass();
                gVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 16:
                sh.i0 i0Var = (sh.i0) obj3;
                i0Var.V((TLRPC.Chat) obj2, i0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 17:
                View view = (View) obj3;
                uf.n nVar = (uf.n) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(nVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 18:
                uf.o1 o1Var = (uf.o1) obj2;
                uf.p1 f11 = uf.p1.f(UserConfig.selectedAccount);
                li liVar = ((uf.c0) obj3).b;
                long n12 = liVar.n1();
                int i18 = f11.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i18).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = o1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i18);
                    messagesStorage.getStorageQueue().postRunnable(new wx0(f11, messagesStorage, o1Var, tL_messages_sendQuickReplyMessages, 24));
                }
                liVar.dismiss();
                break;
            case 19:
                uf.x0.W((uf.x0) obj3, (View) obj2, (String) obj);
                break;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str = (String) obj;
                r3 r3Var = ((vh.p) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    r3Var.V2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    r3Var.R1(pageblockmath2);
                    break;
                }
            case 21:
                vh.d1 d1Var = (vh.d1) obj3;
                vh.r rVar = (vh.r) obj2;
                String str2 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = vh.r.a(str2, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z12 = d1Var.v;
                        if (z12) {
                            d1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, d1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, d1Var.length())), spannableString);
                        d1Var.setSelection(Math.min(max2 + 1, d1Var.length()));
                        if (z12) {
                            d1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 22:
                vh.y1 y1Var = (vh.y1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str3 = (String) obj;
                y1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str3;
                    y1Var.M.V2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str3;
                    y1Var.M.R1(pageblockmath4);
                    break;
                }
            default:
                r3 r3Var2 = (r3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.equals(str4, pageblockmath5.source)) {
                    vh.c2 c2Var = r3Var2.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    pageblockmath5.source = str4;
                    r3Var2.V2.N(false);
                    vh.c2 c2Var2 = r3Var2.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    r3Var2.e3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
