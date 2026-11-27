// default package

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class vwc extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        boolean a = wwc.a();
        float f = this.d;
        if (!a) {
            return uh9.l(new StringBuilder(), (int) Math.round(((f * 9.0d) / 5.0d) + 32.0d), "°F");
        }
        return Math.round(f) + "°C";
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.a);
        outputSerializedData.writeDouble(this.b);
        outputSerializedData.writeString(this.c);
        outputSerializedData.writeFloat(this.d);
    }
}
