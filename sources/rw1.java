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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rw1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ rw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v124, types: [fv, r59] */
    /* JADX WARN: Type inference failed for: r1v167, types: [uz1] */
    /* JADX WARN: Type inference failed for: r3v25, types: [ela] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.TLRPC$ChatFull] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i;
        int i2;
        ?? r17;
        byte b;
        ?? r16;
        boolean z;
        boolean z2;
        jz1 jz1Var;
        sy1 sy1Var;
        ChatActivityEnterView.RecordCircle recordCircle;
        l49 l49Var;
        s09 s09Var;
        int i3;
        int i4;
        int i5;
        float f;
        uz1 uz1Var;
        byte b2 = 9;
        byte b3 = 3;
        int i6 = 0;
        r4 = false;
        boolean z3 = false;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                int i7 = ChatActivityEnterView.z7;
                gb gbVar = chatActivityEnterView.V;
                if ((gbVar == null || !gbVar.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.O0();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i8 = ChatActivityEnterView.z7;
                yv1 yv1Var = chatActivityEnterView2.F3;
                if (!chatActivityEnterView2.w7 ? chatActivityEnterView2.getTranslationY() == 0.0f : !chatActivityEnterView2.R0()) {
                    if (chatActivityEnterView2.P3.j() > gm.L(20.0f)) {
                        int B0 = chatActivityEnterView2.P3.B0();
                        int j = chatActivityEnterView2.P3.j();
                        if (j <= gm.L(20.0f)) {
                            B0 += j;
                        }
                        if (chatActivityEnterView2.X0) {
                            B0 -= chatActivityEnterView2.getEmojiPadding();
                        }
                        if (B0 < gm.L(200.0f)) {
                            chatActivityEnterView2.v0 = new mw1(chatActivityEnterView2, (byte) 10);
                            chatActivityEnterView2.R();
                            break;
                        }
                    }
                    if (chatActivityEnterView2.P3.x() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        hy1 hy1Var = chatActivityEnterView2.r0;
                        if (hy1Var != null) {
                            hy1Var.e = false;
                            hy1Var.l(new zna[0]);
                            break;
                        } else {
                            oc7 r1 = oc7.r1(chatActivityEnterView2.R);
                            if (chatActivityEnterView2.w7) {
                                peer = chatActivityEnterView2.P3.l();
                            } else {
                                oc7.r1(chatActivityEnterView2.R).L0(Long.valueOf(-chatActivityEnterView2.G3));
                                ?? M0 = oc7.r1(chatActivityEnterView2.R).M0(-chatActivityEnterView2.G3);
                                r7 = M0;
                                peer = M0 != 0 ? M0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView2.P3.x() != null && !chatActivityEnterView2.P3.x().peers.isEmpty()) {
                                peer = chatActivityEnterView2.P3.x().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = sd2.V(r1.L0(Long.valueOf(-chatActivityEnterView2.G3)));
                            if (chatActivityEnterView2.w7) {
                            } else {
                                yv1Var.getParentLayout().getOverlayContainerView();
                            }
                            hy1 hy1Var2 = new hy1(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.F3, r1, V, peer2, chatActivityEnterView2.P3.x(), new jf((Object) chatActivityEnterView2, (Object) r7, (Object) r1, (byte) 19), chatActivityEnterView2.L4);
                            chatActivityEnterView2.r0 = hy1Var2;
                            hy1Var2.e = true;
                            hy1Var2.c = (short) 220;
                            hy1Var2.setOutsideTouchable(true);
                            chatActivityEnterView2.r0.setClippingEnabled(true);
                            chatActivityEnterView2.r0.setFocusable(true);
                            chatActivityEnterView2.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView2.r0.setInputMethodMode(2);
                            chatActivityEnterView2.r0.setSoftInputMode(0);
                            chatActivityEnterView2.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView2.r0.b = false;
                            int i9 = -gm.L(4.0f);
                            int[] iArr = new int[2];
                            if (!gm.O1() || yv1Var == null) {
                                i = i9;
                            } else {
                                yv1Var.getFragmentView().getLocationInWindow(iArr);
                                i = iArr[0] + i9;
                            }
                            int B02 = chatActivityEnterView2.P3.B0();
                            int measuredHeight = chatActivityEnterView2.r0.getContentView().getMeasuredHeight();
                            int j2 = chatActivityEnterView2.P3.j();
                            if (j2 <= gm.L(20.0f)) {
                                B02 += j2;
                            }
                            if (chatActivityEnterView2.X0) {
                                B02 -= chatActivityEnterView2.getEmojiPadding();
                            }
                            if (measuredHeight < (((i9 << 1) + B02) - ((yv1Var == null || !yv1Var.isInBubbleMode()) ? gm.m : 0)) - chatActivityEnterView2.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView2.getLocationInWindow(iArr);
                                i2 = ((iArr[1] - measuredHeight) - i9) - gm.L(2.0f);
                            } else {
                                i2 = (yv1Var == null || !yv1Var.isInBubbleMode()) ? gm.m : 0;
                                chatActivityEnterView2.r0.o.getLayoutParams().height = ((B02 - i2) - gm.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                            }
                            final hy1 hy1Var3 = chatActivityEnterView2.r0;
                            View view2 = hy1Var3.u;
                            r59 r59Var = hy1Var3.v;
                            TLRPC.Peer peer3 = hy1Var3.r;
                            f6a f6aVar = hy1Var3.o;
                            ne6 ne6Var = hy1Var3.t;
                            ArrayList arrayList = hy1Var3.z;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                ((zna) obj).d();
                            }
                            arrayList.clear();
                            ne6Var.setPivotX(gm.L(8.0f));
                            ne6Var.setPivotY(ne6Var.getMeasuredHeight() - gm.L(8.0f));
                            f6aVar.setPivotX(0.0f);
                            f6aVar.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = hy1Var3.s.peers;
                            if (peer3 != null) {
                                int L = gm.L(54.0f);
                                r17 = 2;
                                int size2 = arrayList2.size() * L;
                                b = 1;
                                r16 = 3;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i11).peer;
                                    View view3 = view2;
                                    r59 r59Var2 = r59Var;
                                    long j3 = peer4.channel_id;
                                    if (j3 == 0 || j3 != peer3.channel_id) {
                                        long j4 = peer4.user_id;
                                        if (j4 == 0 || j4 != peer3.user_id) {
                                            long j5 = peer4.chat_id;
                                            if (j5 == 0 || j5 != peer3.chat_id) {
                                                i11++;
                                                view2 = view3;
                                                r59Var = r59Var2;
                                            }
                                        }
                                    }
                                    hy1Var3.w.g1(i11, (size2 - ((arrayList2.size() - 2) * L)) + gm.L(7.0f) + ((i11 == arrayList2.size() + (-1) || r59Var2.getMeasuredHeight() >= size2) ? 0 : r59Var2.getMeasuredHeight() % L));
                                    if (r59Var2.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                r17 = 2;
                                b = 1;
                                r16 = 3;
                            }
                            ne6Var.setScaleX(0.25f);
                            ne6Var.setScaleY(0.25f);
                            f6aVar.setAlpha(0.25f);
                            zna znaVar = new zna(ne6Var, zna.q);
                            znaVar.m = aq1.j(1.0f, 750.0f, 1.0f);
                            final byte b5 = 0;
                            znaVar.b(new it3() { // from class: c6a
                                @Override // it3
                                public final void a(zna znaVar2, float f2, float f3) {
                                    byte b6 = b5;
                                    hy1 hy1Var4 = hy1Var3;
                                    switch (b6) {
                                        case 0:
                                            hy1Var4.o.setScaleX(1.0f / f2);
                                            break;
                                        default:
                                            hy1Var4.o.setScaleY(1.0f / f2);
                                            break;
                                    }
                                }
                            });
                            zna znaVar2 = new zna(ne6Var, zna.r);
                            znaVar2.m = aq1.j(1.0f, 750.0f, 1.0f);
                            final byte b6 = b;
                            znaVar2.b(new it3() { // from class: c6a
                                @Override // it3
                                public final void a(zna znaVar22, float f2, float f3) {
                                    byte b62 = b6;
                                    hy1 hy1Var4 = hy1Var3;
                                    switch (b62) {
                                        case 0:
                                            hy1Var4.o.setScaleX(1.0f / f2);
                                            break;
                                        default:
                                            hy1Var4.o.setScaleY(1.0f / f2);
                                            break;
                                    }
                                }
                            });
                            gt3 gt3Var = zna.v;
                            zna znaVar3 = new zna(ne6Var, gt3Var);
                            znaVar3.m = aq1.j(1.0f, 750.0f, 1.0f);
                            zna znaVar4 = new zna(f6aVar, gt3Var);
                            znaVar4.m = aq1.j(1.0f, 750.0f, 1.0f);
                            zna[] znaVarArr = new zna[4];
                            znaVarArr[0] = znaVar;
                            znaVarArr[1] = znaVar2;
                            znaVarArr[r17] = znaVar3;
                            znaVarArr[r16] = znaVar4;
                            for (zna znaVar5 : Arrays.asList(znaVarArr)) {
                                arrayList.add(znaVar5);
                                znaVar5.a(new w21(hy1Var3, znaVar5, (byte) 7));
                                znaVar5.h();
                            }
                            hy1 hy1Var4 = chatActivityEnterView2.r0;
                            chatActivityEnterView2.t0 = i;
                            chatActivityEnterView2.u0 = i2;
                            hy1Var4.showAtLocation(view, 51, i, i2);
                            chatActivityEnterView2.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView2.s0 = new mw1(chatActivityEnterView2, (byte) 9);
                    if (chatActivityEnterView2.w7) {
                        chatActivityEnterView2.K0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView2.K0(true, true, true);
                        break;
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                int i12 = ChatActivityEnterView.z7;
                yv1 yv1Var2 = chatActivityEnterView3.F3;
                rx1 rx1Var = chatActivityEnterView3.R0;
                if (chatActivityEnterView3.n0()) {
                    if (chatActivityEnterView3.C6 == null) {
                        chatActivityEnterView3.D6 = true;
                        float f2 = chatActivityEnterView3.B0 ? 0.5f : 1.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView3.C6 = ofFloat;
                        ofFloat.addUpdateListener(new go1(chatActivityEnterView3, f2, b4));
                        chatActivityEnterView3.C6.addListener(new t7(chatActivityEnterView3, f2, (byte) 3));
                        chatActivityEnterView3.C6.setDuration(180L);
                        chatActivityEnterView3.C6.setInterpolator(d53.i);
                        chatActivityEnterView3.C6.start();
                        break;
                    }
                } else {
                    gb gbVar2 = chatActivityEnterView3.V;
                    if (gbVar2 == null || !gbVar2.f) {
                        if (rx1Var.x) {
                            bu5 bu5Var = chatActivityEnterView3.c7;
                            if (bu5Var != null) {
                                bu5Var.u();
                                chatActivityEnterView3.c7 = null;
                                break;
                            } else {
                                sy1 sy1Var2 = chatActivityEnterView3.F0;
                                if (sy1Var2 != null && yv1Var2 != null) {
                                    sy1Var2.m();
                                    ?? r3 = chatActivityEnterView3.c2;
                                    bu5 bu5Var2 = new bu5(r3 != null ? r3 : chatActivityEnterView3, chatActivityEnterView3.L4, rx1Var, false, false, true);
                                    bu5Var2.a0 = gm.L(280.0f);
                                    yv1.E6(new t27(bu5Var2, chatActivityEnterView3.F0), yv1Var2.h, true, true, true, true);
                                    bu5Var2.X = true;
                                    bu5Var2.p = new uj1(chatActivityEnterView3, bu5Var2, (byte) 29);
                                    chatActivityEnterView3.c7 = bu5Var2;
                                    bu5Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView3.B0) {
                            chatActivityEnterView3.a2();
                            break;
                        } else if (chatActivityEnterView3.R0() && chatActivityEnterView3.V2 == 0) {
                            if (chatActivityEnterView3.H2 != 0) {
                                chatActivityEnterView3.R1(0, true);
                                jz1 jz1Var2 = chatActivityEnterView3.V0;
                                if (jz1Var2 != null) {
                                    jz1Var2.r(false);
                                }
                                sy1 sy1Var3 = chatActivityEnterView3.F0;
                                if (sy1Var3 != null) {
                                    sy1Var3.requestFocus();
                                }
                            }
                            if (chatActivityEnterView3.p4) {
                                chatActivityEnterView3.S1(false, true, false, true);
                                chatActivityEnterView3.b4 = true;
                                gm.d3(new gx1(chatActivityEnterView3, (byte) 1), 200L);
                                break;
                            } else {
                                chatActivityEnterView3.k1();
                                break;
                            }
                        } else {
                            chatActivityEnterView3.Z1(1, 0, true, true);
                            jz1 jz1Var3 = chatActivityEnterView3.V0;
                            sy1 sy1Var4 = chatActivityEnterView3.F0;
                            boolean z4 = sy1Var4 != null && sy1Var4.length() > 0;
                            if (yv1Var2 != null) {
                                hg5 hg5Var = yv1Var2.N1;
                                if (hg5Var != null) {
                                    if (hg5Var.W) {
                                        hg5Var.f(true);
                                    }
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                yv1Var2.N1 = null;
                                if (z2) {
                                    z = true;
                                    jz1Var3.A(z4, z);
                                    break;
                                }
                            }
                            z = false;
                            jz1Var3.A(z4, z);
                        }
                    }
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                int i13 = ChatActivityEnterView.z7;
                gb gbVar3 = chatActivityEnterView4.V;
                if ((gbVar3 == null || !gbVar3.f) && chatActivityEnterView4.G != 0.0f) {
                    chatActivityEnterView4.P3.R1();
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                int i14 = ChatActivityEnterView.z7;
                chatActivityEnterView5.l1();
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                int i15 = ChatActivityEnterView.z7;
                uz1 uz1Var2 = chatActivityEnterView6.P3;
                if (uz1Var2 != null) {
                    uz1Var2.f0();
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                int i16 = ChatActivityEnterView.z7;
                if (chatActivityEnterView7.R2 != null) {
                    if (chatActivityEnterView7.d0 - chatActivityEnterView7.e0 >= 0) {
                        pz1 A = chatActivityEnterView7.A();
                        chatActivityEnterView7.S2 = A;
                        q51 d = q51.d(chatActivityEnterView7.R);
                        String str = chatActivityEnterView7.R2.link;
                        String str2 = A.a;
                        ArrayList<TLRPC.MessageEntity> arrayList3 = A.b;
                        gx1 gx1Var = new gx1(chatActivityEnterView7, (byte) 2);
                        TL_account.TL_businessChatLink c = d.c(str);
                        if (c != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList3;
                            tL_inputBusinessChatLink.title = c.title;
                            d.b(c, tL_inputBusinessChatLink, gx1Var);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView7.c0;
                        if (numberTextView != null) {
                            gm.A3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView7.c0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                int i17 = ChatActivityEnterView.z7;
                if (chatActivityEnterView8.T0.getVisibility() == 0 && chatActivityEnterView8.T0.getAlpha() == 1.0f && !chatActivityEnterView8.a4) {
                    if (!chatActivityEnterView8.p3 || (sy1Var = chatActivityEnterView8.F0) == null || !sy1Var.isFocused()) {
                        if (chatActivityEnterView8.p4) {
                            if (chatActivityEnterView8.H2 != 0) {
                                chatActivityEnterView8.R1(0, true);
                                chatActivityEnterView8.V0.r(true);
                                chatActivityEnterView8.V0.y();
                                if (chatActivityEnterView8.o4) {
                                    chatActivityEnterView8.M(true);
                                }
                            } else if (!chatActivityEnterView8.u4 && (jz1Var = chatActivityEnterView8.V0) != null) {
                                jz1Var.N(false);
                            }
                        } else if (!chatActivityEnterView8.u4) {
                            chatActivityEnterView8.V0.N(true);
                        }
                        if (!chatActivityEnterView8.u4) {
                            chatActivityEnterView8.S1(!chatActivityEnterView8.p4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                int i18 = ChatActivityEnterView.z7;
                if (chatActivityEnterView9.g0() && chatActivityEnterView9.v3 && (recordCircle = chatActivityEnterView9.D2) != null && ChatActivityEnterView.this.h5) {
                    chatActivityEnterView9.m0(false, false);
                    un3 un3Var = chatActivityEnterView9.j1;
                    if (un3Var == null || !un3Var.q()) {
                        un3 un3Var2 = chatActivityEnterView9.j1;
                        if (un3Var2 != null && un3Var2.p()) {
                            sy1 sy1Var5 = chatActivityEnterView9.F0;
                            if (sy1Var5 != null) {
                                sy1Var5.setText("");
                            }
                            chatActivityEnterView9.j1.m();
                        }
                    } else {
                        un3 un3Var3 = chatActivityEnterView9.j1;
                        if (un3Var3.o0 && un3Var3.q()) {
                            un3Var3.t();
                        }
                    }
                    if (chatActivityEnterView9.v3) {
                        chatActivityEnterView9.v3 = false;
                        chatActivityEnterView9.Y1 = 0L;
                        chatActivityEnterView9.w2(2, true);
                        break;
                    }
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                int i19 = ChatActivityEnterView.z7;
                sy1 sy1Var6 = chatActivityEnterView10.F0;
                String obj2 = sy1Var6 != null ? sy1Var6.getText().toString() : "";
                int indexOf = obj2.indexOf(32);
                if (indexOf != -1 && indexOf != obj2.length() - 1) {
                    chatActivityEnterView10.setFieldText(obj2.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView10.setFieldText("");
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                int i20 = ChatActivityEnterView.z7;
                AnimatorSet animatorSet = chatActivityEnterView11.j3;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    int[] iArr2 = chatActivityEnterView11.S1;
                    int[] iArr3 = chatActivityEnterView11.R1;
                    if (!chatActivityEnterView11.K1 || chatActivityEnterView11.U1 || (l49Var = chatActivityEnterView11.i1) == null || chatActivityEnterView11.R3 == null || l49Var.getVisibility() != 0 || chatActivityEnterView11.i1.getWidth() <= 0 || (s09Var = chatActivityEnterView11.h1) == null) {
                        chatActivityEnterView11.t1();
                        break;
                    } else if (chatActivityEnterView11.i1.T0 == null) {
                        s09Var.getLocationInWindow(iArr3);
                        chatActivityEnterView11.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView11.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        float height = ((chatActivityEnterView11.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - gm.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView11.R3;
                        chatActivityEnterView11.y5 = null;
                        gm.d3(new uj1(chatActivityEnterView11, tL_document, (byte) 28), 100L);
                        try {
                            chatActivityEnterView11.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        l lVar = chatActivityEnterView11.E2;
                        if (lVar != null) {
                            lVar.invalidate();
                        }
                        chatActivityEnterView11.D5 = 0.0f;
                        chatActivityEnterView11.C5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView11.B5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView11.B5 = ofFloat2;
                        ofFloat2.setDuration(160L);
                        chatActivityEnterView11.B5.setInterpolator(d53.g);
                        chatActivityEnterView11.B5.addUpdateListener(new bx1(chatActivityEnterView11, b2));
                        chatActivityEnterView11.B5.start();
                        l49 l49Var2 = chatActivityEnterView11.i1;
                        wx1 wx1Var = new wx1(chatActivityEnterView11);
                        lta ltaVar = l49Var2.J0;
                        RectF rectF = l49Var2.f0;
                        if (l49Var2.T0 == null && !l49Var2.X0) {
                            int width2 = l49Var2.getWidth();
                            int height2 = l49Var2.getHeight();
                            if (!l49Var2.d0 || width2 <= 0 || height2 <= 0) {
                                wx1Var.a();
                                break;
                            } else {
                                l49Var2.setPlaying(false);
                                l49Var2.p0 = false;
                                l49Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f3 = width2;
                                    rectF.set(0.0f, 0.0f, f3, height2);
                                    l49Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr4 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                    int i21 = width2;
                                    int i22 = height2;
                                    l49Var2.a1 = l49Var2.f();
                                    l49Var2.Z0 = width < f3 / 2.0f;
                                    int max = Math.max(1, Math.round(gm.p * 0.75f));
                                    int i23 = 0;
                                    for (int i24 = 0; i24 < i22; i24 += max) {
                                        for (int i25 = 0; i25 < i21; i25 += max) {
                                            int i26 = iArr4[(i24 * i21) + i25];
                                            int i27 = i6;
                                            if ((i26 >>> 24) > 60) {
                                                if (l49Var2.e(i26)) {
                                                    i23++;
                                                } else {
                                                    i6 = i27 + 1;
                                                }
                                            }
                                            i6 = i27;
                                        }
                                    }
                                    float f4 = i23 > 1100 ? 1100.0f / i23 : 1.0f;
                                    float min = i6 > 0 ? Math.min(1.0f, 360.0f / i6) : 0.0f;
                                    ltaVar.a();
                                    ltaVar.S = 0.0f;
                                    ltaVar.R = 0.0f;
                                    ltaVar.e(l49Var2.a1);
                                    float f5 = gm.p;
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i28 < i22) {
                                        int i31 = 0;
                                        while (i31 < i21) {
                                            int i32 = i21;
                                            int i33 = iArr4[(i28 * i21) + i31];
                                            float f6 = f4;
                                            int i34 = i22;
                                            if ((i33 >>> 24) > 60) {
                                                i30++;
                                                int i35 = i30 * 7;
                                                if (l49.c(i35 + 3) <= (l49Var2.e(i33) ? f6 : min)) {
                                                    float f7 = l49Var2.Z0 ? i31 / f3 : 1.0f - (i31 / f3);
                                                    float c2 = (((l49.c(i35 + 13) * 0.04f) + (0.42f * f7)) * 760.0f) / 1000.0f;
                                                    float c3 = l49.c(i35 + 11);
                                                    float c4 = l49.c(i35 + 12);
                                                    float f8 = i31;
                                                    float f9 = c3 - 0.5f;
                                                    i4 = i31;
                                                    float f10 = max;
                                                    float f11 = (f9 * f10) + f8;
                                                    i5 = max;
                                                    float f12 = i28;
                                                    i3 = i28;
                                                    float f13 = c4 - 0.5f;
                                                    float f14 = (f13 * f10) + f12;
                                                    f = min;
                                                    l49Var2.J0.i(f11, f14, aq1.g(c3, 0.25f, 0.25f, width - f11, f11), Math.min(f14, height) - (((l49.c(i35 + 14) * 9.0f) + 3.0f) * f5), b10.w(f13, 4.0f, f5, width), b10.w(f9, 4.0f, f5, height), mlb.A(f7, 0.3f, 0.8f, (l49.c(i35 + 15) * 0.2f) + 0.45f), c2);
                                                    i29++;
                                                    i31 = i4 + i5;
                                                    f4 = f6;
                                                    min = f;
                                                    i21 = i32;
                                                    max = i5;
                                                    i22 = i34;
                                                    i28 = i3;
                                                }
                                            }
                                            i3 = i28;
                                            i4 = i31;
                                            i5 = max;
                                            f = min;
                                            i31 = i4 + i5;
                                            f4 = f6;
                                            min = f;
                                            i21 = i32;
                                            max = i5;
                                            i22 = i34;
                                            i28 = i3;
                                        }
                                        i28 += max;
                                    }
                                    l49Var2.T0 = createBitmap;
                                    l49Var2.U0 = i29;
                                    l49Var2.W0 = wx1Var;
                                    l49Var2.V0 = SystemClock.uptimeMillis();
                                    l49Var2.invalidate();
                                    break;
                                } catch (Throwable unused4) {
                                    wx1Var.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView12 = this.b;
                int i36 = ChatActivityEnterView.z7;
                eq0 eq0Var = chatActivityEnterView12.m0;
                boolean z5 = eq0Var.w;
                eq0Var.setOpened(!z5);
                try {
                    chatActivityEnterView12.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView12.G0()) {
                    if (!z5) {
                        if (!chatActivityEnterView12.X0 && !chatActivityEnterView12.Y0) {
                            chatActivityEnterView12.n1();
                            break;
                        } else {
                            gm.d3(new gx1(chatActivityEnterView12, (byte) 0), 275L);
                            chatActivityEnterView12.J0(false);
                            break;
                        }
                    }
                } else {
                    py1 py1Var = chatActivityEnterView12.n0;
                    if (z5) {
                        if (py1Var != null) {
                            py1Var.c();
                            break;
                        }
                    } else {
                        if (py1Var == null) {
                            py1 py1Var2 = new py1(chatActivityEnterView12, chatActivityEnterView12.getContext());
                            chatActivityEnterView12.n0 = py1Var2;
                            fv fvVar = py1Var2.c;
                            chatActivityEnterView12.getContext();
                            fvVar.setLayoutManager(new u46());
                            ?? r12 = chatActivityEnterView12.n0.c;
                            dq0 dq0Var = new dq0();
                            dq0Var.c = new ArrayList();
                            dq0Var.d = new ArrayList();
                            dq0Var.e = new ArrayList();
                            chatActivityEnterView12.o0 = dq0Var;
                            r12.setAdapter(dq0Var);
                            chatActivityEnterView12.n0.c.setOnItemClickListener(new ry1(chatActivityEnterView12));
                            chatActivityEnterView12.n0.c.setOnItemLongClickListener(new vx1(chatActivityEnterView12, (byte) 2));
                            chatActivityEnterView12.n0.setClipToPadding(false);
                            chatActivityEnterView12.c2.addView(chatActivityEnterView12.n0, qoe.e(-1, -1, 80));
                            chatActivityEnterView12.n0.setVisibility(8);
                            vh6 vh6Var = chatActivityEnterView12.f7;
                            if (vh6Var != null) {
                                chatActivityEnterView12.o0.E(vh6Var);
                            }
                            chatActivityEnterView12.n2();
                        }
                        py1 py1Var3 = chatActivityEnterView12.n0;
                        if (py1Var3.getVisibility() != 0) {
                            py1Var3.setVisibility(0);
                            py1Var3.c.w0(0);
                            py1Var3.n = true;
                            py1Var3.f = false;
                            break;
                        } else if (py1Var3.f) {
                            py1Var3.f = false;
                            py1Var3.a();
                            py1Var3.d(false);
                            break;
                        }
                    }
                }
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView13 = this.b;
                int i37 = ChatActivityEnterView.z7;
                j67 j67Var = chatActivityEnterView13.M0;
                if (j67Var == null || j67Var.u0) {
                    AnimatorSet animatorSet2 = chatActivityEnterView13.j3;
                    if ((animatorSet2 == null || !animatorSet2.isRunning()) && chatActivityEnterView13.g0 == null) {
                        chatActivityEnterView13.w1();
                        break;
                    }
                }
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView14 = this.b;
                int i38 = ChatActivityEnterView.z7;
                SharedPreferences.Editor edit = oc7.r1(chatActivityEnterView14.R).X3.edit();
                if (ok0.d(chatActivityEnterView14.F3.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                }
                if (oc7.r1(chatActivityEnterView14.R).l4.C0.f && oc7.r1(chatActivityEnterView14.R).l4.B0.f) {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                }
                edit.apply();
                TLRPC.UserFull X1 = oc7.r1(chatActivityEnterView14.R).X1(z8c.h(chatActivityEnterView14.R).e());
                if ((chatActivityEnterView14.getParentFragment().s8 == null || !chatActivityEnterView14.getParentFragment().s8.display_gifts_button) && (X1 == null || !X1.display_gifts_button)) {
                    gm.R3(chatActivityEnterView14.A2, false);
                }
                TLRPC.User h = chatActivityEnterView14.getParentFragment().h();
                if (h != null) {
                    if (chatActivityEnterView14.getParentFragment().s8 != null && ok0.e(chatActivityEnterView14.getParentFragment().s8.birthday)) {
                        z3 = true;
                    }
                    he heVar = new he(3, null, chatActivityEnterView14.getContext());
                    heVar.q(200L);
                    heVar.setOnCancelListener(new fu0(chatActivityEnterView14, oo0.l(chatActivityEnterView14.R, null, new sw1(chatActivityEnterView14, heVar, h, z3)), b3));
                    break;
                }
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView15 = this.b;
                int i39 = ChatActivityEnterView.z7;
                chatActivityEnterView15.l1();
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView16 = this.b;
                int i40 = ChatActivityEnterView.z7;
                my1 my1Var = chatActivityEnterView16.O0;
                if (my1Var != null && my1Var.isShowing()) {
                    chatActivityEnterView16.O0.dismiss();
                }
                ik.J(chatActivityEnterView16.E3, chatActivityEnterView16.F3.a(), new fy1(chatActivityEnterView16), chatActivityEnterView16.L4);
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView17 = this.b;
                int i41 = ChatActivityEnterView.z7;
                my1 my1Var2 = chatActivityEnterView17.O0;
                if (my1Var2 != null && my1Var2.isShowing()) {
                    chatActivityEnterView17.O0.dismiss();
                }
                chatActivityEnterView17.x1(true, 2147483646, 0, 0L, true);
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView18 = this.b;
                int i42 = ChatActivityEnterView.z7;
                my1 my1Var3 = chatActivityEnterView18.O0;
                if (my1Var3 != null && my1Var3.isShowing()) {
                    chatActivityEnterView18.O0.dismiss();
                }
                chatActivityEnterView18.x1(false, 0, 0, 0L, true);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView19 = this.b;
                int i43 = ChatActivityEnterView.z7;
                if (chatActivityEnterView19.y7 == 3 && (uz1Var = chatActivityEnterView19.P3) != null) {
                    uz1Var.e1();
                    break;
                }
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView20 = this.b;
                int i44 = ChatActivityEnterView.z7;
                uz1 uz1Var3 = chatActivityEnterView20.P3;
                if (uz1Var3 != null && !uz1Var3.h()) {
                    ?? r13 = chatActivityEnterView20.P3;
                    yz1 yz1Var = chatActivityEnterView20.G0;
                    r13.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                    break;
                }
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView21 = this.b;
                int i45 = ChatActivityEnterView.z7;
                if (chatActivityEnterView21.H2 != 0) {
                    chatActivityEnterView21.R1(0, false);
                    chatActivityEnterView21.V0.r(false);
                    sy1 sy1Var7 = chatActivityEnterView21.F0;
                    if (sy1Var7 != null) {
                        sy1Var7.requestFocus();
                    }
                }
                if (chatActivityEnterView21.d3 != null) {
                    if (!chatActivityEnterView21.R0() || chatActivityEnterView21.V2 != 1) {
                        chatActivityEnterView21.Z1(1, 1, true, true);
                    } else if (chatActivityEnterView21.R0() && chatActivityEnterView21.V2 == 1) {
                        chatActivityEnterView21.Z1(0, 1, true, false);
                    }
                } else if (chatActivityEnterView21.f3) {
                    chatActivityEnterView21.setFieldText("/");
                    sy1 sy1Var8 = chatActivityEnterView21.F0;
                    if (sy1Var8 != null) {
                        sy1Var8.requestFocus();
                    }
                    chatActivityEnterView21.j1();
                }
                if (chatActivityEnterView21.p4) {
                    chatActivityEnterView21.S1(false, false, false, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView22 = this.b;
                int i46 = ChatActivityEnterView.z7;
                chatActivityEnterView22.t0();
                break;
        }
    }
}
