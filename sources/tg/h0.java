package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h0 extends TLObject {
    public static final /* synthetic */ int j = 0;
    public int a;
    public String b;
    public String c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f = true;
    public int i;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        this.a = readInt32;
        this.e = (readInt32 & 8) != 0;
        this.f = (readInt32 & 16) != 0;
        this.c = inputSerializedData.readString(z9);
        if ((this.a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.a & 2) != 0) {
            this.b = inputSerializedData.readString(z9);
        }
        if ((this.a & 4) != 0) {
            this.i = inputSerializedData.readInt32(z9);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-625858389);
        this.a = this.d != null ? this.a | 1 : this.a & (-2);
        int i7 = !TextUtils.isEmpty(this.b) ? this.a | 2 : this.a & (-3);
        this.a = i7;
        int i10 = this.e ? i7 | 8 : i7 & (-9);
        this.a = i10;
        int i11 = this.f ? i10 | 16 : i10 & (-17);
        this.a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.c);
        if ((this.a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.a & 2) != 0) {
            outputSerializedData.writeString(this.b);
        }
        if ((this.a & 4) != 0) {
            outputSerializedData.writeInt32(this.i);
        }
    }
}
