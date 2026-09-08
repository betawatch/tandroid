package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class e1 extends TLObject {
    public long a;
    public long b;
    public String c;
    public n2 d;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.a = inputSerializedData.readInt64(z10);
        this.b = inputSerializedData.readInt64(z10);
        this.c = inputSerializedData.readString(z10);
        n2 n2Var = new n2();
        this.d = n2Var;
        n2Var.readParams(inputSerializedData, z10);
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
