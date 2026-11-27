// default package

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
