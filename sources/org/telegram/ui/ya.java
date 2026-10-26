package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ya(wb wbVar, int i10) {
        this.a = i10;
        this.b = wbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final wb wbVar = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    wb.V(wbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    wb.Z(wbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                wb wbVar2 = this.b;
                wbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    wbVar2.getMessagesController().putUsers(arrayList2, false);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(24, this.b, tLObject));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final wb wbVar3 = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    wb.V(wbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    wb.Z(wbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 9));
                break;
        }
    }
}
