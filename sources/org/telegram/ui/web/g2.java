package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g2 extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i9 = 0; i9 < readInt32; i9++) {
            h2 h2Var = new h2();
            h2Var.readParams(inputSerializedData, z10);
            if (TextUtils.isEmpty(h2Var.b)) {
                return;
            }
            this.a.add(h2Var);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((h2) arrayList.get(i9)).serializeToStream(outputSerializedData);
        }
    }
}
