// default package

import android.graphics.Canvas;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vlc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vlc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                ((VoIPService) this.b).lambda$startGroupCall$24((TL_update.TL_updateGroupCall) this.c);
                return;
            case 1:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$59((ps1) this.c);
                return;
            case 2:
                snc sncVar = (snc) this.b;
                knc kncVar = (knc) this.c;
                if (sncVar.c == 0 && sncVar.L == kncVar && kncVar.R) {
                    kncVar.R = false;
                    kncVar.f0 = -1;
                    kncVar.invalidate();
                    return;
                }
                return;
            case 3:
                snc sncVar2 = (snc) this.b;
                m7 m7Var = (m7) this.c;
                if (sncVar2.Y == m7Var) {
                    hl.E3(m7Var);
                    return;
                }
                return;
            case 4:
                snc sncVar3 = (snc) this.b;
                String str = (String) this.c;
                sncVar3.k0 = false;
                if (sncVar3.c == 0) {
                    knc kncVar2 = sncVar3.L;
                    if (kncVar2 != null) {
                        kncVar2.setBusy(false);
                        return;
                    }
                    return;
                }
                if (str == null || str.trim().isEmpty()) {
                    Log.d("VoiceLive", "field: style failed");
                    knc kncVar3 = sncVar3.L;
                    if (kncVar3 != null) {
                        kncVar3.setBusy(false);
                        return;
                    }
                    return;
                }
                sncVar3.g0 = str.trim();
                sncVar3.h0 = sncVar3.b().size();
                knc kncVar4 = sncVar3.L;
                if (kncVar4 != null) {
                    kncVar4.setRevertShown(true);
                    sncVar3.L.setRebuildNext(true);
                }
                sncVar3.q();
                knc kncVar5 = sncVar3.L;
                if (kncVar5 != null) {
                    kncVar5.setRebuildNext(false);
                    sncVar3.L.setBusy(false);
                    return;
                }
                return;
            case 5:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 6:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((icc) this.c);
                return;
            case 7:
                qoc qocVar = (qoc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                zhc zhcVar = (zhc) qocVar.c;
                if (atomicBoolean.get()) {
                    new Thread(new vlc(zhcVar, atomicBoolean, (byte) 8), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 8:
                zhc zhcVar2 = (zhc) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (zhcVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) zhcVar2.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 9:
                icc iccVar = (icc) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                iccVar.a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 10:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(ob6.M0(2131748533, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ya6(hl.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 11:
                ((cg5) this.b).a(((TL_wallet.walletTransaction[]) this.c)[0]);
                return;
            case 12:
                jl7[] jl7VarArr = (jl7[]) this.b;
                jl7VarArr[0].setOnDismissListener(new dl8((TLRPC.User) this.c, (byte) 16));
                jl7VarArr[0].dismiss();
                return;
            case 13:
                ((fx0) this.b).a((Canvas) this.c);
                return;
            case 14:
                ((crc) this.b).e((Canvas) this.c);
                return;
            case 15:
                ((crc) this.b).f((Canvas) this.c);
                return;
            case 16:
                ((ViewGroup) this.c).removeView(((nrc) this.b).h);
                return;
            case 17:
                prc prcVar = (prc) this.b;
                rrc rrcVar = (rrc) this.c;
                prcVar.getClass();
                try {
                    EGLDisplay eGLDisplay = prcVar.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = prcVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, prcVar.j);
                        EGLSurface eGLSurface2 = rrcVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(prcVar.i, eGLSurface2);
                        }
                        rrcVar.h = EGL14.EGL_NO_SURFACE;
                        if (prcVar.f.length == 0) {
                            prcVar.b();
                        }
                    }
                    return;
                } finally {
                    rrcVar.b.release();
                }
            case 18:
                ((pcc) this.b).a((TL_wallet.walletTransaction) this.c);
                return;
            case 19:
                wsc wscVar = (wsc) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (wscVar.b1 || userFull == null) {
                    return;
                }
                wscVar.D1 = SystemClock.elapsedRealtime();
                TL_wallet.card cardVar = userFull.wallet_card;
                if (cardVar == null) {
                    cardVar = new TL_wallet.card();
                }
                wscVar.d(cardVar);
                return;
            case 20:
                atc atcVar = (atc) this.b;
                e eVar = (e) this.c;
                if (eVar instanceof uqc) {
                    atcVar.getClass();
                    if (d31.a(eVar)) {
                        d31.b0(eVar).I(R.raw.contact_check, ob6.M0(2131742739, null), ob6.M0(2131742738, null)).j();
                    }
                }
                atcVar.finishFragment();
                return;
            case 21:
                gtc gtcVar = (gtc) this.b;
                k35 k35Var = (k35) this.c;
                gtcVar.getClass();
                k35Var.C();
                gtcVar.a.g3.O(true);
                return;
            case 22:
                gtc gtcVar2 = (gtc) this.b;
                c cVar = (c) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gtcVar2.getResourceProvider(), gtcVar2.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131742782, null);
                alertDialog$Builder.a.U = ob6.M0(2131742784, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131742787, null), new yw9(gtcVar2, cVar, (byte) 26));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 23:
                id[] idVarArr = (id[]) this.b;
                Runnable runnable = (Runnable) this.c;
                idVarArr[0].dismiss();
                runnable.run();
                return;
            case 24:
                ((ViewGroup) this.c).removeView(((quc) this.b).h);
                return;
            case 25:
                wvc wvcVar = (wvc) this.b;
                int[] iArr = (int[]) this.c;
                int i3 = iArr[0] - 1;
                iArr[0] = i3;
                if (i3 == 0) {
                    wvcVar.a.E0(true);
                    return;
                }
                return;
            case 26:
                cwc cwcVar = (cwc) this.b;
                String str2 = (String) this.c;
                cwcVar.d.clear();
                cwcVar.e.clear();
                cwcVar.f = true;
                cwcVar.F(str2, "", true);
                cwcVar.h = str2;
                cwcVar.f();
                cwcVar.E = null;
                return;
            case 27:
                cwc cwcVar2 = (cwc) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = cwcVar2.F;
                i = ((e) wallpapersListActivity).currentAccount;
                uc7.s1(i).j4(tL_contacts_resolvedPeer.users, false);
                i2 = ((e) wallpapersListActivity).currentAccount;
                uc7.s1(i2).c4(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str3 = cwcVar2.y;
                cwcVar2.y = null;
                cwcVar2.F(str3, "", false);
                return;
            case 28:
                int[] iArr2 = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i4 = iArr2[0];
                if (i4 != 0) {
                    connectionsManager.cancelRequest(i4, true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            default:
                ((xt) this.b).g0.a((Integer) this.c);
                return;
        }
    }
}
