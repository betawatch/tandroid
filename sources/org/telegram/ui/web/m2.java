package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m2 extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < readInt32; i10++) {
            n2 n2Var = new n2();
            n2Var.readParams(inputSerializedData, z10);
            if (TextUtils.isEmpty(n2Var.b)) {
                return;
            }
            this.a.add(n2Var);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((n2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
