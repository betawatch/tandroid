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
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.yx0;
import qh.b5;
import qh.ba;
import qh.ca;
import qh.d8;
import qh.f8;
import qh.f9;
import qh.ga;
import qh.h8;
import qh.ha;
import qh.l4;
import qh.ma;
import qh.n5;
import qh.s6;
import qh.w8;
import qh.x7;
import qh.xa;
import qh.y4;
import qh.y8;
import qh.ya;
import wh.r3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i10, Object obj, Object obj2) {
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
                y1 y1Var = (y1) obj3;
                b1 b1Var = (b1) obj;
                y1Var.getClass();
                ((f1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = y1Var.e;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(b1Var);
                    break;
                } else {
                    af.g.s(y1Var.getParentActivity(), b1Var.c);
                    break;
                }
            case 1:
                h2 h2Var = (h2) obj3;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new o71(h2Var, (g2) obj2, (Bitmap) obj, 8));
                break;
            case 2:
                qh.w1 w1Var = (qh.w1) obj3;
                xa xaVar = (xa) obj;
                w1Var.getClass();
                qh.u1 u1Var = ((qh.u1[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(xaVar == null ? "🌤" : xaVar.c);
                sb.append(" ");
                sb.append(xaVar == null ? ya.b() ? "24°C" : "72°F" : xaVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString(), w1Var.b.getFontMetricsInt(), false);
                qh.w1 w1Var2 = u1Var.o;
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
                f9 f9Var = (f9) obj3;
                ba baVar = (ba) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - baVar.getBottomPadding2(), f9Var.q2 - baVar.getPaddingUnderContainer()));
                f9Var.S();
                if (max > 0) {
                    eg.j jVar = f9Var.G0;
                    if ((jVar instanceof z3) && ((z3) jVar).getEditText().isFocused()) {
                        z4 = true;
                        animatorSet = f9Var.K1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        f9Var.K1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        r2 r2Var = f9Var.a1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(r2Var, (Property<r2, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(f9Var.Q0, (Property<y4, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        eg.i0 i0Var = f9Var.T0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property2, !z4 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(f9Var.y0, (Property<eg.d2, Float>) property2, (z4 || f9Var.y1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(f9Var.x0, (Property<eg.z1, Float>) property2, (z4 || f9Var.y1) ? 1.0f : 0.0f));
                        f9Var.T0();
                        f9Var.K1.playTogether(arrayList);
                        if (z4) {
                            f9Var.K1.setDuration(350L);
                            f9Var.K1.setInterpolator(pr.h);
                        } else {
                            f9Var.K1.setDuration(250L);
                            f9Var.K1.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        }
                        f9Var.K1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z4 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z4 ? pr.h : org.telegram.ui.ActionBar.r1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z4) {
                            f9Var.P0(false);
                        }
                        if (f9Var.e2 != z4) {
                            f9Var.g0();
                        }
                        f9Var.e2 = z4;
                        break;
                    }
                }
                z4 = false;
                animatorSet = f9Var.K1;
                if (animatorSet != null) {
                }
                f9Var.K1 = new AnimatorSet();
                arrayList = new ArrayList();
                r2 r2Var2 = f9Var.a1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(r2Var2, (Property<r2, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(f9Var.Q0, (Property<y4, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                eg.i0 i0Var2 = f9Var.T0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(i0Var2, (Property<eg.i0, Float>) property22, !z4 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f9Var.y0, (Property<eg.d2, Float>) property22, (z4 || f9Var.y1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(f9Var.x0, (Property<eg.z1, Float>) property22, (z4 || f9Var.y1) ? 1.0f : 0.0f));
                f9Var.T0();
                f9Var.K1.playTogether(arrayList);
                if (z4) {
                }
                f9Var.K1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z4) {
                }
                if (f9Var.e2 != z4) {
                }
                f9Var.e2 = z4;
                break;
            case 4:
                b5 b5Var = (b5) obj3;
                l4 l4Var = (l4) obj2;
                xa xaVar2 = (xa) obj;
                if (xaVar2 != null) {
                    l4Var.dismiss();
                    b5Var.z0(false);
                    b5Var.d0(b5Var.p0(xaVar2));
                    break;
                }
                break;
            case 5:
                b5 b5Var2 = (b5) obj3;
                eg.g1 g1Var = (eg.g1) obj2;
                eg.d1 d1Var = (eg.d1) obj;
                if (g1Var != null) {
                    int i15 = b5Var2.C1;
                    g1Var.r0 = d1Var;
                    g1Var.n0.b(i15, d1Var, false);
                    g1Var.m();
                    b5Var2.d0(g1Var);
                    break;
                } else {
                    b5Var2.d0(b5Var2.i0(d1Var));
                    break;
                }
            case 6:
                x7 x7Var = (x7) obj3;
                ((q70) obj2).u();
                x7Var.g(true);
                d8 d8Var = x7Var.T;
                h8 h8Var = d8Var.U;
                if (h8Var != null) {
                    h8Var.run(new HashSet(d8Var.v));
                    break;
                }
                break;
            case 7:
                x7 x7Var2 = (x7) obj3;
                x7Var2.T.D = true;
                ((lr[]) obj2)[0].dismiss();
                x7Var2.g(true);
                break;
            case 8:
                y8 y8Var = (y8) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                ca caVar = y8Var.a;
                boolean q02 = caVar.q0();
                int i16 = caVar.c;
                if (q02) {
                    try {
                        caVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                caVar.M1 = false;
                n5 n5Var = caVar.z0;
                if (n5Var != null) {
                    n5Var.c(false);
                }
                if (caVar.D1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(caVar.D1.getAbsolutePath(), options);
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
                        s6 m9 = s6.m(r11, caVar.D1);
                        m9.J0 = caVar.s0;
                        m9.K0 = caVar.t0;
                        if (caVar.x0.j()) {
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
                    s6 m92 = s6.m(i17, caVar.D1);
                    m92.J0 = caVar.s0;
                    m92.K0 = caVar.t0;
                    if (caVar.x0.j()) {
                        caVar.H1 = m92;
                        f8.a(i16, m92);
                        caVar.I1 = false;
                        if (callback2 != null) {
                            callback2.run(new w8(y8Var, 2));
                            break;
                        } else {
                            caVar.K(1, true);
                            break;
                        }
                    } else {
                        caVar.D1 = null;
                        if (caVar.x0.l(m92)) {
                            s6 a10 = s6.a(caVar.x0.getLayout(), caVar.x0.getContent());
                            caVar.H1 = a10;
                            f8.a(i16, a10);
                            caVar.I1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        caVar.m0(true);
                        break;
                    }
                }
                break;
            case 9:
                ha haVar = (ha) obj2;
                Float f10 = (Float) obj;
                haVar.i = f10.floatValue();
                ga gaVar = ((ma) obj3).a;
                if (gaVar != null) {
                    gaVar.W(f10.floatValue(), haVar.a);
                    break;
                }
                break;
            case 10:
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
            case 11:
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
            case 12:
                ((File[]) obj3)[0] = (File) obj;
                ((t70) obj2).run();
                break;
            case 13:
                ((sh.k2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 14:
                th.g gVar = (th.g) obj3;
                gVar.getClass();
                gVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 15:
                th.g gVar2 = (th.g) obj3;
                gVar2.getClass();
                gVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 16:
                th.i0 i0Var3 = (th.i0) obj3;
                i0Var3.V((TLRPC.Chat) obj2, i0Var3.e, ((Boolean) obj).booleanValue());
                break;
            case 17:
                View view = (View) obj3;
                vf.n nVar = (vf.n) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(nVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 18:
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
                    messagesStorage.getStorageQueue().postRunnable(new yx0(f11, messagesStorage, o1Var, tL_messages_sendQuickReplyMessages, 25));
                }
                miVar.dismiss();
                break;
            case 19:
                vf.x0.W((vf.x0) obj3, (View) obj2, (String) obj);
                break;
            case 20:
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
                    r3Var.R1(pageblockmath2);
                    break;
                }
            case 21:
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
            case 22:
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
                    z1Var.M.R1(pageblockmath4);
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
