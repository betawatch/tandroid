package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class y0 extends TLObject {
    public long a;
    public long b;
    public String c;
    public a2 d;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.a = inputSerializedData.readInt64(z9);
        this.b = inputSerializedData.readInt64(z9);
        this.c = inputSerializedData.readString(z9);
        a2 a2Var = new a2();
        this.d = a2Var;
        a2Var.readParams(inputSerializedData, z9);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.a);
        outputSerializedData.writeInt64(this.b);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
