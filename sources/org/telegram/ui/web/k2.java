package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
