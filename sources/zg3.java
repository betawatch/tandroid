// default package

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import android.widget.ImageView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ProfileActivity;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zg3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01de, code lost:
    
        r8 = org.telegram.ui.Dictation.DictationAsr.nativeFileNext(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        long nativeSessionNew;
        String nativeSessionPush;
        String nativeSessionFinish;
        long nativeFileNew;
        String nativeFileNext;
        byte b = this.a;
        long j = 0;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                nx0[] nx0VarArr = (nx0[]) obj;
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    nx0VarArr[0] = null;
                    return;
                }
                return;
            case 1:
                lq3 q = lq3.q(((k5) obj).a);
                q.getMessagesStorage().a.c(new hq3(q, objArr == true ? 1 : 0));
                return;
            case 2:
                ((uk3) obj).updateColors();
                return;
            case 3:
                ((w8c) obj).updateColors();
                return;
            case 4:
                ((m9) obj).updateColors();
                return;
            case 5:
                ((uj3) ((kg2) obj).b).g0.setAlpha(1.0f);
                return;
            case 6:
                Bundle bundle = new Bundle();
                uj3 uj3Var = ((fj3) obj).a;
                i = ((e) uj3Var).currentAccount;
                bundle.putLong("user_id", yac.h(i).e());
                bundle.putBoolean("my_profile", true);
                uj3Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                uj3 uj3Var2 = ((ij3) obj).I0;
                uj3Var2.showDialog(new xk8((e) uj3Var2, 9, true));
                uj3Var2.A0.setIsEditing(false);
                uj3Var2.d5(false);
                return;
            case 8:
                uj3 uj3Var3 = ((lj3) obj).b;
                uj3Var3.A0.setIsEditing(true);
                uj3Var3.d5(true);
                return;
            case 9:
                vj3 vj3Var = (vj3) obj;
                vj3Var.a.a(!r1.f, true);
                hl.d3(vj3Var.f, 3000L);
                return;
            case 10:
                ((ix9) obj).W(false);
                return;
            case 11:
                gx9 gx9Var = (gx9) obj;
                og4 og4Var = gx9Var.B0;
                if (og4Var != null) {
                    ((xg3) og4Var).i(false, null, gx9Var.z0, gx9Var.A0);
                    return;
                }
                return;
            case 12:
                tl3 tl3Var = (tl3) obj;
                tl3Var.c = ql3.d;
                tl3Var.J.clear();
                int i2 = tl3Var.G0;
                if (i2 >= 0 && i2 < tl3Var.b()) {
                    tl3Var.g(tl3Var.G0);
                }
                tl3Var.P();
                return;
            case 13:
                zl3 zl3Var = ((xl3) obj).d;
                zl3Var.s = false;
                zl3Var.w = null;
                Choreographer.getInstance().removeFrameCallback(zl3Var);
                zl3Var.G = 0L;
                xrc xrcVar = (xrc) zl3Var;
                yrc yrcVar = xrcVar.M;
                if (yrcVar.d == xrcVar) {
                    yrcVar.h();
                    return;
                }
                return;
            case 14:
                ((bm3) obj).c(null, null);
                return;
            case 15:
                qm3 qm3Var = (qm3) obj;
                long h = DictationAsr.h(qm3Var.b);
                if (h == 0) {
                    qm3Var.b(qm3Var.o);
                    return;
                }
                DictationAsr.Q();
                sm3 sm3Var = qm3Var.a;
                synchronized (sm3Var.a) {
                    z = sm3Var.d;
                }
                if (!z) {
                    String a = qm3Var.b.a(qm3Var.c);
                    String str = a.split(",")[0];
                    nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, xea.o() == 0 ? 2 : 4);
                    StringBuilder sb = new StringBuilder("tinyasr: session ");
                    qu6.u(sb, qm3Var.b.a, " in ", a, " (from ");
                    sb.append(str);
                    sb.append("), audio from 0 ms");
                    Log.d("Dictation", sb.toString());
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i3 = 0;
                    while (true) {
                        try {
                            if (!qm3Var.l) {
                                boolean z2 = qm3Var.k;
                                int c = qm3Var.a.c() - i3;
                                if (c >= 2) {
                                    int min = Math.min(10240, c & (-2)) + i3;
                                    byte[] b2 = qm3Var.a.b(i3, min);
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b2, 0, b2.length);
                                    qm3Var.a(nativeSessionPush);
                                    j += SystemClock.elapsedRealtime() - elapsedRealtime2;
                                    qm3Var.m = min;
                                    i3 = min;
                                } else if (z2) {
                                    nativeSessionFinish = DictationAsr.nativeSessionFinish(nativeSessionNew);
                                    qm3Var.a(nativeSessionFinish);
                                    Log.d("Dictation", "tinyasr: finished, " + (i3 / 32) + " ms of audio, " + j + " ms busy, " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms in all");
                                } else {
                                    Thread.sleep(40L);
                                }
                            }
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            DictationAsr.nativeSessionFree(nativeSessionNew);
                            DictationAsr.U(qm3Var.b);
                            throw th;
                        }
                    }
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.U(qm3Var.b);
                    qm3Var.b(qm3Var.o);
                    return;
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                sm3 sm3Var2 = qm3Var.a;
                byte[] b3 = sm3Var2.b(0, sm3Var2.c());
                qm3Var.m = b3.length;
                int length = b3.length / 2;
                float[] fArr = new float[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = i4 << 1;
                    fArr[i4] = ((short) ((b3[i5] & 255) | (b3[i5 + 1] << 8))) / 32768.0f;
                }
                nativeFileNew = DictationAsr.nativeFileNew(h, fArr, qm3Var.b.a(qm3Var.c), xea.o() == 0 ? 2 : 4);
                try {
                    if (nativeFileNew == 0) {
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.U(qm3Var.b);
                        while (!qm3Var.k && !qm3Var.l) {
                            Thread.sleep(10L);
                        }
                    } else {
                        while (!qm3Var.l && nativeFileNext != null) {
                            try {
                                try {
                                    DictationAsr.m(qm3Var.e, new JSONArray(nativeFileNext), null);
                                } catch (Exception e) {
                                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e);
                                }
                                qm3Var.b(null);
                            } catch (Throwable th2) {
                                if (nativeFileNew != 0) {
                                    DictationAsr.nativeFileFree(nativeFileNew);
                                }
                                DictationAsr.U(qm3Var.b);
                                while (!qm3Var.k && !qm3Var.l) {
                                    try {
                                        Thread.sleep(10L);
                                    } catch (InterruptedException unused2) {
                                    }
                                }
                                qm3Var.b(qm3Var.o);
                                throw th2;
                            }
                        }
                        Log.d("Dictation", "tinyasr: file pass in " + qm3Var.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.U(qm3Var.b);
                        while (!qm3Var.k && !qm3Var.l) {
                            Thread.sleep(10L);
                        }
                    }
                } catch (InterruptedException unused3) {
                }
                qm3Var.b(qm3Var.o);
                return;
            case 16:
                hl.E3((tx1) obj);
                return;
            case 17:
                ((vq3) obj).a(false);
                return;
            case 18:
                ((ht3) obj).a();
                return;
            case 19:
                hl.t1(((v4a) obj).b.getEditText());
                return;
            case 20:
                ((ru3) obj).removeSelfFromStack();
                return;
            case 21:
                ((EglBase10Impl.EglConnection) obj).lambda$new$0();
                return;
            case 22:
                ((EglBase14Impl.EglConnection) obj).lambda$new$0();
                return;
            case 23:
                ((EglRenderer) obj).renderFrameOnRenderThread();
                return;
            case 24:
                ((EglBase.EglConnection) obj).release();
                return;
            case 25:
                m01.u(((iv3) ((tu) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 26:
                iv3 iv3Var = ((hv3) obj).a;
                iv3Var.r1.setVisibility(4);
                iv3Var.q1.setVisibility(4);
                ImageView imageView = iv3Var.w1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 27:
                tv3 tv3Var = (tv3) obj;
                ArrayList arrayList = tv3Var.y;
                ArrayList arrayList2 = tv3Var.x;
                if (tv3Var.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = tv3Var.r;
                    tL_sendMessageEmojiInteraction.emoticon = tv3Var.w;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("i", ((Integer) arrayList.get(i6)).intValue() + 1);
                            jSONObject2.put("t", ((Long) arrayList2.get(i6)).longValue() / 1000.0f);
                            jSONArray.put(i6, jSONObject2);
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j2 = tv3Var.K;
                        if (j2 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j2;
                            tL_messages_setTyping.flags |= 1;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = uc7.s1(tv3Var.b).j1(tv3Var.J);
                        ConnectionsManager.getInstance(tv3Var.b).sendRequest(tL_messages_setTyping, null);
                        tv3Var.r = 0;
                        tv3Var.w = null;
                        tv3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                    } catch (JSONException e2) {
                        tv3Var.r = 0;
                        tv3Var.w = null;
                        tv3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                        cc4.g(e2, true);
                    }
                }
                tv3Var.E = null;
                return;
            case 28:
                v21.e();
                xk8 xk8Var = new xk8((e) new qu0((tw7) obj), 14, false);
                xk8Var.setOnDismissListener(new h5((byte) 6));
                xk8Var.show();
                return;
            default:
                ((fw3) obj).F();
                return;
        }
    }
}
