// default package

import java.io.ByteArrayOutputStream;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p66 {
    public final int a;
    public int c;
    public zl3 d;
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
    public final /* synthetic */ q66 x;
    public final byte[] b = new byte[gc1.AUDIO_CONTENT_SAMPLING_RATE];
    public String j = "";
    public final ByteArrayOutputStream p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream q = new ByteArrayOutputStream();

    public p66(q66 q66Var, int i) {
        this.x = q66Var;
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
            DictationLid.h(DictationLid.j[this.s], new jh((Object) this, i, (byte) 12), null, byteArrayOutputStream.toByteArray());
        }
    }

    public final void b() {
        p66 p66Var;
        if (this.j.isEmpty()) {
            p66Var = this;
        } else {
            p66Var = this;
            gl.d3(new b61((Object) p66Var, this.f, (Object) this.j, true, (byte) 2));
            p66Var.j = "";
        }
        q66 q66Var = p66Var.x;
        long j = q66Var.f;
        q66Var.f = 1 + j;
        p66Var.f = j;
        p66Var.q.reset();
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
            System.arraycopy(bArr, (i + i2) - gc1.AUDIO_CONTENT_SAMPLING_RATE, bArr2, 0, gc1.AUDIO_CONTENT_SAMPLING_RATE);
            this.c = gc1.AUDIO_CONTENT_SAMPLING_RATE;
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
