package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public interface tq0 {
    boolean a(int i7);

    File b(int i7);

    String c(int i7);

    TLObject d(int i7);

    boolean e(int i7);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i7);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i7);

    int j();
}
