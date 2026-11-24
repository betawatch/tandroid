// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tv2 implements Runnable {
    public final /* synthetic */ xv2 a;

    public tv2(xv2 xv2Var) {
        this.a = xv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0d09  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i3;
        boolean z;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        int i4;
        String L0;
        int min;
        vv2 vv2Var;
        vv2 vv2Var2;
        TLRPC.InputStickerSet inputStickerSet;
        int i5;
        String str;
        boolean z2;
        int i6;
        rkb rkbVar;
        byte b;
        cs5 F;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        xv2 xv2Var = this.a;
        kl0 kl0Var = xv2Var.t;
        if (xv2Var.w == null || xv2Var.m) {
            return;
        }
        xv2Var.R = true;
        vv2 vv2Var3 = xv2Var.l;
        if (vv2Var3 != null && (F = vv2Var3.F(xv2Var.z)) != null) {
            F.R(kl0Var, nod.k(xv2Var.c0), true);
            F.t = false;
            F.Z();
            F.p = new mk2(this, (byte) 10);
            ViewGroup viewGroup = F.A;
            ov2 ov2Var = new ov2(this, viewGroup);
            xv2Var.k = ov2Var;
            ov2Var.e = true;
            ov2Var.c = (short) 150;
            ov2Var.g = true;
            ov2Var.setOutsideTouchable(true);
            xv2Var.k.setClippingEnabled(true);
            xv2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
            xv2Var.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
            xv2Var.k.setInputMethodMode(2);
            xv2Var.k.getContentView().setFocusableInTouchMode(true);
            io5 io5Var = xv2Var.q;
            int min2 = (Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - (io5Var.d + io5Var.b)) - gl.L(40.0f)) / 2;
            int L = (int) ((gl.L(24.0f) - xv2Var.e) + ((int) (xv2Var.e + Math.max(r2 + min2 + (xv2Var.G != null ? gl.L(40.0f) : 0), ((xv2Var.z.getHeight() - r3) - xv2Var.I) / 2) + min2)));
            xv2Var.k.showAtLocation(xv2Var.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                xv2Var.z.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            float f = xv2Var.e;
            if (f != 0.0f) {
                xv2Var.f = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final byte b2 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mv2
                    public final /* synthetic */ tv2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b2;
                        tv2 tv2Var = this.b;
                        switch (b3) {
                            case 0:
                                xv2 xv2Var2 = tv2Var.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xv2Var2.g = floatValue;
                                float f2 = xv2Var2.f;
                                xv2Var2.e = tb4.A(0.0f, f2, floatValue, f2);
                                xv2Var2.z.invalidate();
                                break;
                            case 1:
                                xv2 xv2Var3 = tv2Var.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xv2Var3.g = floatValue2;
                                float f3 = xv2Var3.f;
                                xv2Var3.e = tb4.A(0.0f, f3, floatValue2, f3);
                                xv2Var3.z.invalidate();
                                break;
                            default:
                                xv2 xv2Var4 = tv2Var.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xv2Var4.g = floatValue3;
                                float f4 = xv2Var4.f;
                                xv2Var4.e = tb4.A(0.0f, f4, floatValue3, f4);
                                xv2Var4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(s33.f);
                ofFloat.start();
            }
            xv2Var.K = true;
            return;
        }
        byte b3 = 0;
        if (xv2Var.V != 3) {
            vv2 vv2Var4 = xv2Var.l;
            if (vv2Var4 != null) {
                TLRPC.TL_messageMediaPoll d = vv2Var4.d();
                TLRPC.PollAnswer g = xv2Var.l.g();
                if (d != null && d.poll != null && g != null) {
                    TLRPC.PollAnswerVoters E1 = k27.E1(d, g.option);
                    if (E1 != null && E1.voters > 0) {
                        k27.A(d);
                    }
                }
            }
            i = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, xv2Var.c0, xv2Var.z.getContext());
            wjb wjbVar = null;
            il0 c = kl0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c.p(nod.k(xv2Var.c0));
            ug8.r(c, gl.L(12.0f), 8.0f);
            c.S.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c);
            i2 = xv2Var.V;
            if (i2 != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv2Var.T;
                int i7 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    vv2 vv2Var5 = xv2Var.l;
                    if (vv2Var5 == null || !vv2Var5.x()) {
                        if (xv2Var.l.t()) {
                            b00.s(null, 2131745396, arrayList, arrayList3, valueOf4);
                            arrayList2.add(0);
                        }
                        b00.r(null, 2131754371, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        b00.r(null, 2131745332, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                vv2 vv2Var6 = xv2Var.l;
                if (vv2Var6 == null || !vv2Var6.x()) {
                    vv2 vv2Var7 = xv2Var.l;
                    arrayList.add(k96.M0((vv2Var7 == null || !vv2Var7.K()) ? 2131754367 : 2131744612, null));
                    vv2 vv2Var8 = xv2Var.l;
                    if (vv2Var8 != null && vv2Var8.K()) {
                        i7 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i7));
                    arrayList2.add(2);
                }
                a8 a8Var = new a8(0, xv2Var.c0, xv2Var.w, true, false);
                a8Var.setItemHeight(44);
                a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
                a8Var.getTextView().setPadding(k96.a0 ? 0 : gl.L(40.0f), 0, k96.a0 ? gl.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(xv2Var.z.getContext());
                LinearLayout linearLayout = new LinearLayout(xv2Var.z.getContext());
                zkb.h(bkb.F8, xv2Var.c0, linearLayout);
                linearLayout.setOrientation(1);
                if (xv2Var.w == null) {
                    rkbVar = null;
                    b = 1;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(xv2Var.r).sendRequest(tL_messages_getMyStickers, new en0((Object) xv2Var, (Object) arrayList4, (Object) tL_messages_getMyStickers, (byte) 20));
                    rkbVar = new rkb(xv2Var.w, wjbVar, (byte) 4);
                    rkbVar.setLayoutManager(new t26());
                    b = 1;
                    rkbVar.i(new kr(arrayList4, b));
                    rkbVar.setAdapter(new uv2(xv2Var, arrayList4));
                }
                rkbVar.setOnItemClickListener(new u(this, (byte) 16));
                frameLayout.addView(a8Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new j8(xv2Var.z.getContext(), xv2Var.c0), nme.o(-1, 8));
                boolean z3 = b;
                ng ngVar = new ng(this, arrayList2, rkbVar, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, (byte) 7);
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i8)).intValue(), (CharSequence) arrayList.get(i8), false, xv2Var.c0);
                    c2.setTag(Integer.valueOf(i8));
                    c2.setOnClickListener(ngVar);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(rkbVar, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() - gl.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.b(linearLayout);
                frameLayout.setOnClickListener(new zl1(actionBarPopupWindow$ActionBarPopupWindowLayout3, (byte) 2));
                io5 io5Var2 = xv2Var.q;
                int i9 = io5Var2.d + io5Var2.b;
                int min3 = ((int) (Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - i9) / 1.8f)) / 2;
                xv2Var.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout3, nme.d(-2, -2.0f, 49, 0.0f, (gl.L(84.0f) + ((int) ((xv2Var.e + Math.max(r0 + min3, ((xv2Var.z.getHeight() - i9) - xv2Var.I) / 2)) + min3))) / gl.p, 0.0f, 0.0f));
                xv2Var.L = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout3.setTranslationY(-gl.L(12.0f));
                xv2Var.L.setAlpha(0.0f);
                xv2Var.L.setScaleX(0.8f);
                xv2Var.L.setScaleY(0.8f);
                xv2Var.L.setPivotY(0.0f);
                xv2Var.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                xv2Var.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33.h).start();
                if (xv2Var.P == null) {
                    u11 u11Var = new u11(xv2Var, xv2Var.z.getContext(), y6c.t0, xv2Var.c0);
                    xv2Var.P = u11Var;
                    u11Var.O0 = z3;
                    u11Var.setPadding(0, gl.L(22.0f), 0, gl.L(22.0f));
                    xv2Var.P.setClipChildren(false);
                    xv2Var.P.setClipToPadding(false);
                    xv2Var.P.setVisibility(0);
                    xv2Var.P.setHint(k96.M0(2131744611, null));
                    xv2Var.P.setBubbleOffset(-gl.L(105.0f));
                    xv2Var.P.setMiniBubblesOffset(-gl.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(xv2Var.z.getContext());
                    xv2Var.Q = frameLayout2;
                    frameLayout2.addView(xv2Var.P, nme.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    xv2Var.z.addView(xv2Var.Q, nme.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                xv2Var.P.setSelectedEmojis(xv2Var.o);
                xv2Var.P.setDelegate(new jv2(xv2Var));
                xv2Var.P.m(null, null, false);
                xv2Var.Q.setScaleY(0.6f);
                xv2Var.Q.setScaleX(0.6f);
                xv2Var.Q.setAlpha(0.0f);
                gl.e3(new iv2(xv2Var, (byte) 2), 10L);
                xv2Var.K = true;
                xv2Var.z.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                i4 = 0;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                if (i2 != 0) {
                    if (i2 != 2 || xv2Var.l == null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        i3 = 0;
                        if (xv2Var.l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (xv2Var.l.j(xv2Var.V) && !xv2Var.l.c()) {
                                oo1.p(2131745431, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                            if (xv2Var.l.j(xv2Var.V) && !xv2Var.l.c()) {
                                oo1.p(2131745391, arrayList5, arrayList7, valueOf3);
                                arrayList6.add(4);
                            }
                            if (xv2Var.l.b()) {
                                oo1.p(2131745668, arrayList5, arrayList7, valueOf2);
                                arrayList6.add(3);
                            }
                            TLRPC.Document document = xv2Var.W;
                            if (document != null && xv2Var.l.e(document)) {
                                arrayList6.add(oo1.l(2131754482, arrayList5, R.drawable.outline_caption_24, arrayList7, 11));
                            }
                            if (xv2Var.W != null) {
                                hq6 d0 = hq6.d0(xv2Var.r);
                                TLRPC.Document document2 = xv2Var.W;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= d0.j0.size()) {
                                        z = false;
                                        break;
                                    }
                                    TLRPC.Document document3 = (TLRPC.Document) d0.j0.get(i10);
                                    if (document3.id == document2.id) {
                                        d0.j0.remove(i10);
                                        d0.j0.add(0, document3);
                                        z = true;
                                        break;
                                    }
                                    i10++;
                                }
                                if (z) {
                                    arrayList5.add(k96.Y(2131751586, "Delete", new Object[0]));
                                    arrayList7.add(valueOf5);
                                    arrayList6.add(1);
                                } else {
                                    arrayList5.add(k96.Y(2131745738, "SaveToGIFs", new Object[0]));
                                    arrayList7.add(Integer.valueOf(R.drawable.msg_gif_add));
                                    arrayList6.add(2);
                                }
                            } else {
                                z = false;
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            xv2Var.K = true;
                            xv2Var.z.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                                iArr[i11] = ((Integer) arrayList7.get(i11)).intValue();
                            }
                            kb1 kb1Var = new kb1((Object) this, (Object) arrayList6, (byte) 23);
                            int i12 = 0;
                            while (i12 < arrayList5.size()) {
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                                a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, ((Integer) arrayList7.get(i12)).intValue(), (CharSequence) arrayList5.get(i12), false, xv2Var.c0);
                                c3.setTag(Integer.valueOf(i12));
                                c3.setOnClickListener(kb1Var);
                                if (z && i12 == arrayList5.size() - 1) {
                                    c3.c(bkb.p7, bkb.o7);
                                }
                                i12++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                            sv2 sv2Var = new sv2(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            xv2Var.k = sv2Var;
                            sv2Var.e = true;
                            sv2Var.c = (short) 150;
                            sv2Var.g = true;
                            sv2Var.setOutsideTouchable(true);
                            xv2Var.k.setClippingEnabled(true);
                            xv2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                            xv2Var.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                            xv2Var.k.setInputMethodMode(2);
                            xv2Var.k.getContentView().setFocusableInTouchMode(true);
                            io5 io5Var3 = xv2Var.q;
                            int min4 = (Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - (io5Var3.d + io5Var3.b)) - gl.L(40.0f)) / 2;
                            int L2 = (int) ((gl.L(24.0f) - xv2Var.e) + ((int) (xv2Var.e + Math.max(r0 + min4 + (xv2Var.G != null ? gl.L(40.0f) : 0), ((xv2Var.z.getHeight() - r2) - xv2Var.I) / 2) + min4)));
                            i4 = 0;
                            xv2Var.k.showAtLocation(xv2Var.z, 0, (int) ((r3.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), L2);
                            try {
                                xv2Var.z.performHapticFeedback(0);
                            } catch (Exception unused2) {
                            }
                            float f2 = xv2Var.e;
                            if (f2 != 0.0f) {
                                xv2Var.f = f2;
                                final byte b4 = 2;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mv2
                                    public final /* synthetic */ tv2 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        byte b32 = b4;
                                        tv2 tv2Var = this.b;
                                        switch (b32) {
                                            case 0:
                                                xv2 xv2Var2 = tv2Var.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xv2Var2.g = floatValue;
                                                float f22 = xv2Var2.f;
                                                xv2Var2.e = tb4.A(0.0f, f22, floatValue, f22);
                                                xv2Var2.z.invalidate();
                                                break;
                                            case 1:
                                                xv2 xv2Var3 = tv2Var.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xv2Var3.g = floatValue2;
                                                float f3 = xv2Var3.f;
                                                xv2Var3.e = tb4.A(0.0f, f3, floatValue2, f3);
                                                xv2Var3.z.invalidate();
                                                break;
                                            default:
                                                xv2 xv2Var4 = tv2Var.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xv2Var4.g = floatValue3;
                                                float f4 = xv2Var4.f;
                                                xv2Var4.e = tb4.A(0.0f, f4, floatValue3, f4);
                                                xv2Var4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(s33.f);
                                ofFloat2.start();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (xv2Var.l.j(xv2Var.V)) {
                            oo1.p(2131745434, arrayList8, arrayList10, valueOf4);
                            arrayList9.add(0);
                        }
                        Boolean R = xv2Var.l.R(xv2Var.W);
                        if (R != null) {
                            if (R.booleanValue()) {
                                oo1.p(2131745354, arrayList8, arrayList10, valueOf);
                                arrayList9.add(1);
                            } else {
                                oo1.p(2131746095, arrayList8, arrayList10, valueOf);
                                arrayList9.add(2);
                            }
                        }
                        if (xv2Var.l.A(xv2Var.W)) {
                            arrayList8.add(k96.L0(2131751752));
                            arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                            arrayList9.add(3);
                        }
                        if (xv2Var.l.O(xv2Var.W)) {
                            oo1.p(2131746118, arrayList8, arrayList10, valueOf5);
                            arrayList9.add(4);
                        }
                        boolean C0 = hq6.d0(xv2Var.r).C0(xv2Var.W);
                        if (!k27.H2(xv2Var.W) && !k27.E3(xv2Var.W)) {
                            if (C0) {
                                L0 = k96.L0(2131751526);
                            } else if (hq6.d0(xv2Var.r).u() && k27.u4(xv2Var.W)) {
                                L0 = k96.L0(2131754371);
                            }
                            arrayList8.add(L0);
                            arrayList10.add(Integer.valueOf(C0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                            arrayList9.add(5);
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        xv2Var.K = true;
                        xv2Var.z.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i13 = 0; i13 < arrayList10.size(); i13++) {
                            iArr2[i13] = ((Integer) arrayList10.get(i13)).intValue();
                        }
                        nv2 nv2Var = new nv2(this, arrayList9, C0);
                        boolean a = xv2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout4);
                        int i14 = 0;
                        while (i14 < arrayList8.size()) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            a8 c4 = r7.c(!a && i14 == 0, i14 == arrayList8.size() + (-1), actionBarPopupWindow$ActionBarPopupWindowLayout7, ((Integer) arrayList10.get(i14)).intValue(), (CharSequence) arrayList8.get(i14), false, xv2Var.c0);
                            if (((Integer) arrayList9.get(i14)).intValue() == 4) {
                                c4.c(bkb.p7, bkb.o7);
                            }
                            c4.setTag(Integer.valueOf(i14));
                            c4.setOnClickListener(nv2Var);
                            i14++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        rv2 rv2Var = new rv2(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        xv2Var.k = rv2Var;
                        rv2Var.e = true;
                        rv2Var.c = (short) 150;
                        rv2Var.g = true;
                        rv2Var.setOutsideTouchable(true);
                        xv2Var.k.setClippingEnabled(true);
                        xv2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                        xv2Var.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                        xv2Var.k.setInputMethodMode(2);
                        xv2Var.k.getContentView().setFocusableInTouchMode(true);
                        io5 io5Var4 = xv2Var.q;
                        int min5 = (Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - (io5Var4.d + io5Var4.b)) - gl.L(40.0f)) / 2;
                        int L3 = (int) ((gl.L(24.0f) - xv2Var.e) + ((int) (xv2Var.e + Math.max(r0 + min5 + (xv2Var.G != null ? gl.L(40.0f) : 0), ((xv2Var.z.getHeight() - r2) - xv2Var.I) / 2) + min5)));
                        m8 m8Var = xv2Var.k;
                        st stVar = xv2Var.z;
                        i3 = 0;
                        m8Var.showAtLocation(stVar, 0, (int) ((stVar.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L3);
                        m8.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                        try {
                            xv2Var.z.performHapticFeedback(0);
                        } catch (Exception unused3) {
                        }
                        float f3 = xv2Var.e;
                        if (f3 != 0.0f) {
                            xv2Var.f = f3;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final byte b5 = 1;
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mv2
                                public final /* synthetic */ tv2 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b32 = b5;
                                    tv2 tv2Var = this.b;
                                    switch (b32) {
                                        case 0:
                                            xv2 xv2Var2 = tv2Var.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xv2Var2.g = floatValue;
                                            float f22 = xv2Var2.f;
                                            xv2Var2.e = tb4.A(0.0f, f22, floatValue, f22);
                                            xv2Var2.z.invalidate();
                                            break;
                                        case 1:
                                            xv2 xv2Var3 = tv2Var.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xv2Var3.g = floatValue2;
                                            float f32 = xv2Var3.f;
                                            xv2Var3.e = tb4.A(0.0f, f32, floatValue2, f32);
                                            xv2Var3.z.invalidate();
                                            break;
                                        default:
                                            xv2 xv2Var4 = tv2Var.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xv2Var4.g = floatValue3;
                                            float f4 = xv2Var4.f;
                                            xv2Var4.e = tb4.A(0.0f, f4, floatValue3, f4);
                                            xv2Var4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(s33.f);
                            ofFloat3.start();
                        }
                    }
                    i4 = i3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    if (k27.W3(xv2Var.W) && !y6c.h(j5.a(xv2Var.r).a).p()) {
                        if (xv2Var.O == null) {
                            zg8 zg8Var = new zg8(xv2Var.z.getContext(), xv2Var.c0);
                            xv2Var.O = zg8Var;
                            xv2Var.z.addView(zg8Var, nme.c(-1.0f, -1));
                            xv2Var.O.setOnClickListener(new kv2(xv2Var, b3));
                            z2 = true;
                            xv2Var.O.b.w.setOnClickListener(new kv2(xv2Var, 1 == true ? 1 : 0));
                        } else {
                            z2 = true;
                        }
                        gl.U3(xv2Var.O, false, 1.0f, z2, false);
                        gl.S3(xv2Var.O, z2);
                        xv2Var.O.setTranslationY(0.0f);
                        xv2Var.K = true;
                        xv2Var.z.invalidate();
                        try {
                            xv2Var.z.performHapticFeedback(0);
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    boolean C02 = hq6.d0(xv2Var.r).C0(xv2Var.W);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    vv2 vv2Var9 = xv2Var.l;
                    if (vv2Var9 != null) {
                        if (vv2Var9.j(xv2Var.V) && !xv2Var.l.c()) {
                            b00.s(null, 2131745396, arrayList11, arrayList13, valueOf4);
                            arrayList12.add(0);
                        }
                        if (!xv2Var.l.j(xv2Var.V) || xv2Var.l.c()) {
                            str = null;
                        } else {
                            str = null;
                            b00.s(null, 2131745391, arrayList11, arrayList13, valueOf3);
                            arrayList12.add(6);
                        }
                        if (xv2Var.l.b()) {
                            b00.s(str, 2131745668, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        if (xv2Var.l.f()) {
                            b00.s(str, 2131749035, arrayList11, arrayList13, valueOf5);
                            arrayList12.add(5);
                        }
                    }
                    if (!k27.E3(xv2Var.W)) {
                        if (!C02) {
                            i5 = (hq6.d0(xv2Var.r).u() && k27.u4(xv2Var.W)) ? 2131754371 : 2131751526;
                        }
                        arrayList11.add(k96.M0(i5, null));
                        arrayList13.add(Integer.valueOf(C02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList12.add(2);
                    }
                    vv2 vv2Var10 = xv2Var.l;
                    if (vv2Var10 != null && (inputStickerSet = xv2Var.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && vv2Var10.S()) {
                        arrayList11.add(k96.a0(null, null, 2131743306, new Object[0]));
                        arrayList13.add(Integer.valueOf(R.drawable.msg_media));
                        arrayList12.add(1);
                    }
                    if (xv2Var.p) {
                        b00.s(null, 2131751525, arrayList11, arrayList13, valueOf5);
                        arrayList12.add(4);
                    }
                    if (xv2Var.a0 != null && xv2Var.W != null) {
                        TLRPC.TL_messages_stickerSet n0 = hq6.d0(xv2Var.r).n0(xv2Var.a0, true);
                        if (n0 != null && (vv2Var2 = xv2Var.l) != null && vv2Var2.z()) {
                            TLRPC.StickerSet stickerSet = n0.set;
                            if (!stickerSet.emojis && !stickerSet.masks) {
                                b00.r(null, 2131751211, arrayList11, R.drawable.msg_edit, arrayList13);
                                arrayList12.add(7);
                            }
                        }
                        if (n0 != null && n0.set.creator && (vv2Var = xv2Var.l) != null && vv2Var.E()) {
                            b00.s(null, 2131751483, arrayList11, arrayList13, valueOf5);
                            arrayList12.add(8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    xv2Var.K = true;
                    xv2Var.z.invalidate();
                    pv2 pv2Var = new pv2(this, arrayList12, C02);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    xv2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout8);
                    int i15 = 0;
                    while (i15 < arrayList11.size()) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout9, ((Integer) arrayList13.get(i15)).intValue(), (CharSequence) arrayList11.get(i15), false, xv2Var.c0);
                        c5.setTag(Integer.valueOf(i15));
                        c5.setOnClickListener(pv2Var);
                        if (((Integer) arrayList12.get(i15)).intValue() == 8) {
                            int i16 = bkb.p7;
                            c5.c(i16, i16);
                            c5.h(0.1f, i16);
                        }
                        i15++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                    qv2 qv2Var = new qv2(this, actionBarPopupWindow$ActionBarPopupWindowLayout10);
                    xv2Var.k = qv2Var;
                    qv2Var.e = true;
                    qv2Var.c = (short) 100;
                    qv2Var.g = true;
                    qv2Var.setOutsideTouchable(true);
                    xv2Var.k.setClippingEnabled(true);
                    xv2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                    xv2Var.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout10.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                    xv2Var.k.setInputMethodMode(2);
                    xv2Var.k.getContentView().setFocusableInTouchMode(true);
                    io5 io5Var5 = xv2Var.q;
                    int i17 = io5Var5.d + io5Var5.b;
                    if (xv2Var.V == 1) {
                        min = Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - i17) - gl.L(40.0f);
                    } else {
                        boolean z4 = xv2Var.S;
                        st stVar2 = xv2Var.z;
                        min = (int) (z4 ? Math.min(stVar2.getWidth(), xv2Var.z.getHeight() - i17) - gl.N(40.0f) : Math.min(stVar2.getWidth(), xv2Var.z.getHeight() - i17) / 1.8f);
                    }
                    int L4 = gl.L(24.0f) + ((int) (xv2Var.e + Math.max(r0 + r2 + (xv2Var.G != null ? gl.L(40.0f) : 0), ((xv2Var.z.getHeight() - i17) - xv2Var.I) / 2) + (min / 2)));
                    if (xv2Var.S) {
                        L4 += gl.L(24.0f);
                    }
                    i4 = 0;
                    xv2Var.k.showAtLocation(xv2Var.z, 0, (int) ((r2.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout10.getMeasuredWidth()) / 2.0f), L4);
                    try {
                        xv2Var.z.performHapticFeedback(0);
                    } catch (Exception unused5) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                }
            }
            i6 = i4;
            while (i6 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i6);
                if (childAt instanceof a8) {
                    ((a8) childAt).n(i6 == 0 ? 1 : i4, i6 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1) ? 1 : i4);
                }
                i6++;
            }
        }
        i = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, xv2Var.c0, xv2Var.z.getContext());
        wjb wjbVar2 = null;
        il0 c6 = kl0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c6.p(nod.k(xv2Var.c0));
        ug8.r(c6, gl.L(12.0f), 8.0f);
        c6.S.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c6);
        i2 = xv2Var.V;
        if (i2 != 3) {
        }
        i6 = i4;
        while (i6 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
