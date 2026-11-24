// default package

import java.io.ByteArrayOutputStream;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p86 {
    public final int a;
    public int c;
    public kn3 d;
    public long e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public final /* synthetic */ q86 x;
    public final byte[] b = new byte[od1.AUDIO_CONTENT_SAMPLING_RATE];
    public String j = "";
    public final ByteArrayOutputStream p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream q = new ByteArrayOutputStream();

    public p86(q86 q86Var, int i) {
        this.x = q86Var;
        this.a = i;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.p;
        if (this.s < 0 || this.u || this.d == null || DictationLid.c == 0) {
            return;
        }
        int size = byteArrayOutputStream.size();
        if (size - this.t >= 16000) {
            this.t = size;
            this.u = true;
            int i = this.r;
            DictationLid.h(DictationLid.j[this.s], new ji((Object) this, i, (byte) 12), null, byteArrayOutputStream.toByteArray());
        }
    }

    public final void b() {
        p86 p86Var;
        if (this.j.isEmpty()) {
            p86Var = this;
        } else {
            p86Var = this;
            gm.c3(new i71((Object) p86Var, this.f, (Object) this.j, true, (byte) 2));
            p86Var.j = "";
        }
        q86 q86Var = p86Var.x;
        long j = q86Var.f;
        q86Var.f = 1 + j;
        p86Var.f = j;
        p86Var.q.reset();
    }

    public final void c(int i, int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = this.q;
        ByteArrayOutputStream byteArrayOutputStream2 = this.p;
        if (this.s < 0 || DictationLid.c == 0) {
            return;
        }
        if (byteArrayOutputStream2.size() <= 1920000) {
            byteArrayOutputStream2.write(bArr, i, i2);
            byteArrayOutputStream.write(bArr, i, i2);
        } else {
            this.s = -1;
            byteArrayOutputStream2.reset();
            byteArrayOutputStream.reset();
        }
    }

    public final void d(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.b;
        if (i2 >= 16000) {
            System.arraycopy(bArr, (i + i2) - od1.AUDIO_CONTENT_SAMPLING_RATE, bArr2, 0, od1.AUDIO_CONTENT_SAMPLING_RATE);
            this.c = od1.AUDIO_CONTENT_SAMPLING_RATE;
        } else {
            int min = Math.min(this.c, 16000 - i2);
            System.arraycopy(bArr2, this.c - min, bArr2, 0, min);
            System.arraycopy(bArr, i, bArr2, min, i2);
            this.c = min + i2;
        }
    }

    public final void e() {
        this.r++;
        this.p.reset();
        this.q.reset();
        this.s = this.x.c ? 0 : -1;
        this.t = 0;
        this.o = 0;
        this.v = false;
    }
}
