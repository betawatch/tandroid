package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class u70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.n1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.o90 b;
    public a3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.r90 v;
    public VideoPlayerHolderBase w;
    public w2 x;
    public int a = 0;
    public final org.telegram.ui.Components.k90 c = new org.telegram.ui.Components.k90();
    public final a0.i y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.a11 a11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
