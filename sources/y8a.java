// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y8a implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ y8a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                gm.c3(new c0a(sessionsActivity, (byte) 8));
                break;
            case 1:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: a9a
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b4) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ts2.u(null, 2131754250, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    } else {
                                        ts2.u(null, 2131743566, c41.b0(sessionsActivity2), R.raw.error, 36);
                                    }
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i = 0; i < 4; i++) {
                    z8c h = z8c.h(i);
                    if (h.o()) {
                        h.d = false;
                        h.u(false);
                        oc7.r1(i).e4(gda.e, gda.f);
                        ConnectionsManager.getInstance(i).setUserId(h.e());
                    }
                }
                break;
            case 2:
                final byte b4 = 2;
                gm.c3(new Runnable() { // from class: a9a
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b42) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ts2.u(null, 2131754250, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    } else {
                                        ts2.u(null, 2131743566, c41.b0(sessionsActivity2), R.raw.error, 36);
                                    }
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i2 = 0; i2 < 4; i2++) {
                    z8c h2 = z8c.h(i2);
                    if (h2.o()) {
                        h2.d = false;
                        h2.u(false);
                        oc7.r1(i2).e4(gda.e, gda.f);
                        ConnectionsManager.getInstance(i2).setUserId(h2.e());
                    }
                }
                break;
            default:
                gm.c3(new Runnable() { // from class: a9a
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (b42) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        ts2.u(null, 2131754250, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    } else {
                                        ts2.u(null, 2131743566, c41.b0(sessionsActivity2), R.raw.error, 36);
                                    }
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    ts2.u(null, 2131754255, c41.b0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
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
