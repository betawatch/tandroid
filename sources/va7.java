// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class va7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ va7(dx dxVar, int i, int[] iArr, int[] iArr2) {
        this.a = (byte) 6;
        this.c = dxVar;
        this.b = i;
        this.d = iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 5;
        UndoView undoView = null;
        switch (this.a) {
            case 0:
                ad7 ad7Var = (ad7) this.c;
                int i = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                try {
                    long j = message.id;
                    if (k27.a4(message)) {
                        i = 5;
                    } else if (k27.c5(message)) {
                        i = 9;
                    }
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    if (i == 9) {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j + " AND dialog_id = " + k27.B0(message)).stepThis().dispose();
                        break;
                    } else if (i == 5) {
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j + " AND topic_id = " + k27.H1(ad7Var.currentAccount, message)).stepThis().dispose();
                        break;
                    } else if (i == 1) {
                        Locale locale3 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        break;
                    } else {
                        Locale locale4 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        ad7Var.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        break;
                    }
                } catch (Exception e) {
                    ad7Var.n(e, true);
                    return;
                }
            case 1:
                int i2 = this.b;
                Context context = (Context) this.c;
                fx0[] fx0VarArr = (fx0[]) this.d;
                String str = na7.q1(i2).k4.Z2.f;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                d01.t(context, str);
                fx0VarArr[0].dismiss();
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                int i3 = this.b;
                s67 s67Var = (s67) this.d;
                iArr[0] = i3;
                s67Var.run();
                break;
            case 3:
                o oVar = (o) this.c;
                String str2 = (String) this.d;
                int i4 = this.b;
                HashMap hashMap = new HashMap(oVar.v0[0].c.x);
                ArrayList arrayList = new ArrayList(oVar.v0[0].c.y);
                oVar.X0 = null;
                Utilities.g.c(new i57((Object) oVar, (Object) arrayList, (Object) hashMap, (Object) str2, i4, (byte) 4));
                break;
            case 4:
                o oVar2 = (o) this.c;
                int i5 = this.b;
                vt vtVar = (vt) this.d;
                if (oVar2.J0 == i5 && oVar2.H0 != 0) {
                    ConnectionsManager.getInstance(oVar2.Y).cancelRequest(oVar2.H0, false);
                    oVar2.H0 = 0;
                }
                if (oVar2.O0 == vtVar) {
                    oVar2.O0 = null;
                    break;
                }
                break;
            case 5:
                int i6 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                na7.q1(i6).b4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(i6).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 6:
                dx dxVar = (dx) this.c;
                int i7 = this.b;
                int[] iArr2 = (int[]) this.d;
                dxVar.L = i7;
                dxVar.K = iArr2;
                dxVar.N.d0();
                break;
            case 7:
                int[] iArr3 = (int[]) this.c;
                int i8 = this.b;
                gk7[] gk7VarArr = (gk7[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i8).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (gk7VarArr[0] != null) {
                    kk7.f(i8).n(gk7VarArr[0], 59);
                    gk7VarArr[0] = null;
                    break;
                }
                break;
            case 8:
                j41 j41Var = (j41) this.c;
                j41Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                kk7.f(j41Var.a).k(kk7.I1, new Object[0]);
                break;
            case 9:
                String str3 = (String) this.c;
                int i9 = this.b;
                fx0[] fx0VarArr2 = (fx0[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str3);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                rgc.g(LaunchActivity.H1, i9, tL_inputGroupCallSlug, false, null, null);
                fx0VarArr2[0].dismiss();
                break;
            case 10:
                ((CameraView) this.c).lambda$createCamera$11(this.b, (SurfaceTexture) this.d);
                break;
            case 11:
                ((CameraView) this.c).lambda$createCamera$10((CameraView.CameraGLThread) this.d, this.b);
                break;
            case 12:
                mu1 mu1Var = (mu1) this.c;
                int i10 = this.b;
                py pyVar = (py) this.d;
                mu1Var.A0.x0(0, i10, null);
                if (!gl.E3(pyVar)) {
                    pyVar.clearFocus();
                    pyVar.requestFocus();
                }
                gl.d3(new qn1(pyVar, null == true ? 1 : 0), 100L);
                break;
            case 13:
                qs1 qs1Var = (qs1) this.c;
                uk1 uk1Var = (uk1) this.d;
                int i11 = this.b;
                k27 messageObject = uk1Var.getMessageObject();
                mu1 mu1Var2 = qs1Var.a.R;
                mu1Var2.J(i11, messageObject.e1(), k27.B0(messageObject.k) == mu1Var2.d7 ? 1 : 0, 0, true, true);
                break;
            case 14:
                s12 s12Var = (s12) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i12 = this.b;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    s12Var.y = tL_webViewResultUrl.query_id;
                    s12Var.n.q(i12, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    gl.c3(s12Var.V);
                    break;
                }
                break;
            case 15:
                hmc.L0(this.b, (wjb) this.d, ((r32) this.c).getContext());
                break;
            case 16:
                k62 k62Var = (k62) this.c;
                int i13 = this.b;
                View view = (View) this.d;
                k62Var.W = 0;
                k62Var.V = i13;
                if (view instanceof wgb) {
                    k62Var.U((wgb) view, true);
                    break;
                } else {
                    k62Var.r.g(k62Var.J0);
                    break;
                }
            case 17:
                c82 c82Var = (c82) this.c;
                gm gmVar = (gm) this.d;
                int i14 = this.b;
                Editable text = c82Var.h.getText();
                int spanStart = text.getSpanStart(gmVar);
                int spanEnd = text.getSpanEnd(gmVar);
                int i15 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    c82Var.h.getText().delete(spanStart, spanEnd);
                    z72 z72Var = c82Var.h;
                    z72Var.setSelection(Math.min(i14 - i15, z72Var.getText().length()));
                    break;
                }
                break;
            case 18:
                bi3 bi3Var = (bi3) this.c;
                int i16 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                cj3 cj3Var = bi3Var.k0;
                ArrayList arrayList2 = cj3Var.T1;
                if (arrayList2 != null && i16 >= 0 && i16 < arrayList2.size()) {
                    cj3Var.T1.add(i16, dialog);
                    cj3Var.f0[0].b(true);
                    break;
                }
                break;
            case 19:
                aj3 aj3Var = (aj3) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i17 = this.b;
                bj3 bj3Var = aj3Var.h;
                cj3 cj3Var2 = aj3Var.i;
                cj3Var2.U1 = true;
                cj3Var2.getMessagesController().b(0, i17, dialog2.id);
                cj3Var2.U1 = false;
                ArrayList U0 = cj3Var2.getMessagesController().U0(0);
                int indexOf = U0.indexOf(dialog2);
                if (indexOf >= 0) {
                    ArrayList U02 = cj3Var2.getMessagesController().U0(1);
                    if (!U02.isEmpty() || indexOf != 1) {
                        cj3Var2.Q4(true, true);
                        bj3Var.y.D();
                        bj3Var.b(true);
                        cj3Var2.G2();
                    }
                    if (U02.isEmpty()) {
                        U0.remove(0);
                        if (indexOf == 1) {
                            cj3Var2.Q4(true, true);
                            bj3Var.b(true);
                            cj3Var2.G2();
                            break;
                        } else {
                            if (!cj3Var2.T1.isEmpty()) {
                                cj3Var2.T1.remove(0);
                            }
                            bj3Var.y.D();
                            bj3Var.b(true);
                            break;
                        }
                    }
                } else {
                    bj3Var.b(false);
                    break;
                }
                break;
            case 20:
                mt9 mt9Var = (mt9) this.c;
                int i18 = this.b;
                String str4 = (String) this.d;
                int i19 = mt9Var.t0;
                mt9Var.r = null;
                if (i18 == mt9Var.e0) {
                    if (mt9Var.n >= 0) {
                        ConnectionsManager.getInstance(i19).cancelRequest(mt9Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str4;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    mt9Var.n = ConnectionsManager.getInstance(i19).sendRequest(tL_channels_searchPosts, new b97(mt9Var, i18, str4, (byte) 4));
                    break;
                }
                break;
            case 21:
                int i20 = this.b;
                int[] iArr4 = (int[]) this.c;
                xm3 xm3Var = (xm3) this.d;
                kk7 f = kk7.f(i20);
                for (int i21 : iArr4) {
                    f.n(xm3Var, i21);
                }
                break;
            case 22:
                up3 up3Var = (up3) this.c;
                k27 k27Var = (k27) this.d;
                int i22 = this.b;
                ArrayList arrayList3 = up3Var.H;
                TLRPC.Document F0 = k27Var.F0();
                for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                    TLRPC.Document F02 = ((k27) arrayList3.get(i23)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList3.remove(i23);
                        up3Var.getNotificationCenter().k(kk7.d5, new Object[0]);
                        if (i22 == 0) {
                            kk7.e().k(kk7.R4, 1, k96.a0("MessageNotFound", null, 2131748360, new Object[0]));
                            break;
                        } else if (i22 == -1) {
                            LaunchActivity.E(2);
                            break;
                        }
                    }
                }
                break;
            case 23:
                ex3 ex3Var = (ex3) this.c;
                vf6 vf6Var = (vf6) this.d;
                int i24 = this.b;
                d dVar = ex3Var.U2.m1;
                if (dVar instanceof mu1) {
                    mu1 mu1Var3 = (mu1) dVar;
                    mu1Var3.b6();
                    undoView = mu1Var3.N3;
                } else if (dVar instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) dVar).M;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (vf6Var.m() == 1) {
                        undoView2.m(Integer.valueOf(i24), 53, ((TLRPC.Dialog) vf6Var.n(0)).id);
                        break;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i24), Integer.valueOf(vf6Var.m()), null, null);
                        break;
                    }
                }
                break;
            case 24:
                q04 q04Var = (q04) this.c;
                hd[] hdVarArr = (hd[]) this.d;
                int i25 = this.b;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new xs0(q04Var, i25, b));
                    hdVarArr[0].show();
                    break;
                }
                break;
            case 25:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 26:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 27:
                int i26 = this.b;
                d dVar2 = (d) this.c;
                p8c p8cVar = (p8c) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i26;
                dVar2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new b97(dVar2, i26, p8cVar, (byte) 6));
                break;
            case 28:
                ((View) this.d).postOnAnimation(new sm3(this.c, this.b, (byte) 7));
                break;
            default:
                o15 o15Var = (o15) this.c;
                buc bucVar = (buc) this.d;
                int i27 = this.b;
                p15 p15Var = o15Var.c;
                if (p15Var.c(bucVar, i27)) {
                    p15Var.f("invalid streaming JSON");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ va7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ va7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ va7(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
