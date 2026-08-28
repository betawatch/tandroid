package yf;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 extends TLObject {
    public static final /* synthetic */ int j = 0;
    public int a;
    public String b;
    public String c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f = true;
    public int i;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        this.a = readInt32;
        this.e = (readInt32 & 8) != 0;
        this.f = (readInt32 & 16) != 0;
        this.c = inputSerializedData.readString(z10);
        if ((this.a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.a & 2) != 0) {
            this.b = inputSerializedData.readString(z10);
        }
        if ((this.a & 4) != 0) {
            this.i = inputSerializedData.readInt32(z10);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-625858389);
        this.a = this.d != null ? this.a | 1 : this.a & (-2);
        int i9 = !TextUtils.isEmpty(this.b) ? this.a | 2 : this.a & (-3);
        this.a = i9;
        int i10 = this.e ? i9 | 8 : i9 & (-9);
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
