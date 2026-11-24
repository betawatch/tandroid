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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yg implements ee, fu2, ni7, mac, es6, yeb, NativeInstance.PayloadCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yg(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 17;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // fu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        q8a q8aVar;
        tx6 tx6Var = (tx6) this.c;
        sw6 sw6Var = (sw6) this.d;
        try {
            q8aVar = (q8a) ((t76) obj).get();
            jte.l(q8aVar, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            ncd.g("MediaSessionStub", "Session operation failed", e);
            q8aVar = new q8a(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e2) {
            ncd.g("MediaSessionStub", "Session operation cancelled", e2);
            q8aVar = new q8a(1);
        } catch (ExecutionException e3) {
            e = e3;
            ncd.g("MediaSessionStub", "Session operation failed", e);
            q8aVar = new q8a(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        oz6.W(tx6Var, sw6Var, this.b, q8aVar);
    }

    @Override // ni7
    public final void b(Canvas canvas) {
        tj9 tj9Var = (tj9) this.c;
        View view = (View) this.d;
        AtomicReference atomicReference = tj9Var.E;
        StaticLayout staticLayout = tj9Var.b;
        ArrayList arrayList = tj9Var.x;
        rna.g(view, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        boa.a(canvas, tj9Var.b);
        gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // yeb
    public final Object e() {
        za0 za0Var = (za0) this.c;
        ((in3) za0Var.d).E((rb0) this.d, this.b + 1, false);
        return null;
    }

    @Override // es6
    public final void f(String str, ArrayList arrayList) {
        d3b d3bVar = (d3b) this.c;
        HashMap hashMap = (HashMap) this.d;
        e3b e3bVar = d3bVar.a;
        int i = e3bVar.Q;
        HashMap hashMap2 = e3bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((ds6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    d3bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        e3bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                e3bVar.f();
            }
        }
    }

    @Override // mac
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String V = k47.V(document, "😀", Integer.valueOf(i));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        he heVar = new he(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = hs6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = hs6.c0(document, str);
        ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_stickers_addStickerToSet, new ev0((Object) heVar, i, (Object) document, obj, (Object) tL_stickers_addStickerToSet, (byte) 13));
        try {
            heVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hk hkVar = (hk) obj2;
                af7 af7Var = (af7) obj;
                String trim = hkVar.getText().toString().trim();
                if (trim.length() <= i2 && !trim.isEmpty()) {
                    af7Var.a(trim);
                    heVar.dismiss();
                    break;
                } else {
                    gm.z3(hkVar);
                    break;
                }
                break;
            case 1:
                j51 j51Var = (j51) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = j51Var.getText().toString();
                if (obj3.length() <= 32) {
                    q51 d = q51.d(i2);
                    TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c.message;
                        tL_inputBusinessChatLink.entities = c.entities;
                        tL_inputBusinessChatLink.title = obj3;
                        d.b(c, tL_inputBusinessChatLink, null);
                    }
                    heVar.dismiss();
                    break;
                } else {
                    gm.z3(j51Var);
                    break;
                }
            case 2:
                yv1 yv1Var = (yv1) obj2;
                yv1Var.getMessagesController().G3(yv1Var.e, yv1Var.f, this.b, false, !r4[1], ((boolean[]) obj)[0]);
                u31 B = c41.B(yv1Var, true, null, null, yv1Var.Ba);
                B.j();
                y21 y21Var = B.e;
                y21Var.postDelayed(new j21(y21Var, (byte) 2), 550L);
                break;
            case 3:
                ((yv1) obj2).C9(i2, (k47) obj);
                break;
            case 4:
            case 5:
            case 9:
            case 12:
            case 13:
            default:
                ((StickersActivity) obj2).k0(i2, (ArrayList) obj);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                g95 g95Var = ((d85) obj2).r1.b;
                g95Var.T2.C(i2, editTextBoldCursor.getText().toString());
                gm.t1(editTextBoldCursor);
                g95Var.c1().j(i2 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                HashMap hashMap = (HashMap) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && gm.H1((d) b10.f(1, arrayList))) {
                    pc6 pc6Var = new pc6(0);
                    pc6Var.M0 = new ji((Object) hashMap, i2, (byte) 10);
                    launchActivity.t0(pc6Var);
                    break;
                }
                break;
            case 8:
                ((pc6) obj2).I0(900, i2, (TLRPC.User) obj);
                break;
            case 10:
                goc.M0(i2, (ylb) obj, (Context) obj2);
                break;
            case 11:
                ((PasscodeActivity) obj2).r0((lp7) obj, i2);
                break;
            case 14:
                ru9 ru9Var = (ru9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = ru9Var.getText().toString();
                if (obj4.length() <= 12) {
                    oc7.r1(i2).q4(k39.d(reaction), obj4);
                    heVar.dismiss();
                    break;
                } else {
                    gm.z3(ru9Var);
                    break;
                }
            case 15:
                ((SessionsActivity) obj2).k0(i2, (boolean[]) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (boolean[]) this.d, i, str);
    }

    public /* synthetic */ yg(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ yg(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
