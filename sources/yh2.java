// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yh2 extends n7c {
    public final d9c e;
    public final long f;
    public final b9c h;
    public String n;
    public zja r;
    public boolean s = false;

    public yh2(d9c d9cVar, long j, b9c b9cVar) {
        this.e = d9cVar;
        this.f = j;
        this.h = b9cVar;
        xh2 xh2Var = new xh2(this, (byte) 0);
        if (d9cVar.b) {
            xh2Var.run();
        } else {
            d9cVar.e.add(xh2Var);
        }
    }

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j = this.f;
        if (isEmpty && j != 0) {
            c6c c = c6c.c(1, R.drawable.msg_archive_hide, jb6.M0(2131751172, null));
            c.s = true;
            arrayList.add(c);
            arrayList.add(c6c.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            aq1.o(2131751171, null, arrayList);
        }
        ArrayList arrayList2 = this.e.d;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !sd2.n0(chat)) {
                i++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String I3 = gm.I3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String I32 = gm.I3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !hg9.s(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                    }
                }
                long j2 = chat.id;
                c6c c6cVar = new c6c(11);
                c6cVar.x = true;
                c6cVar.y = -j2;
                c6cVar.L(j == j2);
                arrayList.add(c6cVar);
            }
        }
        if (TextUtils.isEmpty(this.n) && i == 0) {
            c6c c2 = c6c.c(2, R.drawable.msg_channel_create, jb6.M0(2131751169, null));
            c2.r = true;
            arrayList.add(c2);
        }
        arrayList.add(c6c.C(null));
        zja zjaVar = this.r;
        if (zjaVar != null) {
            zjaVar.setVisibility(i > 5 ? 0 : 8);
        }
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131751168, null);
    }

    @Override // n7c
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        b9c b9cVar = this.h;
        if (i == 1) {
            b9cVar.a(null);
            finishFragment();
            return;
        }
        if (i != 2) {
            if (c6cVar.a == 12) {
                finishFragment();
                b9cVar.a(getMessagesController().L0(Long.valueOf(-c6cVar.y)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences d1 = oc7.d1();
        boolean z = e21.a;
        presentFragment(new u8(0));
        d1.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        yja t = this.simpleActionBar.t();
        getResourceProvider();
        zja a = t.a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q20(this, (byte) 6);
        this.r = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.r.setContentDescription(jb6.M0(2131745570, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.s) {
            d9c d9cVar = this.e;
            d9cVar.b = false;
            d9cVar.e.add(new xh2(this, (byte) 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
