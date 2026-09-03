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
import eg.r2;
import eg.z3;
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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.dy0;
import qh.a5;
import qh.aa;
import qh.ba;
import qh.c8;
import qh.e8;
import qh.e9;
import qh.fa;
import qh.g8;
import qh.ga;
import qh.k4;
import qh.la;
import qh.m5;
import qh.r6;
import qh.v8;
import qh.w7;
import qh.wa;
import qh.x4;
import qh.x8;
import qh.xa;
import wh.r3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i10, Object obj, Object obj2) {
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
        wh.s a2;
        int i13 = this.a;
        int i14 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                h2 h2Var = (h2) obj3;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new n71(h2Var, (g2) obj2, (Bitmap) obj, 8));
                break;
            case 1:
                qh.v1 v1Var = (qh.v1) obj3;
                wa waVar = (wa) obj;
                v1Var.getClass();
                qh.t1 t1Var = ((qh.t1[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(waVar == null ? "🌤" : waVar.c);
                sb.append(" ");
                sb.append(waVar == null ? xa.b() ? "24°C" : "72°F" : waVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString(), v1Var.b.getFontMetricsInt(), false);
                qh.v1 v1Var2 = t1Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, v1Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), v1Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                t1Var.k = staticLayout;
                t1Var.l = staticLayout.getLineCount() > 0 ? t1Var.k.getLineWidth(0) : 0.0f;
                t1Var.m = t1Var.k.getLineCount() > 0 ? t1Var.k.getLineLeft(0) : 0.0f;
                t1Var.b = AndroidUtilities.dpf2(17.6f) + t1Var.l;
                t1Var.c = AndroidUtilities.dpf2(36.0f);
                v1Var.invalidate();
                v1Var.requestLayout();
                break;
            case 2:
                e9 e9Var = (e9) obj3;
                aa aaVar = (aa) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - aaVar.getBottomPadding2(), e9Var.q2 - aaVar.getPaddingUnderContainer()));
                e9Var.S();
                if (max > 0) {
                    eg.j jVar = e9Var.G0;
                    if ((jVar instanceof z3) && ((z3) jVar).getEditText().isFocused()) {
                        z4 = true;
                        animatorSet = e9Var.K1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        e9Var.K1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        r2 r2Var = e9Var.a1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(r2Var, (Property<r2, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(e9Var.Q0, (Property<x4, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        eg.i0 i0Var = e9Var.T0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property2, !z4 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(e9Var.y0, (Property<eg.d2, Float>) property2, (z4 || e9Var.y1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(e9Var.x0, (Property<eg.z1, Float>) property2, (z4 || e9Var.y1) ? 1.0f : 0.0f));
                        e9Var.T0();
                        e9Var.K1.playTogether(arrayList);
                        if (z4) {
                            e9Var.K1.setDuration(350L);
                            e9Var.K1.setInterpolator(pr.h);
                        } else {
                            e9Var.K1.setDuration(250L);
                            e9Var.K1.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        }
                        e9Var.K1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z4 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z4 ? pr.h : org.telegram.ui.ActionBar.r1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z4) {
                            e9Var.P0(false);
                        }
                        if (e9Var.e2 != z4) {
                            e9Var.g0();
                        }
                        e9Var.e2 = z4;
                        break;
                    }
                }
                z4 = false;
                animatorSet = e9Var.K1;
                if (animatorSet != null) {
                }
                e9Var.K1 = new AnimatorSet();
                arrayList = new ArrayList();
                r2 r2Var2 = e9Var.a1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(r2Var2, (Property<r2, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(e9Var.Q0, (Property<x4, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                eg.i0 i0Var2 = e9Var.T0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(i0Var2, (Property<eg.i0, Float>) property22, !z4 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(e9Var.y0, (Property<eg.d2, Float>) property22, (z4 || e9Var.y1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(e9Var.x0, (Property<eg.z1, Float>) property22, (z4 || e9Var.y1) ? 1.0f : 0.0f));
                e9Var.T0();
                e9Var.K1.playTogether(arrayList);
                if (z4) {
                }
                e9Var.K1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z4) {
                }
                if (e9Var.e2 != z4) {
                }
                e9Var.e2 = z4;
                break;
            case 3:
                a5 a5Var = (a5) obj3;
                k4 k4Var = (k4) obj2;
                wa waVar2 = (wa) obj;
                if (waVar2 != null) {
                    k4Var.dismiss();
                    a5Var.z0(false);
                    a5Var.d0(a5Var.p0(waVar2));
                    break;
                }
                break;
            case 4:
                a5 a5Var2 = (a5) obj3;
                eg.g1 g1Var = (eg.g1) obj2;
                eg.d1 d1Var = (eg.d1) obj;
                if (g1Var != null) {
                    int i15 = a5Var2.C1;
                    g1Var.r0 = d1Var;
                    g1Var.n0.b(i15, d1Var, false);
                    g1Var.m();
                    a5Var2.d0(g1Var);
                    break;
                } else {
                    a5Var2.d0(a5Var2.i0(d1Var));
                    break;
                }
            case 5:
                w7 w7Var = (w7) obj3;
                ((q70) obj2).u();
                w7Var.g(true);
                c8 c8Var = w7Var.T;
                g8 g8Var = c8Var.U;
                if (g8Var != null) {
                    g8Var.run(new HashSet(c8Var.v));
                    break;
                }
                break;
            case 6:
                w7 w7Var2 = (w7) obj3;
                w7Var2.T.D = true;
                ((lr[]) obj2)[0].dismiss();
                w7Var2.g(true);
                break;
            case 7:
                x8 x8Var = (x8) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                ba baVar = x8Var.a;
                boolean q02 = baVar.q0();
                int i16 = baVar.c;
                if (q02) {
                    try {
                        baVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                baVar.M1 = false;
                m5 m5Var = baVar.z0;
                if (m5Var != null) {
                    m5Var.c(false);
                }
                if (baVar.D1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(baVar.D1.getAbsolutePath(), options);
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
                        r6 m9 = r6.m(r11, baVar.D1);
                        m9.J0 = baVar.s0;
                        m9.K0 = baVar.t0;
                        if (baVar.x0.j()) {
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
                    r6 m92 = r6.m(i17, baVar.D1);
                    m92.J0 = baVar.s0;
                    m92.K0 = baVar.t0;
                    if (baVar.x0.j()) {
                        baVar.H1 = m92;
                        e8.a(i16, m92);
                        baVar.I1 = false;
                        if (callback != null) {
                            callback.run(new v8(x8Var, 2));
                            break;
                        } else {
                            baVar.K(1, true);
                            break;
                        }
                    } else {
                        baVar.D1 = null;
                        if (baVar.x0.l(m92)) {
                            r6 a10 = r6.a(baVar.x0.getLayout(), baVar.x0.getContent());
                            baVar.H1 = a10;
                            e8.a(i16, a10);
                            baVar.I1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        baVar.m0(true);
                        break;
                    }
                }
                break;
            case 8:
                ga gaVar = (ga) obj2;
                Float f10 = (Float) obj;
                gaVar.i = f10.floatValue();
                fa faVar = ((la) obj3).a;
                if (faVar != null) {
                    faVar.W(f10.floatValue(), gaVar.a);
                    break;
                }
                break;
            case 9:
                sh.q0 q0Var = (sh.q0) obj3;
                s sVar = (s) obj2;
                int[] iArr = (int[]) obj;
                q0Var.getClass();
                boolean z10 = false;
                while (i14 < iArr.length) {
                    if (iArr[i14] == 0) {
                        z10 = true;
                    }
                    i14++;
                }
                q0Var.d = true;
                q0Var.e = true;
                q0Var.l();
                Iterator it = q0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z10));
                break;
            case 10:
                sh.q0 q0Var2 = (sh.q0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                q0Var2.getClass();
                boolean z11 = false;
                while (i14 < iArr2.length) {
                    if (iArr2[i14] == 0) {
                        z11 = true;
                    }
                    i14++;
                }
                q0Var2.d = z11;
                q0Var2.e = z11;
                q0Var2.l();
                Iterator it2 = q0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ((File[]) obj3)[0] = (File) obj;
                ((t70) obj2).run();
                break;
            case 12:
                ((sh.k2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 13:
                th.g gVar = (th.g) obj3;
                gVar.getClass();
                gVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 14:
                th.g gVar2 = (th.g) obj3;
                gVar2.getClass();
                gVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 15:
                th.i0 i0Var3 = (th.i0) obj3;
                i0Var3.V((TLRPC.Chat) obj2, i0Var3.e, ((Boolean) obj).booleanValue());
                break;
            case 16:
                View view = (View) obj3;
                vf.n nVar = (vf.n) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(nVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 17:
                vf.o1 o1Var = (vf.o1) obj2;
                vf.p1 f11 = vf.p1.f(UserConfig.selectedAccount);
                mi miVar = ((vf.c0) obj3).b;
                long n12 = miVar.n1();
                int i18 = f11.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i18).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = o1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i18);
                    messagesStorage.getStorageQueue().postRunnable(new dy0(f11, messagesStorage, o1Var, tL_messages_sendQuickReplyMessages, 25));
                }
                miVar.dismiss();
                break;
            case 18:
                vf.x0.W((vf.x0) obj3, (View) obj2, (String) obj);
                break;
            case 19:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str = (String) obj;
                r3 r3Var = ((wh.q) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    r3Var.V2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    r3Var.Q1(pageblockmath2);
                    break;
                }
            case 20:
                wh.e1 e1Var = (wh.e1) obj3;
                wh.s sVar2 = (wh.s) obj2;
                String str2 = (String) obj;
                e1Var.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    Editable text = e1Var.getText();
                    int spanStart = text.getSpanStart(sVar2);
                    int spanEnd = text.getSpanEnd(sVar2);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = wh.s.a(str2, e1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z12 = e1Var.v;
                        if (z12) {
                            e1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, e1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, e1Var.length())), spannableString);
                        e1Var.setSelection(Math.min(max2 + 1, e1Var.length()));
                        if (z12) {
                            e1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 21:
                wh.z1 z1Var = (wh.z1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str3 = (String) obj;
                z1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str3;
                    z1Var.M.V2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str3;
                    z1Var.M.Q1(pageblockmath4);
                    break;
                }
            default:
                r3 r3Var2 = (r3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.equals(str4, pageblockmath5.source)) {
                    wh.d2 d2Var = r3Var2.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    pageblockmath5.source = str4;
                    r3Var2.V2.N(false);
                    wh.d2 d2Var2 = r3Var2.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    r3Var2.e3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
