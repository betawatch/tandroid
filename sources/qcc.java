// default package

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qcc extends TLObject {
    public static final /* synthetic */ int C = 0;
    public MediaCodecPlayer B;
    public int a;
    public boolean b;
    public boolean c;
    public String d;
    public float e = 1.0f;
    public long f = 0;
    public boolean i = true;
    public float j;
    public float k;
    public int l;
    public int m;
    public long o;
    public rl2 r;
    public FloatBuffer s;
    public FloatBuffer t;
    public kn u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(g6b g6bVar) {
        if (g6bVar == null || g6bVar.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < g6bVar.T.size(); i++) {
            g6b g6bVar2 = (g6b) g6bVar.T.get(i);
            qcc qccVar = new qcc();
            qccVar.e = 1.0f;
            qccVar.f = 0L;
            qccVar.i = true;
            qccVar.b = g6bVar2.K;
            qccVar.c = g6bVar2.Y;
            qccVar.d = g6bVar2.L.getAbsolutePath();
            qccVar.e = g6bVar2.P;
            qccVar.i = g6bVar2.U;
            qccVar.f = g6bVar2.X;
            qccVar.j = g6bVar2.V;
            qccVar.k = g6bVar2.W;
            qccVar.l = g6bVar2.k0;
            qccVar.m = g6bVar2.l0;
            qccVar.o = g6bVar2.h0;
            qccVar.r = (rl2) g6bVar.S.e.get(i);
            arrayList.add(qccVar);
        }
        return arrayList;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        this.a = readInt32;
        this.b = (readInt32 & 1) != 0;
        this.i = (readInt32 & 2) != 0;
        this.c = (readInt32 & 4) != 0;
        this.d = inputSerializedData.readString(z);
        this.e = inputSerializedData.readFloat(z);
        this.f = inputSerializedData.readInt64(z);
        this.j = inputSerializedData.readFloat(z);
        this.k = inputSerializedData.readFloat(z);
        this.l = inputSerializedData.readInt32(z);
        this.m = inputSerializedData.readInt32(z);
        this.o = inputSerializedData.readInt64(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z = this.b;
        int i = this.a;
        int i2 = z ? i | 1 : i & (-2);
        this.a = i2;
        int i3 = this.i ? i2 | 2 : i2 & (-3);
        this.a = i3;
        int i4 = this.c ? i3 | 4 : i3 & (-5);
        this.a = i4;
        outputSerializedData.writeInt32(i4);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeInt64(this.f);
        outputSerializedData.writeFloat(this.j);
        outputSerializedData.writeFloat(this.k);
        outputSerializedData.writeInt32(this.l);
        outputSerializedData.writeInt32(this.m);
        outputSerializedData.writeInt64(this.o);
    }
}
