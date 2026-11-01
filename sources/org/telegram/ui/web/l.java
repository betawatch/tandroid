package org.telegram.ui.web;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.pz;
import org.telegram.messenger.rz;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.pr;
import org.telegram.ui.qt0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ l(int i10, long j10, int i11) {
        this.a = i11;
        this.c = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.la(this.c, this.b));
                    break;
                }
                break;
            case 1:
                k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    long j10 = this.b;
                    if (j10 < 0) {
                        int i10 = this.c;
                        long j11 = -j10;
                        if (!w3.V(wp.r1(i10).L0(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            pr prVar = new pr(bundle);
                            prVar.C0(wp.r1(i10).M0(j11));
                            T2.presentFragment(prVar);
                            break;
                        } else {
                            T2.presentFragment(new qt0(j11));
                            break;
                        }
                    } else {
                        T2.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
            case 2:
                rz.C(this.c).r0(pz.b("/privacy", this.b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            default:
                int i11 = this.c;
                long j12 = this.b;
                try {
                    SQLitePreparedStatement executeFast = is.a0(i11).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                }
        }
    }

    public /* synthetic */ l(long j10, int i10, int i11) {
        this.a = i11;
        this.b = j10;
        this.c = i10;
    }
}
