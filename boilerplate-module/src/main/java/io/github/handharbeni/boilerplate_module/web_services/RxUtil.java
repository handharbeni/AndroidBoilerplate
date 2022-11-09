package io.github.handharbeni.boilerplate_module.web_services;

/**
 * Created by Munish Kapoor on 15/2/17.
 */

import rx.Subscription;

public class RxUtil {

    public static void unSubscribe(Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}
