package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class x60 implements Comparator {
    public static String a(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return ContactsController.formatName(user.first_name, user.last_name);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a((TLObject) obj).compareTo(a((TLObject) obj2));
    }
}
