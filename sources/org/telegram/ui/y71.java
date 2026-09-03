package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ y71(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sz0(this.b, 17));
                break;
            case 1:
                final int i10 = 1;
                final SessionsActivity sessionsActivity = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a81
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.qc a02;
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                SessionsActivity sessionsActivity2 = sessionsActivity;
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity2);
                                        i11 = R.raw.contact_check;
                                        i12 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity2);
                                        i11 = R.raw.error;
                                        i12 = R.string.UnknownError;
                                    }
                                    kf.k0.v(i12, a02, i11, 36);
                                    sessionsActivity2.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.k0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.k0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i11 = 0; i11 < 4; i11++) {
                    UserConfig userConfig = UserConfig.getInstance(i11);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i11).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i11).setUserId(userConfig.getClientUserId());
                    }
                }
                break;
            case 2:
                final int i12 = 2;
                final SessionsActivity sessionsActivity2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a81
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.qc a02;
                        int i112;
                        int i122;
                        switch (i12) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity22);
                                        i112 = R.raw.contact_check;
                                        i122 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity22);
                                        i112 = R.raw.error;
                                        i122 = R.string.UnknownError;
                                    }
                                    kf.k0.v(i122, a02, i112, 36);
                                    sessionsActivity22.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.k0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.k0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i13 = 0; i13 < 4; i13++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i13);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i13).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i13).setUserId(userConfig2.getClientUserId());
                    }
                }
                break;
            default:
                final int i14 = 0;
                final SessionsActivity sessionsActivity3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a81
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.qc a02;
                        int i112;
                        int i122;
                        switch (i14) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity3;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity22);
                                        i112 = R.raw.contact_check;
                                        i122 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.qc.a0(sessionsActivity22);
                                        i112 = R.raw.error;
                                        i122 = R.string.UnknownError;
                                    }
                                    kf.k0.v(i122, a02, i112, 36);
                                    sessionsActivity22.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity32 = sessionsActivity3;
                                if (sessionsActivity32.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity32), R.raw.contact_check, 36);
                                    sessionsActivity32.k0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    kf.k0.v(R.string.AllSessionsTerminated, org.telegram.ui.Components.qc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.k0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
