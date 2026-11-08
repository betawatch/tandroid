package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class z1 extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        for (int i7 = 0; i7 < readInt32; i7++) {
            a2 a2Var = new a2();
            a2Var.readParams(inputSerializedData, z9);
            if (TextUtils.isEmpty(a2Var.b)) {
                return;
            }
            this.a.add(a2Var);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((a2) arrayList.get(i7)).serializeToStream(outputSerializedData);
        }
    }
}
