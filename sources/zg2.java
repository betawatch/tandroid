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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zg2 implements j63, nc2, op9, f84, g84, OnFailureListener {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public zg2(byte b) {
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
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var != null) {
            zg2Var.A();
        }
    }

    public final void B(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            t();
            ((zg2) this.c).B(i - 64);
        }
    }

    @Override // g84
    public final void D() {
        ((g84) this.c).D();
    }

    @Override // j63
    public final long I(long j, long j2) {
        sh2 sh2Var = (sh2) this.c;
        return gcc.f(sh2Var.e, j + this.b, true);
    }

    @Override // j63
    public final boolean R() {
        return true;
    }

    @Override // j63
    public final long V() {
        return 0L;
    }

    @Override // j63
    public final long Y(long j) {
        return ((sh2) this.c).a;
    }

    public final void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var != null) {
            zg2Var.a(i - 64);
        }
    }

    @Override // j63
    public final long a0(long j, long j2) {
        return ((sh2) this.c).a;
    }

    @Override // f84
    public final void b(int i, int i2, byte[] bArr) {
        ((cb3) this.c).d(bArr, i, i2, false);
    }

    @Override // f84
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((cb3) this.c).c(bArr, 0, i2, z);
    }

    @Override // f84
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((cb3) this.c).d(bArr, i, i2, z);
    }

    @Override // f84
    public final long e() {
        return ((cb3) this.c).e() - this.b;
    }

    @Override // g84
    public final x1c e0(int i, int i2) {
        return ((g84) this.c).e0(i, i2);
    }

    @Override // j63
    public final long f(long j) {
        return ((sh2) this.c).e[(int) j] - this.b;
    }

    @Override // f84
    public final void g(int i) {
        ((cb3) this.c).a(i, false);
    }

    @Override // f84
    public final long getLength() {
        return ((cb3) this.c).c - this.b;
    }

    @Override // f84
    public final long getPosition() {
        return ((cb3) this.c).d - this.b;
    }

    @Override // f84
    public final void h() {
        ((cb3) this.c).f = 0;
    }

    @Override // nc2
    public final void i() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        zzb zzbVar = new zzb(bundle);
        zzbVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        zzbVar.e = profileActivity.n5;
        profileActivity.presentFragment(zzbVar);
    }

    @Override // j63
    public final long j(long j, long j2) {
        return ((sh2) this.c).d[(int) j];
    }

    @Override // op9
    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((bo9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // nc2
    public final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().p2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            d31.A(profileActivity, z, null).j();
        }
        profileActivity.P3();
        profileActivity.b4(true);
    }

    @Override // nc2
    public final void m() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = qu6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new zu8(k, profileActivity.A0));
        }
    }

    @Override // g84
    public final void m0(zy9 zy9Var) {
        ((g84) this.c).m0(new f0b(this, zy9Var, zy9Var));
    }

    @Override // f84
    public final void n(int i) {
        ((cb3) this.c).l(i, false);
    }

    @Override // op9
    public final void o(MediaFormat mediaFormat) {
        ((bo9) this.c).n(mediaFormat, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 9:
                int statusCode = exc instanceof ao ? ((ao) exc).getStatusCode() : 13;
                long j = this.b;
                Iterator it = ((v99) ((ko9) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((ned) it.next()).b(j, statusCode, null);
                }
                break;
            case 10:
                ((q2f) this.c).b.set(this.b);
                break;
            case 11:
                ((q2f) this.c).b.set(this.b);
                break;
            default:
                ((AtomicLong) ((zhc) this.c).c).set(this.b);
                break;
        }
    }

    @Override // nc2
    public final void p() {
        int i;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i = ((e) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = uc7.s1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(ip7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z;
        sharedPreferences.edit().putBoolean("sound_enabled_" + ip7.p(j, profileActivity.g1, false), z2).apply();
        if (d31.a(profileActivity)) {
            d31.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override // nc2
    public final void q(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().p2(this.b, profileActivity.g1, null)) {
                l();
            }
            if (d31.a(profileActivity)) {
                d31.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (d31.a(profileActivity)) {
            d31.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.P3();
        profileActivity.b4(true);
    }

    @Override // j63
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        return ((cb3) this.c).read(bArr, i, i2);
    }

    @Override // f84
    public final void readFully(byte[] bArr, int i, int i2) {
        ((cb3) this.c).c(bArr, i, i2, false);
    }

    public final int s(int i) {
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(j & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + zg2Var.s(i - 64);
    }

    public final void t() {
        if (((zg2) this.c) == null) {
            this.c = new zg2((byte) 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((zg2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((zg2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public final void u(gk7 gk7Var) {
        this.b++;
        Thread thread = new Thread(gk7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(gk7Var);
        thread.start();
    }

    @Override // j63
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    public final boolean w(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        t();
        return ((zg2) this.c).w(i - 64);
    }

    public final void x(int i, boolean z) {
        if (i >= 64) {
            t();
            ((zg2) this.c).x(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            B(i);
        } else {
            a(i);
        }
        if (z2 || ((zg2) this.c) != null) {
            t();
            ((zg2) this.c).x(0, z2);
        }
    }

    public final boolean y(int i) {
        if (i >= 64) {
            t();
            return ((zg2) this.c).y(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight(j3 & (~j4), 1);
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var != null) {
            if (zg2Var.w(0)) {
                B(63);
            }
            ((zg2) this.c).y(0);
        }
        return z;
    }

    @Override // j63
    public final n29 z(long j) {
        return new n29(((sh2) this.c).c[(int) j], r6.b[r7], null);
    }

    @Override // nc2
    public final void dismiss() {
    }

    public /* synthetic */ zg2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public zg2(cb3 cb3Var, long j) {
        this.a = (byte) 7;
        this.c = cb3Var;
        yve.f(cb3Var.d >= j);
        this.b = j;
    }

    public /* synthetic */ zg2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
