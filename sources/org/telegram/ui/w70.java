package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class w70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.g3 I;
    public org.telegram.ui.Components.d90 b;
    public a3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.g90 v;
    public VideoPlayerHolderBase w;
    public w2 x;
    public int a = 0;
    public final org.telegram.ui.Components.z80 c = new org.telegram.ui.Components.z80();
    public final a0.i y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.l01 l01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
