package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k2 extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        int readInt32 = inputSerializedData.readInt32(z4);
        for (int i10 = 0; i10 < readInt32; i10++) {
            l2 l2Var = new l2();
            l2Var.readParams(inputSerializedData, z4);
            if (TextUtils.isEmpty(l2Var.b)) {
                return;
            }
            this.a.add(l2Var);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((l2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
