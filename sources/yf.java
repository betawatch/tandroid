// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf implements ed, us2, kg7, l8c, eq6, xcb, NativeInstance.PayloadCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 16;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // us2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        o6a o6aVar;
        tv6 tv6Var = (tv6) this.c;
        su6 su6Var = (su6) this.d;
        try {
            o6aVar = (o6a) ((t56) obj).get();
            gre.l(o6aVar, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            lad.g("MediaSessionStub", "Session operation failed", e);
            o6aVar = new o6a(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e2) {
            lad.g("MediaSessionStub", "Session operation cancelled", e2);
            o6aVar = new o6a(1);
        } catch (ExecutionException e3) {
            e = e3;
            lad.g("MediaSessionStub", "Session operation failed", e);
            o6aVar = new o6a(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        ox6.W(tv6Var, su6Var, this.b, o6aVar);
    }

    @Override // kg7
    public final void b(Canvas canvas) {
        qh9 qh9Var = (qh9) this.c;
        View view = (View) this.d;
        AtomicReference atomicReference = qh9Var.E;
        StaticLayout staticLayout = qh9Var.b;
        ArrayList arrayList = qh9Var.x;
        qla.g(view, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        ama.a(canvas, qh9Var.b);
        gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // eq6
    public final void f(String str, ArrayList arrayList) {
        b1b b1bVar = (b1b) this.c;
        HashMap hashMap = (HashMap) this.d;
        c1b c1bVar = b1bVar.a;
        int i = c1bVar.Q;
        HashMap hashMap2 = c1bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((dq6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    b1bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        c1bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                c1bVar.f();
            }
        }
    }

    @Override // l8c
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String V = k27.V(document, "😀", Integer.valueOf(i));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        hd hdVar = new hd(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = hq6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = hq6.c0(document, str);
        ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_stickers_addStickerToSet, new vt0((Object) hdVar, i, (Object) document, obj, (Object) tL_stickers_addStickerToSet, (byte) 13));
        try {
            hdVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override // xcb
    public final Object m() {
        z90 z90Var = (z90) this.c;
        ((xl3) z90Var.d).F((ra0) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (boolean[]) this.d, i, str);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hj hjVar = (hj) obj2;
                yc7 yc7Var = (yc7) obj;
                String trim = hjVar.getText().toString().trim();
                if (trim.length() <= i2 && !trim.isEmpty()) {
                    yc7Var.a(trim);
                    hdVar.dismiss();
                    break;
                } else {
                    gl.z3(hjVar);
                    break;
                }
                break;
            case 1:
                c41 c41Var = (c41) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = c41Var.getText().toString();
                if (obj3.length() <= 32) {
                    j41 d = j41.d(i2);
                    TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c.message;
                        tL_inputBusinessChatLink.entities = c.entities;
                        tL_inputBusinessChatLink.title = obj3;
                        d.b(c, tL_inputBusinessChatLink, null);
                    }
                    hdVar.dismiss();
                    break;
                } else {
                    gl.z3(c41Var);
                    break;
                }
            case 2:
                mu1 mu1Var = (mu1) obj2;
                mu1Var.getMessagesController().E3(mu1Var.e, mu1Var.f, this.b, false, !r4[1], ((boolean[]) obj)[0]);
                m21 B = u21.B(mu1Var, true, null, null, mu1Var.Ba);
                B.j();
                q11 q11Var = B.e;
                q11Var.postDelayed(new b11(q11Var, (byte) 2), 550L);
                break;
            case 3:
                ((mu1) obj2).s9(i2, (k27) obj);
                break;
            case 4:
            case 8:
            case 11:
            case 12:
            default:
                ((StickersActivity) obj2).j0(i2, (ArrayList) obj);
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                h75 h75Var = ((f65) obj2).r1.b;
                h75Var.T2.C(i2, editTextBoldCursor.getText().toString());
                gl.t1(editTextBoldCursor);
                h75Var.c1().j(i2 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                HashMap hashMap = (HashMap) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && gl.H1((d) b00.f(1, arrayList))) {
                    qa6 qa6Var = new qa6(0);
                    qa6Var.M0 = new jh((Object) hashMap, i2, (byte) 10);
                    launchActivity.t0(qa6Var);
                    break;
                }
                break;
            case 7:
                ((qa6) obj2).H0(900, i2, (TLRPC.User) obj);
                break;
            case 9:
                hmc.L0(i2, (wjb) obj, (Context) obj2);
                break;
            case 10:
                ((PasscodeActivity) obj2).q0((hn7) obj, i2);
                break;
            case 13:
                ps9 ps9Var = (ps9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = ps9Var.getText().toString();
                if (obj4.length() <= 12) {
                    na7.q1(i2).o4(h19.d(reaction), obj4);
                    hdVar.dismiss();
                    break;
                } else {
                    gl.z3(ps9Var);
                    break;
                }
            case 14:
                ((SessionsActivity) obj2).j0(i2, (boolean[]) obj);
                break;
        }
    }

    public /* synthetic */ yf(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ yf(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
