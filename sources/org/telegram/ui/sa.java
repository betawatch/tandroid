package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;

    public /* synthetic */ sa(ub ubVar, int i10) {
        this.a = i10;
        this.b = ubVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 9));
                break;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final ub ubVar = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ua
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ub.U(ubVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    ub.Y(ubVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 2:
                ub ubVar2 = this.b;
                ubVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    ubVar2.getMessagesController().putUsers(arrayList2, false);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(28, this.b, tLObject));
                break;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final ub ubVar3 = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ua
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ub.U(ubVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    ub.Y(ubVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }
}
