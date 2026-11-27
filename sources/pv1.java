// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pv1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    private final void a(View view) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        int i = ChatActivityEnterView.X7;
        SharedPreferences.Editor edit = uc7.s1(chatActivityEnterView.R).X3.edit();
        if (pj0.d(chatActivityEnterView.E3.s8)) {
            edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView.E3.a(), false);
        } else {
            edit.putBoolean("show_gift_for_" + chatActivityEnterView.E3.a(), false);
        }
        if (uc7.s1(chatActivityEnterView.R).k4.K0.f && uc7.s1(chatActivityEnterView.R).k4.J0.f) {
            edit.putBoolean("show_gift_for_" + chatActivityEnterView.E3.a(), false);
        }
        edit.apply();
        TLRPC.UserFull Y1 = uc7.s1(chatActivityEnterView.R).Y1(yac.h(chatActivityEnterView.R).e());
        if ((chatActivityEnterView.getParentFragment().s8 == null || !chatActivityEnterView.getParentFragment().s8.display_gifts_button) && (Y1 == null || !Y1.display_gifts_button)) {
            hl.R3(chatActivityEnterView.z2, false);
        }
        TLRPC.User h = chatActivityEnterView.getParentFragment().h();
        if (h == null) {
            return;
        }
        boolean z = chatActivityEnterView.getParentFragment().s8 != null && pj0.e(chatActivityEnterView.getParentFragment().s8.birthday);
        id idVar = new id(3, null, chatActivityEnterView.getContext());
        idVar.q(200L);
        idVar.setOnCancelListener(new gt0(chatActivityEnterView, on0.l(chatActivityEnterView.R, null, new wv1(chatActivityEnterView, idVar, h, z)), (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [d79, gu] */
    /* JADX WARN: Type inference failed for: r0v187, types: [xy1] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v28, types: [wma] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.tgnet.TLRPC$ChatFull] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ChatActivityEnterView.RecordCircle recordCircle;
        TLRPC.Peer peer;
        int i;
        int i2;
        byte b;
        ?? r17;
        ?? r16;
        boolean z;
        boolean z2;
        my1 my1Var;
        tx1 tx1Var;
        xy1 xy1Var;
        x59 x59Var;
        e29 e29Var;
        float f;
        int i3;
        int i4;
        float f2;
        float f3;
        knc kncVar;
        byte b2 = this.a;
        byte b3 = 19;
        int i5 = 0;
        ?? r3 = 0;
        byte b4 = 1;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b2) {
            case 0:
                int i6 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.j0() && chatActivityEnterView.u3 && (recordCircle = chatActivityEnterView.C2) != null && ChatActivityEnterView.this.j5) {
                    chatActivityEnterView.i0();
                    bn3 bn3Var = chatActivityEnterView.j1;
                    if (bn3Var == null || !bn3Var.s()) {
                        bn3 bn3Var2 = chatActivityEnterView.j1;
                        if (bn3Var2 != null && bn3Var2.r()) {
                            tx1 tx1Var2 = chatActivityEnterView.F0;
                            if (tx1Var2 != null) {
                                tx1Var2.setText("");
                            }
                            chatActivityEnterView.j1.o();
                        }
                    } else {
                        bn3 bn3Var3 = chatActivityEnterView.j1;
                        if (bn3Var3.p0 && bn3Var3.s()) {
                            bn3Var3.v();
                        }
                    }
                    if (chatActivityEnterView.u3) {
                        chatActivityEnterView.u3 = false;
                        chatActivityEnterView.X1 = 0L;
                        chatActivityEnterView.D2(2, true);
                        break;
                    }
                }
                break;
            case 1:
                int i7 = ChatActivityEnterView.X7;
                hb hbVar = chatActivityEnterView.V;
                if ((hbVar == null || !hbVar.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.O3.W0();
                    break;
                }
                break;
            case 2:
                int i8 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                zu1 zu1Var = chatActivityEnterView2.E3;
                if (!chatActivityEnterView2.T7 ? chatActivityEnterView2.getTranslationY() == 0.0f : !chatActivityEnterView2.U0()) {
                    if (chatActivityEnterView2.O3.j() > hl.L(20.0f)) {
                        int E0 = chatActivityEnterView2.O3.E0();
                        int j = chatActivityEnterView2.O3.j();
                        if (j <= hl.L(20.0f)) {
                            E0 += j;
                        }
                        if (chatActivityEnterView2.X0) {
                            E0 -= chatActivityEnterView2.getEmojiPadding();
                        }
                        if (E0 < hl.L(200.0f)) {
                            chatActivityEnterView2.v0 = new mv1(chatActivityEnterView2, (byte) 17);
                            chatActivityEnterView2.U();
                            break;
                        }
                    }
                    if (chatActivityEnterView2.O3.y() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ix1 ix1Var = chatActivityEnterView2.r0;
                        if (ix1Var != null) {
                            ix1Var.e = false;
                            ix1Var.l(new vpa[0]);
                            break;
                        } else {
                            uc7 s1 = uc7.s1(chatActivityEnterView2.R);
                            if (chatActivityEnterView2.T7) {
                                peer = chatActivityEnterView2.O3.k();
                            } else {
                                uc7.s1(chatActivityEnterView2.R).M0(Long.valueOf(-chatActivityEnterView2.F3));
                                ?? N0 = uc7.s1(chatActivityEnterView2.R).N0(-chatActivityEnterView2.F3);
                                r14 = N0;
                                peer = N0 != 0 ? N0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView2.O3.y() != null && !chatActivityEnterView2.O3.y().peers.isEmpty()) {
                                peer = chatActivityEnterView2.O3.y().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = xc2.V(s1.M0(Long.valueOf(-chatActivityEnterView2.F3)));
                            if (chatActivityEnterView2.T7) {
                            } else {
                                zu1Var.getParentLayout().getOverlayContainerView();
                            }
                            ix1 ix1Var2 = new ix1(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.E3, s1, V, peer2, chatActivityEnterView2.O3.y(), new ie(chatActivityEnterView2, r14, s1, b3), chatActivityEnterView2.K4);
                            chatActivityEnterView2.r0 = ix1Var2;
                            ix1Var2.e = true;
                            ix1Var2.c = (short) 220;
                            ix1Var2.setOutsideTouchable(true);
                            chatActivityEnterView2.r0.setClippingEnabled(true);
                            chatActivityEnterView2.r0.setFocusable(true);
                            chatActivityEnterView2.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView2.r0.setInputMethodMode(2);
                            chatActivityEnterView2.r0.setSoftInputMode(0);
                            chatActivityEnterView2.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView2.r0.b = false;
                            int i9 = -hl.L(4.0f);
                            int[] iArr = new int[2];
                            if (!hl.O1() || zu1Var == null) {
                                i = i9;
                            } else {
                                zu1Var.getFragmentView().getLocationInWindow(iArr);
                                i = iArr[0] + i9;
                            }
                            int E02 = chatActivityEnterView2.O3.E0();
                            int measuredHeight = chatActivityEnterView2.r0.getContentView().getMeasuredHeight();
                            int j2 = chatActivityEnterView2.O3.j();
                            if (j2 <= hl.L(20.0f)) {
                                E02 += j2;
                            }
                            if (chatActivityEnterView2.X0) {
                                E02 -= chatActivityEnterView2.getEmojiPadding();
                            }
                            if (measuredHeight < (((i9 << 1) + E02) - ((zu1Var == null || !zu1Var.isInBubbleMode()) ? hl.m : 0)) - chatActivityEnterView2.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView2.getLocationInWindow(iArr);
                                i2 = ((iArr[1] - measuredHeight) - i9) - hl.L(2.0f);
                            } else {
                                int i10 = (zu1Var == null || !zu1Var.isInBubbleMode()) ? hl.m : 0;
                                chatActivityEnterView2.r0.o.getLayoutParams().height = ((E02 - i10) - hl.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                                i2 = i10;
                            }
                            final ix1 ix1Var3 = chatActivityEnterView2.r0;
                            View view2 = ix1Var3.u;
                            d79 d79Var = ix1Var3.v;
                            TLRPC.Peer peer3 = ix1Var3.r;
                            v7a v7aVar = ix1Var3.o;
                            d26 d26Var = ix1Var3.t;
                            ArrayList arrayList = ix1Var3.z;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                ((vpa) obj).d();
                            }
                            arrayList.clear();
                            d26Var.setPivotX(hl.L(8.0f));
                            d26Var.setPivotY(d26Var.getMeasuredHeight() - hl.L(8.0f));
                            v7aVar.setPivotX(0.0f);
                            v7aVar.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = ix1Var3.s.peers;
                            if (peer3 != null) {
                                int L = hl.L(54.0f);
                                r17 = 3;
                                int size2 = arrayList2.size() * L;
                                b = 1;
                                r16 = 2;
                                int i12 = 0;
                                while (i12 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i12).peer;
                                    View view3 = view2;
                                    d79 d79Var2 = d79Var;
                                    long j3 = peer4.channel_id;
                                    if (j3 == 0 || j3 != peer3.channel_id) {
                                        long j4 = peer4.user_id;
                                        if (j4 == 0 || j4 != peer3.user_id) {
                                            long j5 = peer4.chat_id;
                                            if (j5 == 0 || j5 != peer3.chat_id) {
                                                i12++;
                                                view2 = view3;
                                                d79Var = d79Var2;
                                            }
                                        }
                                    }
                                    ix1Var3.w.g1(i12, (size2 - ((arrayList2.size() - 2) * L)) + hl.L(7.0f) + ((i12 == arrayList2.size() + (-1) || d79Var2.getMeasuredHeight() >= size2) ? 0 : d79Var2.getMeasuredHeight() % L));
                                    if (d79Var2.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                b = 1;
                                r17 = 3;
                                r16 = 2;
                            }
                            d26Var.setScaleX(0.25f);
                            d26Var.setScaleY(0.25f);
                            v7aVar.setAlpha(0.25f);
                            vpa vpaVar = new vpa(d26Var, vpa.q);
                            vpaVar.m = bp1.j(1.0f, 750.0f, 1.0f);
                            final byte b5 = 0;
                            vpaVar.b(new qs3() { // from class: t7a
                                @Override // qs3
                                public final void a(vpa vpaVar2, float f4, float f5) {
                                    byte b6 = b5;
                                    ix1 ix1Var4 = ix1Var3;
                                    switch (b6) {
                                        case 0:
                                            ix1Var4.o.setScaleX(1.0f / f4);
                                            break;
                                        default:
                                            ix1Var4.o.setScaleY(1.0f / f4);
                                            break;
                                    }
                                }
                            });
                            vpa vpaVar2 = new vpa(d26Var, vpa.r);
                            vpaVar2.m = bp1.j(1.0f, 750.0f, 1.0f);
                            final byte b6 = b;
                            vpaVar2.b(new qs3() { // from class: t7a
                                @Override // qs3
                                public final void a(vpa vpaVar22, float f4, float f5) {
                                    byte b62 = b6;
                                    ix1 ix1Var4 = ix1Var3;
                                    switch (b62) {
                                        case 0:
                                            ix1Var4.o.setScaleX(1.0f / f4);
                                            break;
                                        default:
                                            ix1Var4.o.setScaleY(1.0f / f4);
                                            break;
                                    }
                                }
                            });
                            os3 os3Var = vpa.v;
                            vpa vpaVar3 = new vpa(d26Var, os3Var);
                            vpaVar3.m = bp1.j(1.0f, 750.0f, 1.0f);
                            vpa vpaVar4 = new vpa(v7aVar, os3Var);
                            vpaVar4.m = bp1.j(1.0f, 750.0f, 1.0f);
                            vpa[] vpaVarArr = new vpa[4];
                            vpaVarArr[0] = vpaVar;
                            vpaVarArr[1] = vpaVar2;
                            vpaVarArr[r16] = vpaVar3;
                            vpaVarArr[r17] = vpaVar4;
                            for (vpa vpaVar5 : Arrays.asList(vpaVarArr)) {
                                arrayList.add(vpaVar5);
                                vpaVar5.a(new x11(ix1Var3, vpaVar5, (byte) 7));
                                vpaVar5.h();
                            }
                            ix1 ix1Var4 = chatActivityEnterView2.r0;
                            chatActivityEnterView2.t0 = i;
                            chatActivityEnterView2.u0 = i2;
                            ix1Var4.showAtLocation(view, 51, i, i2);
                            chatActivityEnterView2.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView2.s0 = new mv1(chatActivityEnterView2, (byte) 16);
                    if (chatActivityEnterView2.T7) {
                        chatActivityEnterView2.O0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView2.O0(true, true, true);
                        break;
                    }
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.X7;
                zu1 zu1Var2 = chatActivityEnterView.E3;
                tw1 tw1Var = chatActivityEnterView.R0;
                if (chatActivityEnterView.q0()) {
                    if (chatActivityEnterView.b7 == null) {
                        chatActivityEnterView.c7 = true;
                        float f4 = chatActivityEnterView.B0 ? 0.5f : 1.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.b7 = ofFloat;
                        ofFloat.addUpdateListener(new qm1(chatActivityEnterView, f4, b4));
                        chatActivityEnterView.b7.addListener(new u7(chatActivityEnterView, f4, (byte) 3));
                        chatActivityEnterView.b7.setDuration(180L);
                        chatActivityEnterView.b7.setInterpolator(k43.i);
                        chatActivityEnterView.b7.start();
                        break;
                    }
                } else {
                    hb hbVar2 = chatActivityEnterView.V;
                    if (hbVar2 == null || !hbVar2.f) {
                        if (tw1Var.x) {
                            fu5 fu5Var = chatActivityEnterView.x7;
                            if (fu5Var != null) {
                                fu5Var.u();
                                chatActivityEnterView.x7 = null;
                                break;
                            } else {
                                tx1 tx1Var3 = chatActivityEnterView.F0;
                                if (tx1Var3 != null && zu1Var2 != null) {
                                    tx1Var3.m();
                                    ?? r2 = chatActivityEnterView.b2;
                                    fu5 fu5Var2 = new fu5(r2 != null ? r2 : chatActivityEnterView, chatActivityEnterView.K4, tw1Var, false, false, true);
                                    fu5Var2.d0 = hl.L(280.0f);
                                    zu1.E6(new a37(fu5Var2, chatActivityEnterView.F0), zu1Var2.h, true, true, true, true);
                                    fu5Var2.a0 = true;
                                    fu5Var2.p = new jj1(chatActivityEnterView, fu5Var2, (byte) 27);
                                    chatActivityEnterView.x7 = fu5Var2;
                                    fu5Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.B0) {
                            chatActivityEnterView.j2();
                            break;
                        } else if (chatActivityEnterView.U0() && chatActivityEnterView.U2 == 0) {
                            if (chatActivityEnterView.G2 != 0) {
                                chatActivityEnterView.Z1(0, true);
                                my1 my1Var2 = chatActivityEnterView.V0;
                                if (my1Var2 != null) {
                                    my1Var2.r(false);
                                }
                                tx1 tx1Var4 = chatActivityEnterView.F0;
                                if (tx1Var4 != null) {
                                    tx1Var4.requestFocus();
                                }
                            }
                            if (chatActivityEnterView.o4) {
                                chatActivityEnterView.a2(false, true, false, true);
                                chatActivityEnterView.a4 = true;
                                hl.d3(new fw1(chatActivityEnterView, (byte) 4), 200L);
                                break;
                            } else {
                                chatActivityEnterView.p1();
                                break;
                            }
                        } else {
                            chatActivityEnterView.i2(1, 0, true, true);
                            my1 my1Var3 = chatActivityEnterView.V0;
                            tx1 tx1Var5 = chatActivityEnterView.F0;
                            boolean z3 = tx1Var5 != null && tx1Var5.length() > 0;
                            if (zu1Var2 != null) {
                                kg5 kg5Var = zu1Var2.N1;
                                if (kg5Var != null) {
                                    if (kg5Var.W) {
                                        kg5Var.f(true);
                                    }
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zu1Var2.N1 = null;
                                if (z2) {
                                    z = true;
                                    my1Var3.B(z3, z);
                                    break;
                                }
                            }
                            z = false;
                            my1Var3.B(z3, z);
                        }
                    }
                }
                break;
            case 4:
                int i14 = ChatActivityEnterView.X7;
                hb hbVar3 = chatActivityEnterView.V;
                if ((hbVar3 == null || !hbVar3.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.O3.S1();
                    break;
                }
                break;
            case 5:
                int i15 = ChatActivityEnterView.X7;
                chatActivityEnterView.m1();
                break;
            case 6:
                int i16 = ChatActivityEnterView.X7;
                chatActivityEnterView.q1();
                break;
            case 7:
                int i17 = ChatActivityEnterView.X7;
                xy1 xy1Var2 = chatActivityEnterView.O3;
                if (xy1Var2 != null) {
                    xy1Var2.i0();
                    break;
                }
                break;
            case 8:
                int i18 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.Q2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        sy1 C = chatActivityEnterView.C();
                        chatActivityEnterView.R2 = C;
                        r41 d = r41.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.Q2.link;
                        String str2 = C.a;
                        ArrayList<TLRPC.MessageEntity> arrayList3 = C.b;
                        fw1 fw1Var = new fw1(chatActivityEnterView, (byte) 5);
                        TL_account.TL_businessChatLink c = d.c(str);
                        if (c != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList3;
                            tL_inputBusinessChatLink.title = c.title;
                            d.b(c, tL_inputBusinessChatLink, fw1Var);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.c0;
                        if (numberTextView != null) {
                            hl.A3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.c0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 9:
                int i19 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.Z3) {
                    if (!chatActivityEnterView.o3 || (tx1Var = chatActivityEnterView.F0) == null || !tx1Var.isFocused()) {
                        if (chatActivityEnterView.o4) {
                            if (chatActivityEnterView.G2 != 0) {
                                chatActivityEnterView.Z1(0, true);
                                chatActivityEnterView.V0.r(true);
                                chatActivityEnterView.V0.z();
                                if (chatActivityEnterView.n4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.t4 && (my1Var = chatActivityEnterView.V0) != null) {
                                my1Var.N(false);
                            }
                        } else if (!chatActivityEnterView.t4) {
                            chatActivityEnterView.V0.N(true);
                        }
                        if (!chatActivityEnterView.t4) {
                            chatActivityEnterView.a2(!chatActivityEnterView.o4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                int i20 = ChatActivityEnterView.X7;
                ep0 ep0Var = chatActivityEnterView.m0;
                boolean z4 = ep0Var.w;
                ep0Var.setOpened(!z4);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                if (chatActivityEnterView.K0()) {
                    if (!z4) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.s1();
                            break;
                        } else {
                            hl.d3(new fw1(chatActivityEnterView, (byte) 19), 275L);
                            chatActivityEnterView.N0(false);
                            break;
                        }
                    }
                } else {
                    qx1 qx1Var = chatActivityEnterView.n0;
                    if (z4) {
                        if (qx1Var != null) {
                            qx1Var.c();
                            break;
                        }
                    } else {
                        if (qx1Var == null) {
                            qx1 qx1Var2 = new qx1(chatActivityEnterView, chatActivityEnterView.getContext());
                            chatActivityEnterView.n0 = qx1Var2;
                            gu guVar = qx1Var2.c;
                            chatActivityEnterView.getContext();
                            guVar.setLayoutManager(new x46());
                            ?? r0 = chatActivityEnterView.n0.c;
                            dp0 dp0Var = new dp0();
                            dp0Var.c = new ArrayList();
                            dp0Var.d = new ArrayList();
                            dp0Var.e = new ArrayList();
                            chatActivityEnterView.o0 = dp0Var;
                            r0.setAdapter(dp0Var);
                            chatActivityEnterView.n0.c.setOnItemClickListener(new sx1(chatActivityEnterView));
                            chatActivityEnterView.n0.c.setOnItemLongClickListener(new gx1(chatActivityEnterView));
                            chatActivityEnterView.n0.setClipToPadding(false);
                            chatActivityEnterView.b2.addView(chatActivityEnterView.n0, tre.e(-1, -1, 80));
                            chatActivityEnterView.n0.setVisibility(8);
                            zh6 zh6Var = chatActivityEnterView.A7;
                            if (zh6Var != null) {
                                chatActivityEnterView.o0.E(zh6Var);
                            }
                            chatActivityEnterView.u2();
                        }
                        qx1 qx1Var3 = chatActivityEnterView.n0;
                        if (qx1Var3.getVisibility() != 0) {
                            qx1Var3.setVisibility(0);
                            qx1Var3.c.x0(0);
                            qx1Var3.n = true;
                            qx1Var3.f = false;
                            break;
                        } else if (qx1Var3.f) {
                            qx1Var3.f = false;
                            qx1Var3.a();
                            qx1Var3.d(false);
                            break;
                        }
                    }
                }
                break;
            case 11:
                int i21 = ChatActivityEnterView.X7;
                tx1 tx1Var6 = chatActivityEnterView.F0;
                String obj2 = tx1Var6 != null ? tx1Var6.getText().toString() : "";
                int indexOf = obj2.indexOf(32);
                if (indexOf != -1 && indexOf != obj2.length() - 1) {
                    chatActivityEnterView.setFieldText(obj2.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 12:
                int i22 = ChatActivityEnterView.X7;
                q67 q67Var = chatActivityEnterView.M0;
                if (q67Var == null || q67Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.i3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.E1();
                        break;
                    }
                }
                break;
            case 13:
                int i23 = ChatActivityEnterView.X7;
                chatActivityEnterView.q1();
                break;
            case 14:
                int i24 = ChatActivityEnterView.X7;
                nx1 nx1Var = chatActivityEnterView.O0;
                if (nx1Var != null && nx1Var.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                jj.J(chatActivityEnterView.D3, chatActivityEnterView.E3.a(), new ex1(chatActivityEnterView, (byte) 1), chatActivityEnterView.K4);
                break;
            case 15:
                int i25 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                nx1 nx1Var2 = chatActivityEnterView3.O0;
                if (nx1Var2 != null && nx1Var2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.F1(true, 2147483646, 0, 0L, true);
                break;
            case 16:
                int i26 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                nx1 nx1Var3 = chatActivityEnterView4.O0;
                if (nx1Var3 != null && nx1Var3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.F1(false, 0, 0, 0L, true);
                break;
            case 17:
                int i27 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.V7 == 3 && (xy1Var = chatActivityEnterView.O3) != null) {
                    xy1Var.g1();
                    break;
                }
                break;
            case 18:
                int i28 = ChatActivityEnterView.X7;
                AnimatorSet animatorSet2 = chatActivityEnterView.i3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.R1;
                    int[] iArr3 = chatActivityEnterView.Q1;
                    if (!chatActivityEnterView.J1 || chatActivityEnterView.T1 || (x59Var = chatActivityEnterView.i1) == null || chatActivityEnterView.Q3 == null || x59Var.getVisibility() != 0 || chatActivityEnterView.i1.getWidth() <= 0 || (e29Var = chatActivityEnterView.h1) == null) {
                        chatActivityEnterView.B1();
                        break;
                    } else if (chatActivityEnterView.i1.R0 == null) {
                        e29Var.getLocationInWindow(iArr3);
                        chatActivityEnterView.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        TLRPC.TL_document tL_document = chatActivityEnterView.Q3;
                        chatActivityEnterView.A5 = null;
                        float height = ((chatActivityEnterView.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - hl.L(3.0f);
                        chatActivityEnterView.B7 = SystemClock.uptimeMillis() + 380;
                        vw1 vw1Var = chatActivityEnterView.g2;
                        if (vw1Var != null) {
                            vw1Var.invalidate();
                        }
                        hl.d3(new jj1(chatActivityEnterView, tL_document, (byte) 25), 100L);
                        try {
                            chatActivityEnterView.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused4) {
                        }
                        l lVar = chatActivityEnterView.D2;
                        if (lVar != null) {
                            lVar.invalidate();
                        }
                        chatActivityEnterView.H5 = 0.0f;
                        chatActivityEnterView.G5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView.F5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.F5 = ofFloat2;
                        ofFloat2.setDuration(160L);
                        chatActivityEnterView.F5.setInterpolator(k43.g);
                        chatActivityEnterView.F5.addUpdateListener(new qv1(chatActivityEnterView, r3 == true ? 1 : 0));
                        chatActivityEnterView.F5.start();
                        snc sncVar = chatActivityEnterView.r1;
                        if (sncVar != null && (kncVar = sncVar.L) != null && kncVar.R) {
                            kncVar.R = false;
                            kncVar.f0 = -1;
                            kncVar.invalidate();
                        }
                        x59 x59Var2 = chatActivityEnterView.i1;
                        hx1 hx1Var = new hx1(chatActivityEnterView);
                        RectF rectF = x59Var2.f0;
                        mva mvaVar = x59Var2.H0;
                        if (x59Var2.R0 == null && !x59Var2.V0) {
                            int width2 = x59Var2.getWidth();
                            int height2 = x59Var2.getHeight();
                            if (!x59Var2.d0 || width2 <= 0 || height2 <= 0) {
                                hx1Var.a();
                                break;
                            } else {
                                x59Var2.setPlaying(false);
                                x59Var2.p0 = false;
                                x59Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f5 = width2;
                                    rectF.set(0.0f, 0.0f, f5, height2);
                                    x59Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr4 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                    int i29 = width2;
                                    int i30 = height2;
                                    x59Var2.Y0 = x59Var2.f();
                                    x59Var2.X0 = width < f5 / 2.0f;
                                    int max = Math.max(1, Math.round(hl.p * 0.75f));
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < i30; i32 += max) {
                                        for (int i33 = 0; i33 < i29; i33 += max) {
                                            int i34 = iArr4[(i32 * i29) + i33];
                                            if ((i34 >>> 24) > 60) {
                                                if (x59Var2.e(i34)) {
                                                    i31++;
                                                } else {
                                                    i5++;
                                                }
                                            }
                                        }
                                    }
                                    float f6 = i31 > 1100 ? 1100.0f / i31 : 1.0f;
                                    float min = i5 > 0 ? Math.min(1.0f, 360.0f / i5) : 0.0f;
                                    mvaVar.a();
                                    mvaVar.T = 0.0f;
                                    mvaVar.S = 0.0f;
                                    mvaVar.e(x59Var2.Y0);
                                    mvaVar.b = mva.l(aob.v0(aob.Pe, x59Var2.a), x59Var2.Y0);
                                    float f7 = hl.p;
                                    int i35 = 0;
                                    int i36 = 0;
                                    int i37 = 0;
                                    while (i35 < i30) {
                                        int i38 = 0;
                                        while (i38 < i29) {
                                            int i39 = iArr4[(i35 * i29) + i38];
                                            int i40 = i29;
                                            int i41 = i30;
                                            if ((i39 >>> 24) > 60) {
                                                i37++;
                                                int i42 = i37 * 7;
                                                if (x59.c(i42 + 3) <= (x59Var2.e(i39) ? f6 : min)) {
                                                    float f8 = x59Var2.X0 ? i38 / f5 : 1.0f - (i38 / f5);
                                                    float c2 = (((x59.c(i42 + 13) * 0.04f) + (0.42f * f8)) * 760.0f) / 1000.0f;
                                                    float c3 = x59.c(i42 + 11);
                                                    float c4 = x59.c(i42 + 12);
                                                    float f9 = c3 - 0.5f;
                                                    f2 = f6;
                                                    float f10 = max;
                                                    i3 = max;
                                                    float f11 = (f9 * f10) + i38;
                                                    float f12 = i35;
                                                    i4 = i35;
                                                    float f13 = c4 - 0.5f;
                                                    float f14 = (f13 * f10) + f12;
                                                    f3 = min;
                                                    float g = bp1.g(c3, 0.25f, 0.25f, width - f11, f11);
                                                    f = height;
                                                    x59Var2.H0.j(f11, f14, g, Math.min(f14, f) - (((x59.c(i42 + 14) * 9.0f) + 3.0f) * f7), c00.x(f13, 4.0f, f7, width), c00.x(f9, 4.0f, f7, f), xnb.z(f8, 0.3f, 0.8f, (x59.c(i42 + 15) * 0.2f) + 0.45f), c2);
                                                    i36++;
                                                    i38 += i3;
                                                    height = f;
                                                    min = f3;
                                                    i29 = i40;
                                                    i30 = i41;
                                                    f6 = f2;
                                                    max = i3;
                                                    i35 = i4;
                                                }
                                            }
                                            f = height;
                                            i3 = max;
                                            i4 = i35;
                                            f2 = f6;
                                            f3 = min;
                                            i38 += i3;
                                            height = f;
                                            min = f3;
                                            i29 = i40;
                                            i30 = i41;
                                            f6 = f2;
                                            max = i3;
                                            i35 = i4;
                                        }
                                        i35 += max;
                                        i30 = i30;
                                    }
                                    x59Var2.R0 = createBitmap;
                                    x59Var2.S0 = i36;
                                    x59Var2.U0 = hx1Var;
                                    x59Var2.T0 = SystemClock.uptimeMillis();
                                    x59Var2.invalidate();
                                    break;
                                } catch (Throwable unused5) {
                                    hx1Var.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 19:
                int i43 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.G2 != 0) {
                    chatActivityEnterView.Z1(0, false);
                    chatActivityEnterView.V0.r(false);
                    tx1 tx1Var7 = chatActivityEnterView.F0;
                    if (tx1Var7 != null) {
                        tx1Var7.requestFocus();
                    }
                }
                if (chatActivityEnterView.c3 != null) {
                    if (!chatActivityEnterView.U0() || chatActivityEnterView.U2 != 1) {
                        chatActivityEnterView.i2(1, 1, true, true);
                    } else if (chatActivityEnterView.U0() && chatActivityEnterView.U2 == 1) {
                        chatActivityEnterView.i2(0, 1, true, false);
                    }
                } else if (chatActivityEnterView.e3) {
                    chatActivityEnterView.setFieldText("/");
                    tx1 tx1Var8 = chatActivityEnterView.F0;
                    if (tx1Var8 != null) {
                        tx1Var8.requestFocus();
                    }
                    chatActivityEnterView.o1();
                }
                if (chatActivityEnterView.o4) {
                    chatActivityEnterView.a2(false, false, false, true);
                    break;
                }
                break;
            case 20:
                int i44 = ChatActivityEnterView.X7;
                xy1 xy1Var3 = chatActivityEnterView.O3;
                if (xy1Var3 != null && !xy1Var3.g()) {
                    ?? r02 = chatActivityEnterView.O3;
                    cz1 cz1Var = chatActivityEnterView.G0;
                    r02.b1(cz1Var, ((ema) cz1Var.c).getText(), true);
                    break;
                }
                break;
            case 21:
                a(view);
                break;
            default:
                int i45 = ChatActivityEnterView.X7;
                chatActivityEnterView.w0();
                break;
        }
    }
}
