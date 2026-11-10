package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ r21(SessionsActivity sessionsActivity, int i7) {
        this.a = i7;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new uu0(this.b, 19));
                break;
            case 1:
                final int i7 = 1;
                final SessionsActivity sessionsActivity = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.t21
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (i10) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.gc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(sessionsActivity2), R.raw.error, 36);
                                    }
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.p0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i10 = 0; i10 < 4; i10++) {
                    org.telegram.messenger.p10 i11 = org.telegram.messenger.p10.i(i10);
                    if (i11.p()) {
                        i11.d = false;
                        i11.v(false);
                        org.telegram.messenger.qp.s1(i10).Z3(org.telegram.messenger.iz.f, org.telegram.messenger.iz.g);
                        ConnectionsManager.getInstance(i10).setUserId(i11.e());
                    }
                }
                break;
            case 2:
                final int i12 = 2;
                final SessionsActivity sessionsActivity2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.t21
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                        switch (i102) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.error, 36);
                                    }
                                    sessionsActivity22.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.p0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i13 = 0; i13 < 4; i13++) {
                    org.telegram.messenger.p10 i14 = org.telegram.messenger.p10.i(i13);
                    if (i14.p()) {
                        i14.d = false;
                        i14.v(false);
                        org.telegram.messenger.qp.s1(i13).Z3(org.telegram.messenger.iz.f, org.telegram.messenger.iz.g);
                        ConnectionsManager.getInstance(i13).setUserId(i14.e());
                    }
                }
                break;
            default:
                final int i15 = 0;
                final SessionsActivity sessionsActivity3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.t21
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i15;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity3;
                        switch (i102) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.error, 36);
                                    }
                                    sessionsActivity22.p0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.p0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.gc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.p0(false);
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
