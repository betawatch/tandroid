package vh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k9 extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        if (!l9.a()) {
            return a1.g.p(new StringBuilder(), (int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F");
        }
        return Math.round(this.d) + "°C";
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.a);
        outputSerializedData.writeDouble(this.b);
        outputSerializedData.writeString(this.c);
        outputSerializedData.writeFloat(this.d);
    }
}
