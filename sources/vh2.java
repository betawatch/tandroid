// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vh2 implements d73, id2, zn9, t84, u84, OnFailureListener {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public vh2(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                break;
            case 3:
            default:
                this.b = 0L;
                break;
            case 4:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
        }
    }

    public final void A() {
        this.b = 0L;
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var != null) {
            vh2Var.A();
        }
    }

    @Override // u84
    public final void B() {
        ((u84) this.c).B();
    }

    public final void C(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            q();
            ((vh2) this.c).C(i - 64);
        }
    }

    @Override // d73
    public final long J(long j, long j2) {
        oi2 oi2Var = (oi2) this.c;
        return hac.f(oi2Var.e, j + this.b, true);
    }

    @Override // d73
    public final boolean T() {
        return true;
    }

    @Override // d73
    public final long V() {
        return 0L;
    }

    @Override // d73
    public final long X(long j) {
        return ((oi2) this.c).a;
    }

    public final void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var != null) {
            vh2Var.a(i - 64);
        }
    }

    @Override // t84
    public final void b(int i, int i2, byte[] bArr) {
        ((vb3) this.c).d(bArr, i, i2, false);
    }

    @Override // t84
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((vb3) this.c).c(bArr, 0, i2, z);
    }

    @Override // u84
    public final yzb c0(int i, int i2) {
        return ((u84) this.c).c0(i, i2);
    }

    @Override // t84
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((vb3) this.c).d(bArr, i, i2, z);
    }

    @Override // d73
    public final long e(long j) {
        return ((oi2) this.c).e[(int) j] - this.b;
    }

    @Override // d73
    public final long e0(long j, long j2) {
        return ((oi2) this.c).a;
    }

    @Override // t84
    public final long f() {
        return ((vb3) this.c).f() - this.b;
    }

    @Override // u84
    public final void f0(ix9 ix9Var) {
        ((u84) this.c).f0(new fya(this, ix9Var, ix9Var));
    }

    @Override // t84
    public final void g(int i) {
        ((vb3) this.c).a(i, false);
    }

    @Override // t84
    public final long getLength() {
        return ((vb3) this.c).c - this.b;
    }

    @Override // t84
    public final long getPosition() {
        return ((vb3) this.c).d - this.b;
    }

    @Override // id2
    public final void h() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        zxb zxbVar = new zxb(bundle);
        zxbVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        zxbVar.e = profileActivity.s5;
        profileActivity.presentFragment(zxbVar);
    }

    @Override // t84
    public final void i() {
        ((vb3) this.c).f = 0;
    }

    @Override // d73
    public final long j(long j, long j2) {
        return ((oi2) this.c).d[(int) j];
    }

    @Override // t84
    public final void k(int i) {
        ((vb3) this.c).m(i, false);
    }

    @Override // zn9
    public final void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((om9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // d73
    public final long m(long j, long j2) {
        return 0L;
    }

    public final int n(int i) {
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(j & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + vh2Var.n(i - 64);
    }

    @Override // zn9
    public final void o(MediaFormat mediaFormat) {
        ((om9) this.c).n(mediaFormat, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 9:
                int statusCode = exc instanceof ap ? ((ap) exc).getStatusCode() : 13;
                long j = this.b;
                Iterator it = ((k89) ((wm9) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((wbd) it.next()).b(j, statusCode, null);
                }
                break;
            case 10:
                ((b0f) this.c).b.set(this.b);
                break;
            case 11:
                ((b0f) this.c).b.set(this.b);
                break;
            default:
                ((AtomicLong) ((rhb) this.c).c).set(this.b);
                break;
        }
    }

    @Override // id2
    public final void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().o2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            c41.A(profileActivity, z, null).j();
        }
        profileActivity.S3();
        profileActivity.e4(true);
    }

    public final void q() {
        if (((vh2) this.c) == null) {
            this.c = new vh2((byte) 0);
        }
    }

    @Override // id2
    public final void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = kt6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new st8(k, profileActivity.A0));
        }
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        return ((vb3) this.c).read(bArr, i, i2);
    }

    @Override // t84
    public final void readFully(byte[] bArr, int i, int i2) {
        ((vb3) this.c).c(bArr, i, i2, false);
    }

    @Override // id2
    public final void s() {
        int i;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i = ((d) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(lo7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z;
        sharedPreferences.edit().putBoolean("sound_enabled_" + lo7.p(j, profileActivity.g1, false), z2).apply();
        if (c41.a(profileActivity)) {
            c41.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override // id2
    public final void t(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().o2(this.b, profileActivity.g1, null)) {
                p();
            }
            if (c41.a(profileActivity)) {
                c41.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.e7;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (c41.a(profileActivity)) {
            c41.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.S3();
        profileActivity.e4(true);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((vh2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((vh2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // d73
    public final long u(long j, long j2) {
        return -9223372036854775807L;
    }

    public final void v(ak7 ak7Var) {
        this.b++;
        Thread thread = new Thread(ak7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(ak7Var);
        thread.start();
    }

    @Override // d73
    public final b19 w(long j) {
        return new b19(((oi2) this.c).c[(int) j], null, r6.b[r7]);
    }

    public final boolean x(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        q();
        return ((vh2) this.c).x(i - 64);
    }

    public final void y(int i, boolean z) {
        if (i >= 64) {
            q();
            ((vh2) this.c).y(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            C(i);
        } else {
            a(i);
        }
        if (z2 || ((vh2) this.c) != null) {
            q();
            ((vh2) this.c).y(0, z2);
        }
    }

    public final boolean z(int i) {
        if (i >= 64) {
            q();
            return ((vh2) this.c).z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight(j3 & (~j4), 1);
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var != null) {
            if (vh2Var.x(0)) {
                C(63);
            }
            ((vh2) this.c).z(0);
        }
        return z;
    }

    @Override // id2
    public final void dismiss() {
    }

    public /* synthetic */ vh2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public vh2(vb3 vb3Var, long j) {
        this.a = (byte) 7;
        this.c = vb3Var;
        jte.f(vb3Var.d >= j);
        this.b = j;
    }

    public /* synthetic */ vh2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
