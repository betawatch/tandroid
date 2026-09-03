package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ s8(n9 n9Var, org.telegram.ui.ActionBar.d2 d2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, int i10) {
        this.a = i10;
        this.b = n9Var;
        this.c = d2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final n9 n9Var = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z4 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.v8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                n9.V(n9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                break;
                            default:
                                n9.Y(n9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final n9 n9Var2 = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z10 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.v8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                n9.V(n9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                break;
                            default:
                                n9.Y(n9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
