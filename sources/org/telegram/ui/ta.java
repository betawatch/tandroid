package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ta(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final sb sbVar = this.b;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    sb.Y(sbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    sb.c0(sbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    sbVar2.getMessagesController().V3(arrayList2, false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.i0.g3(new h0(14, this.b, tLObject));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final sb sbVar3 = this.b;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    sb.Y(sbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    sb.c0(sbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new p1(this.b, tL_error, tLObject, 9));
                break;
        }
    }
}
